# HW5

## how to create a thread( 4 ways, write code)
Extend Thread, implement Runnable, implement Callable with FutureTask, and use a thread pool. Thread and Runnable do not directly return a result, while Callable can return a result and throw checked exceptions. In real projects, thread pools are usually preferred because they reuse threads and control resource usage.

```java
import java.util.concurrent.*;

class MyThread extends Thread {
    public void run() {
        System.out.println("Extends Thread: " + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Implements Runnable: " + Thread.currentThread().getName());
    }
}

class MyCallable implements Callable<Integer> {
    public Integer call() {
        System.out.println("Implements Callable: " + Thread.currentThread().getName());
        return 200;
    }
}

public class ThreadCreateDemo {
    public static void main(String[] args) throws Exception {
        new MyThread().start();

        new Thread(new MyRunnable()).start();

        FutureTask<Integer> task = new FutureTask<>(new MyCallable());
        new Thread(task).start();
        System.out.println(task.get());

        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(() -> System.out.println("Thread pool: " + Thread.currentThread().getName()));
        pool.shutdown();
    }
}
```

## thread lifecycle, how does thread transfer from one state to another
A Java thread has six main states: new, runnable, blocked, waiting, timed waiting, and terminated. A thread moves from new to runnable after start(), and it becomes terminated when run() finishes. It may enter blocked when waiting for a lock, waiting when calling wait() or join(), and timed_waiting when calling sleep(), timed wait(), or timed join().

```java
Thread t = new Thread(() -> {
    try {
        Thread.sleep(1000); // TIMED_WAITING
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
});

System.out.println(t.getState()); // NEW
t.start();
System.out.println(t.getState()); // RUNNABLE or TIMED_WAITING
t.join();
System.out.println(t.getState()); // TERMINATED
```

## how does thread pool work

A thread pool manages a group of reusable worker threads. When a task is submitted, the pool uses an idle core thread first, then puts tasks into a queue, and may create extra threads if the queue is full and the maximum pool size allows it. Reusing threads avoids the cost of constantly creating and destroying threads.

```java
ExecutorService pool = Executors.newFixedThreadPool(2);

for (int i = 0; i < 5; i++) {
    int taskId = i;
    pool.submit(() -> System.out.println("Task " + taskId + " by " + Thread.currentThread().getName()));
}

pool.shutdown();
```

## what is the potential problem for the newCachedThreadPool and newFixedThreadPool and why

newCachedThreadPool can create up to Integer.MAX_VALUE threads because its maximum pool size is almost unbounded. If too many tasks arrive at the same time, it may create too many threads and cause OutOfMemoryError. newFixedThreadPool has a fixed number of threads, but it uses an unbounded queue, so too many waiting tasks can also cause memory problems.

```java
ExecutorService cachedPool = Executors.newCachedThreadPool();
ExecutorService fixedPool = Executors.newFixedThreadPool(5);

// Safer option: define thread count and queue size manually.
ThreadPoolExecutor saferPool = new ThreadPoolExecutor(
        2,
        5,
        60,
        TimeUnit.SECONDS,
        new ArrayBlockingQueue<>(100)
);
```

## What Is Future?
Future represents the result of an asynchronous task. It lets us check whether the task is done, cancel the task, or get the result later. When using a Callable task, developers must use the future.get() method to retrieve the result, which blocks the main thread until the task finishes.


```java
ExecutorService pool = Executors.newSingleThreadExecutor();

Future<Integer> future = pool.submit(() -> 10 + 20);
System.out.println(future.get()); // blocks until result is ready

pool.shutdown();
```

## What Is CompletableFuture?
CompletableFuture is an enhanced Future introduced in Java 8. It supports asynchronous execution, result transformation, exception handling, and task combination. It is useful when we want to build async workflows without manually blocking on every step.

```java
CompletableFuture.supplyAsync(() -> "hello")
        .thenApply(String::toUpperCase)
        .thenAccept(System.out::println);
```

## Future vs CompletableFuture
Future is simple but limited because get() blocks and it does not support easy task chaining. CompletableFuture can chain tasks with thenApply(), thenCompose(), thenCombine(), and can handle errors with handle() or exceptionally(). CompletableFuture is usually better for complex asynchronous flows.

```java
Future<Integer> future = Executors.newSingleThreadExecutor().submit(() -> 100);
System.out.println(future.get());

CompletableFuture.supplyAsync(() -> 100)
        .thenApply(num -> num * 2)
        .thenAccept(System.out::println);
```

## Lock vs synchronized
synchronized is a Java keyword that automatically locks and unlocks a monitor. Lock, such as ReentrantLock, gives more control because we can try to acquire a lock, interrupt lock waiting, and use multiple Condition objects. synchronized is simpler, while Lock is better when advanced lock control is needed.

```java
Object obj = new Object();
synchronized (obj) {
    System.out.println("synchronized block");
}

Lock lock = new ReentrantLock();
lock.lock();
try {
    System.out.println("lock block");
} finally {
    lock.unlock();
}
```

## wait(), notify(), notifyAll(), join()
wait() makes the current thread release the object lock and wait. notify() wakes up one waiting thread, while notifyAll() wakes up all waiting threads waiting on the same object. join() makes one thread wait until another thread finishes.

```java
Object lock = new Object();

Thread waitingThread = new Thread(() -> {
    synchronized (lock) {
        try {
            lock.wait();
            System.out.println("woke up");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
});

waitingThread.start();

synchronized (lock) {
    lock.notifyAll();
}

waitingThread.join();
```
## commonly used CompletableFuture api and write demo code for each of them

### runAsync and supplyAsync
runAsync() is used for async tasks that do not return a value. supplyAsync() is used for async tasks that return a value. Both methods use the common ForkJoinPool by default unless we pass a custom Executor.

```java
CompletableFuture<Void> f1 = CompletableFuture.runAsync(() -> {
    System.out.println("No return value");
});

CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 100);

f1.join();
System.out.println(f2.join());
```

### thenApply and thenApplyAsync
thenApply() transforms the result of the previous stage. It may run in the same thread that completed the previous stage. thenApplyAsync() also transforms the result, but it usually runs asynchronously in another thread pool.

```java
CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10)
        .thenApply(num -> num * 2);

CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 10)
        .thenApplyAsync(num -> num * 3);

System.out.println(f1.join()); // 20
System.out.println(f2.join()); // 30
```

### handle and exceptionally
handle() runs whether the previous stage succeeds or fails, so it can process both the result and the exception. exceptionally() only runs when an exception happens. Both are commonly used to provide fallback values.

```java
CompletableFuture<Integer> handled = CompletableFuture.supplyAsync(() -> {
            int zero = 0;
            return 10 / zero;
        }).handle((result, ex) -> {
            if (ex != null) {
                return 0;
            }
            return result;
        });

CompletableFuture<Integer> recovered = CompletableFuture.supplyAsync(() -> {
            int zero = 0;
            return 10 / zero;
        }).exceptionally(ex -> 0);

System.out.println(handled.join());
System.out.println(recovered.join());
```

### thenCompose and thenCombine
thenCompose() is used when the next async task depends on the previous result. It avoids nested CompletableFuture<CompletableFuture<T>>. thenCombine() is used when two independent async tasks can run separately but their results need to be combined.

```java
CompletableFuture<String> composed = CompletableFuture.supplyAsync(() -> "userId-1")
        .thenCompose(id -> CompletableFuture.supplyAsync(() -> "User info for " + id));

CompletableFuture<Integer> price = CompletableFuture.supplyAsync(() -> 100);
CompletableFuture<Integer> tax = CompletableFuture.supplyAsync(() -> 8);

CompletableFuture<Integer> total = price.thenCombine(tax, (p, t) -> p + t);

System.out.println(composed.join());
System.out.println(total.join());
```

### allOf and anyOf
allOf() waits until all CompletableFuture tasks finish, but it returns CompletableFuture<Void>, so we need to get each result separately. anyOf() finishes when the first task finishes and returns that first result. allOf() is useful when every task matters, while anyOf() is useful when we only care about the fastest result.

```java
CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "A");
CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "B");

CompletableFuture<Void> all = CompletableFuture.allOf(f1, f2);
all.join();
System.out.println(f1.join() + f2.join());

CompletableFuture<Object> any = CompletableFuture.anyOf(f1, f2);
System.out.println(any.join());
```