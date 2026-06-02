prompt: java 8,11,17, 21 features

answer:

如果是 Java 面试，通常会被问到 **Java 8 → 11 → 17 → 21** 每个 LTS 版本带来了什么重要特性。

---

# Java 8 (2014)

这是最重要的一次升级，现在很多公司仍然以 Java 8 为基础。

### 1. Lambda Expression

让函数可以作为参数传递。

```java
List<String> names = Arrays.asList("Tom", "Jerry");

names.forEach(name -> System.out.println(name));
```

之前：

```java
for(String name : names){
    System.out.println(name);
}
```

---

### 2. Stream API

用于函数式数据处理。

```java
List<Integer> result =
    nums.stream()
        .filter(n -> n > 5)
        .map(n -> n * 2)
        .collect(Collectors.toList());
```

常见操作：

```java
filter()
map()
sorted()
distinct()
reduce()
collect()
```

---

### 3. Optional

避免 NullPointerException。

```java
Optional<String> name =
        Optional.ofNullable(getName());

System.out.println(
        name.orElse("Unknown"));
```

---

### 4. Functional Interface

```java
@FunctionalInterface
public interface Calculator {
    int add(int a, int b);
}
```

常见接口：

```java
Predicate<T>
Function<T,R>
Consumer<T>
Supplier<T>
```

---

### 5. Default Method

接口可以有实现。

```java
interface Vehicle {

    default void start() {
        System.out.println("Starting");
    }
}
```

---

### 6. CompletableFuture

异步编程。

```java
CompletableFuture
    .supplyAsync(() -> "Hello")
    .thenApply(String::toUpperCase)
    .thenAccept(System.out::println);
```

---

# Java 11 (2018)

Java 11 是第二个长期支持版（LTS）。

---

### 1. var in Lambda

```java
(var x, var y) -> x + y
```

---

### 2. New String APIs

```java
str.isBlank();

str.lines();

str.repeat(3);

str.strip();
```

例子：

```java
"abc".repeat(3);
```

输出：

```java
abcabcabc
```

---

### 3. HttpClient API

替代 HttpURLConnection。

```java
HttpClient client =
        HttpClient.newHttpClient();

HttpRequest request =
        HttpRequest.newBuilder()
                   .uri(URI.create(url))
                   .build();

HttpResponse<String> response =
        client.send(
            request,
            HttpResponse.BodyHandlers.ofString());
```

---

### 4. Files Utility Methods

```java
String content =
        Files.readString(path);

Files.writeString(path, content);
```

---

# Java 17 (2021)

目前很多企业正在使用 Java 17。

---

### 1. Sealed Classes

限制继承。

```java
public sealed class Shape
    permits Circle, Rectangle {
}
```

只有：

```java
Circle
Rectangle
```

可以继承。

---

### 2. Switch Expression

以前：

```java
switch(day){
    case MONDAY:
        return 1;
}
```

现在：

```java
int result = switch(day){
    case MONDAY -> 1;
    case TUESDAY -> 2;
    default -> 0;
};
```

---

### 3. Pattern Matching for instanceof

以前：

```java
if(obj instanceof String){
    String s = (String)obj;
}
```

现在：

```java
if(obj instanceof String s){
    System.out.println(s.length());
}
```

---

### 4. Record

快速创建 DTO。

```java
public record Employee(
        String name,
        int age) {
}
```

自动生成：

```java
constructor
getter
equals
hashCode
toString
```

---

### 5. Text Blocks

多行字符串。

```java
String json = """
{
  "name":"Tom",
  "age":20
}
""";
```

---

# Java 21 (2023)

当前最新 LTS，越来越多公司开始迁移。

---

### 1. Virtual Threads ⭐

最重要特性。

传统线程：

```java
Thread thread =
    new Thread(task);
```

Virtual Thread：

```java
Thread.startVirtualThread(
    () -> doWork()
);
```

---

优势：

```text
传统线程：
几千个线程就很重

Virtual Thread：
几十万线程也可以
```

特别适合：

```text
Web Server
Microservices
Database Calls
IO Operations
```

---

### 2. Structured Concurrency

多个任务统一管理。

```java
try (var scope =
        new StructuredTaskScope.ShutdownOnFailure()) {

    Future<String> user =
            scope.fork(this::getUser);

    Future<String> order =
            scope.fork(this::getOrder);

    scope.join();

}
```

类似：

```text
父任务管理所有子任务
```

---

### 3. Record Patterns

结合 Record 解构。

```java
record Point(int x, int y){}
```

```java
if(obj instanceof Point(int x, int y)){
    System.out.println(x);
}
```

---

### 4. Pattern Matching for Switch

```java
switch(obj){

    case String s ->
        System.out.println(s);

    case Integer i ->
        System.out.println(i);

    default ->
        System.out.println("Unknown");
}
```

---

### 5. Sequenced Collections

统一处理顺序集合。

```java
list.getFirst();
list.getLast();
```

---

# 面试 30 秒总结

**Java 8**

* Lambda
* Stream API
* Optional
* Functional Interface
* CompletableFuture

**Java 11**

* HttpClient
* String APIs
* Files.readString/writeString
* var in Lambda

**Java 17**

* Record
* Sealed Class
* Switch Expression
* Pattern Matching for instanceof
* Text Block

**Java 21**

* Virtual Threads
* Structured Concurrency
* Record Pattern
* Pattern Matching for Switch
* Sequenced Collections