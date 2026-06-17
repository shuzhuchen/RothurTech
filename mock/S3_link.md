## Mock for 06/16/2026
https://mock0616-237462387123-us-east-1-an.s3.us-east-1.amazonaws.com/mock0616.mov?response-content-disposition=inline&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEM3%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJHMEUCIQD7QONbpNNFJxyZaDuKcFuHybXcCDSP3zgGhqrpaOjlpwIgTBBG%2FnROc9vypnSY6od6FA8UDq1paXPIgBw35gQfw1UqwgMIlv%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARAAGgwyMzc0NjIzODcxMjMiDPmtnOBy8CJCfATvLSqWA6uHGLKfi7F%2Bcl3k6KRWE0Dfv8wgKArqxkSD9n9dyJafiEeRPat68OpAnzN3jfXWNYrrxUsJWFwWM2qyKzvfcW3IEyENJOzUBtxti56MMqO9Z3L9EXpqa0ADKyzVTYe0Hq0LwWUWptqkqRqEzIALWz72FHpuvAg%2BJFalHFCqM%2FBQAPOE8XNHop9kMz7ajV2l2tQa09NdOp6mMP%2Fmhy%2Bh6jLYsdQFD2qEExzKsi5iDkPMv8u9PHHTOtr4lUEeryUsRDEw6e641SQMfwc348hKgQUVMXMLutfvtGS49MEcvgAs2jA6f5jhdqVyiHd10RQ1gAwjCnEtiyKS2XTn9%2BnUivU61nWYr47sTsT1hShtXnlL%2FECwH5bDqeHRfkXduv7c9OqP3vRt6jSgJ2RLSHJFWnJPZXW%2B9zvFIb1GZfirmJlUha2XYkacsj4hlSYot5OvzEtVz8FvC1U7kYAe47J%2F%2BrJWP0cUXClyndl2AE45XcLkli%2Bx%2FO2ToZTGWd7eT%2B%2FZfGOWT1SzizxJIQvkO9X8yRXsn60zW6Mw%2FYnM0QY63gLvjkNqY63oKwJmlCrXho6AK%2FZOEhjOnVJMM5SoeN%2BrNVjvuEIOBU6%2BiupHy9l8c%2Ftvpr7czwvbkyXMcx2%2FZBb5H4TTa42w4vtBhoIkvfLLSRqQMlMtAKyhQT0n%2BXhB5nTKfyXpYuna0dbA8ho6RxV9nUd6WGTbYb48CnslkJcq9BZyg%2BVcNNnFoSo%2BtT6rVs%2Fx8n4W9xxvvbdU9bbDaI06Uo5%2B5dikQwWqyYd9GOAw964nVj7kuOd0%2BRJVHgrogGTUj%2BVP8rDEfV04nyXxOgYfDoVp0gCohIfS%2BTOVDGhqzx7zV6IRBSJX0LtBBSHutFeznNM%2BXUQKmuCgdz31jwKkBG%2FbiJgbxTR3SNhe3X3KKH2GI2C%2B%2FMajgi4Jh9Sm%2BUoAsIsfztHrCpeOPpiTOdh8ZjcTzy3lMj2tUMVORutWwlXMt3wsvyIFED6%2FVVIbXozE1kZlDndaxTlAXarreg%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIATOSO4PGZQT2HTAGM%2F20260617%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20260617T203702Z&X-Amz-Expires=43200&X-Amz-SignedHeaders=host&X-Amz-Signature=f4676148956441d86ebe50e0493118a67e4c3aead915ddcff2d38fb56fe8550d

### if we override hashcode not overriding equals
When we use hash-based data structures such as HashMap, HashSet, or ConcurrentHashMap, hashCode() is used to find the bucket, and equals() is used to compare objects inside the bucket.

If we override hashCode() but do not override equals(), two logically equal objects may end up being treated as different keys after a hash collision.

As a result, instead of updating an existing value, HashMap may create a new entry, which can lead to duplicate logical keys.

### how you write restapi in spring boot
To write REST APIs in Spring Boot, I first create a controller using @RestController, which is equivalent to @Controller plus @ResponseBody.

Then I use @RequestMapping to define the base URL. The URL should use nouns instead of verbs, and we usually include a version such as /api/v1/students.

For CRUD operations, I use HTTP methods such as GET, POST, PUT, and DELETE through annotations like @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping.

For requests, I can use @RequestHeader, @RequestBody, @RequestParam, and @PathVariable depending on where the data comes from.

For validation, I use @Valid together with validation annotations such as @NotNull, @Min, @Max, and @Email on the request DTO.

For responses, I usually return ResponseEntity so I can control both the response body and HTTP status code.

For exception handling, I typically use @RestControllerAdvice as a global exception handler, which is implemented using AOP.

### what is thread state
ava has six thread states.

A thread starts in the NEW state when we create a Thread object.

After we call start(), it moves to RUNNABLE. RUNNABLE means the thread is ready to run or currently running.

If a thread is waiting for a synchronized lock, it enters BLOCKED.

If it waits indefinitely for another thread, such as calling wait() or join(), it enters WAITING.

If it waits for a specific amount of time, such as sleep() or wait(timeout), it enters TIMED_WAITING.

When the run() method finishes, the thread enters TERMINATED.

### what is thread local
ThreadLocal provides a separate copy of a variable for each thread.

Instead of sharing the same variable, each thread stores its own value.

It is commonly used for request context, user information, trace IDs, transaction context, and logging information.

Internally, each thread maintains a ThreadLocalMap. The ThreadLocal object acts as the key, and the value is stored inside the current thread.

When using thread pools, we should call remove() in a finally block to avoid stale data and memory leaks.

### what is CORS
CORS stands for Cross-Origin Resource Sharing.

It is a browser security mechanism that controls whether a frontend application can access resources from another origin.

An origin consists of protocol, domain, and port. For example, localhost:3000 calling localhost:8080 is cross-origin because the port is different.

Browsers block many cross-origin requests by default.

In Spring Boot, we can enable CORS using @CrossOrigin or a global CORS configuration. Spring will automatically add the required response headers.

### Map vs filter
Both map() and filter() are part of the Stream API.

filter() is used to keep or remove elements based on a condition. It accepts a Predicate functional interface and does not change the element type.

map() is used to transform one object into another. It accepts a Function functional interface and may change the element type.

Both are commonly written using lambda expressions.

For example, filter() can keep users older than 30, while map() can convert User objects into user names.

### how to send request from angular to backend
In Angular, I use HttpClient to send requests to the backend.

I inject HttpClient into a service and then use methods such as get(), post(), put(), and delete().

HttpClient works asynchronously and returns an Observable.

When we call subscribe(), Angular sends the request and processes the response when it arrives.

If the frontend and backend run on different origins, the backend must configure CORS to allow the request.

In real projects, I often use HTTP interceptors to add authentication tokens and handle common errors.

### what is pattern matching
Pattern matching is a feature introduced in newer Java versions to simplify type checking and casting. Before pattern matching, we had to check the type and then manually cast it.
```
if (obj instanceof String) {
    String s = (String) obj;
    System.out.println(s.toLowerCase());
}
```
with pattern matching:
```
if (obj instanceof String s) {
    System.out.println(s.toLowerCase());
}
```
Java automatically performs the cast for us. In Java 21, pattern matching is also supported in switch statements, making code cleaner and easier to read when handling multiple object types.

### Spring boot actuator
Spring Boot Actuator provides endpoints for monitoring and managing a Spring Boot application.

To use it, we add the Actuator dependency and configure which endpoints should be exposed.

Common endpoints include health checks, application information, metrics, and environment details.

In production, I only expose the endpoints that are needed and secure sensitive endpoints.

Actuator is commonly used together with Micrometer, Prometheus, and Grafana for application monitoring and visualization.

## Mock for 06/15/2026
https://mock0615-237462387123-us-east-1-an.s3.us-east-1.amazonaws.com/mock0615.mov?response-content-disposition=inline&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjELb%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJGMEQCIDKfQ%2BS8ic9ysopST1SBzUYKZim07knvr0ekFxQcXTDhAiByTdXh06VzoWyDe6IWJTlmWnBZBXzUSCoqFDp%2ByaKlECq5Awh%2FEAAaDDIzNzQ2MjM4NzEyMyIMto%2FZCSTUsVih%2ByRaKpYDTqPFFkrzqUkNNf08LrTtep2CjA8npLGlLudkQ%2FdbGvHoHan4mzIa0MMPtSCXvJm3YciGvT1WO0lAA5JNcGxhc2HXdYVLDNrKdynHRWJRdZ2dJLtaUDYoJr3%2BL1srPhsN73OuTRIoBNTSrN3XekDOukCz9kPnghcGxj%2BBvI4bv3CLtHeazTTq8H68sN0z7eCkhCfDLib41fta1jlbu%2B5U1BXfVxjLTJf6nxP11S1rkV%2F8GQgkQKMrGuRgu285ZGlk2m7xd8tQ5oEhsDImPVjY%2FA%2B%2BKpjHLpAS1oAaSLCBXE2UBv4d912YqROyQINfAYYUmqYhswzaEglhmm75sxcUUIIMj4%2Bb364zwWYS8lEWaT8hqyg8yEoyW7t0YvwDhLo%2BD2y59SQgQ2IWNzwYPy4qg%2FDk666%2Fikbew94oda4lFE%2BDY8D6pe635BaWSo4BV9FSKzsEnIS%2BNX18JdcBTxkz4RvrZ0AN%2B0j3KwlhUFflNzBESZ%2BG67T%2FCSfpP4zywuK6Itg4Dqb4aeAgbg8nIysqYqJGvkaKkjCaicfRBjrfAhGrnpmDYfU1OXGFsPadZsIFLPcYW91kZs6vPOsjjLaFWc99hWpwWqUdDTvYmhhA4M94x5izzw2UhtLv3eVspQdr4tRj4StUUNlrW7oVRNEGuF%2BarW7L%2B08K4W3ktsBwO0XDMrmPRRiCZ%2FY%2FpUM1rlhTwMGVhfLdGYcYY1NHvgD0fZhlqNoeNky58JSDehGnuyn9J7pT1%2F8Sz%2FSQg9yg9RBgAQ66F4t2XqGJ1TWGjxwoP3KKlJh2iTh2lpj0Yj7JHt5TlAzMClJaiAA2LEX4VJ2%2BRYNhRt7cXj2WahP%2BE98zauOn5NXiB2Ak2Z3E3fCEv7VCNPXsRxxlmf6BKRxaUQLKKPADeWYRcYGRBvwuj9Pdycq%2BuWTSt1XH%2BpwhHjBk9c2K8M0RWbv8ZmqPlGwOaL8iuN%2BnkEwAgLtS88nC60eI0GUmlbfgUud9EmRCSLyYMmFlsZOd0A%2F1i%2BIfiqn4qg%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIATOSO4PGZ5JHP2JHL%2F20260616%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20260616T215051Z&X-Amz-Expires=43200&X-Amz-SignedHeaders=host&X-Amz-Signature=38332792eb66488ae9a737811ac485cfe78f844cf5fe12de3a5aa07e6b23d7e8

### how to increase young generation size in heap
To increase the young generation size, we can set JVM options like `-Xmn`.

Another common way is to increase the total heap size with `-Xms` and `-Xmx`. After the heap becomes larger, the JVM can also give more space to the young generation based on the GC configuration.

In practice, I would first check the GC logs and memory usage. If many short-lived objects are causing frequent minor GCs, then I would increase the young generation size or adjust the heap size carefully.

### how does spring mvc work 
Spring MVC follows the request and response model. When a client sends an HTTP request, the request first goes to `DispatcherServlet`. It works like the front controller.

Then `DispatcherServlet` finds the right controller method based on the URL and HTTP method. The controller usually calls the service layer for business logic, and the service layer may call the repository layer to work with the database.

After that, the controller returns the result. In a REST API, the response is usually JSON.

### how do you handle exception in java
In Java, I usually handle exceptions with `try-catch-finally`, or declare them with `throws` if the caller should handle them.

For checked exceptions, Java forces us to handle them at compile time. For unchecked exceptions, I usually do not catch them everywhere. In a Spring Boot project, I prefer to use `@RestControllerAdvice` and `@ExceptionHandler` to handle them globally and return a consistent error response.

Also, when working with resources like files or streams, I use try-with-resources so they can be closed automatically.

### rest api vs message queue 
REST API is usually synchronous. The client sends a request and waits for the response.

Message queue is asynchronous. The producer sends a message to the queue, and the consumer can process it later.

REST API is good when we need an immediate result, like getting user information or submitting a form. Message queue is better for background tasks, decoupling services, or handling traffic spikes.

For example, creating an order can be a REST API call, but sending an email notification after the order is created can be done through a message queue.

### what annotations we use to configure customized actuator
For a custom Actuator endpoint, I can create a class with `@Endpoint` and `@Component`. `@Endpoint` defines the endpoint id, and `@Component` makes it a Spring bean.

Inside the class, I can use `@ReadOperation`, `@WriteOperation`, and `@DeleteOperation` to define what the endpoint can do. For web requests, they usually map to GET, POST, and DELETE.

Finally, I need to expose the endpoint in `application.properties` or `application.yml`, for example by adding the endpoint id to `management.endpoints.web.exposure.include`.

### can abstract class have no abstract method
Yes, an abstract class can have no abstract methods.

The reason is that `abstract` also means the class cannot be instantiated directly. It can still provide shared fields or common methods for subclasses. But if a class has at least one abstract method, then the class must be declared as abstract.

### how can you use optional
`Optional` is a container that may or may not have a value. I use it to make null handling more clear and reduce `NullPointerException`.

For example, I can use `Optional.of(value)` when the value is not null, `Optional.ofNullable(value)` when the value may be null, and `Optional.empty()` when there is no value.

When reading the value, I can use `orElse(defaultValue)`, `orElseThrow()`, or `ifPresent()`. In real projects, I usually use `Optional` as a return type when a result may not exist, but I try not to overuse it for fields or method parameters.

### What is functional interface?
A functional interface is an interface with only one abstract method.

It is mainly used with lambda expressions. For example, `Function`, `Consumer`, `Supplier`, and `Predicate` are common functional interfaces in Java.

We use them a lot in the Stream API, such as `filter`, `map`, and `forEach`, because we can pass behavior into those methods.

### Why do you use post, instead of put
I use POST when I want to create a new resource or trigger an operation where the server decides the result.

I use PUT when I want to update or replace an existing resource, usually when the resource id is already known.

The main difference is idempotency. PUT should be idempotent, so calling it multiple times should produce the same final result. POST is usually not idempotent. If I call the same POST API multiple times, it may create multiple records.

### what is webflux? Have you used it in your project
Spring WebFlux is Spring's reactive web framework. It is used to build non-blocking and asynchronous applications.

Compared with Spring MVC, WebFlux does not use the traditional thread-per-request model in the same way. It uses non-blocking I/O, so a small number of threads can handle many I/O-bound requests.

In WebFlux, `Mono` represents zero or one result, and `Flux` represents multiple results.

I have not used WebFlux deeply in my project. Most of my project experience is with Spring MVC and REST APIs. But I understand WebFlux is useful for high-concurrency cases, streaming, or services that call many external APIs.


### what is hashmap? 
`HashMap` is a key-value data structure in Java. The key must be unique, but values can be duplicated.

Internally, `HashMap` uses an array of buckets. It uses the key's `hashCode()` to decide where to put the entry. If multiple keys go to the same bucket, that is a hash collision.

Before Java 8, collisions were mainly handled by a linked list. Since Java 8, if the list becomes too long, it can be changed to a red-black tree to improve performance.

If we use a custom object as the key, we should override both `equals()` and `hashCode()`.

### what is enable auto configuration
`@EnableAutoConfiguration` is a Spring Boot annotation. It tells Spring Boot to configure the application automatically based on the dependencies, existing beans, and configuration properties.

For example, if we add Spring Data JPA and a database driver, Spring Boot can automatically create a `DataSource`, configure JPA, and set up transaction management.

Normally, we do not add `@EnableAutoConfiguration` directly because `@SpringBootApplication` already includes it.

## Mock for Restful endpoints design
https://restfulmock-237462387123-us-east-1-an.s3.us-east-1.amazonaws.com/restfulmock.mov?response-content-disposition=inline&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEJ7%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJIMEYCIQDAZ5QbRm71M5SzAW3IP%2Bs%2Fzzh4dfPijOcHeEqsCmI7zwIhAPxE6ORm1S7OporvQWiSlgNc8UvlSKm6JqsZsYcnpDtfKrkDCGcQABoMMjM3NDYyMzg3MTIzIgz7sGaznHmgDpbRZ9MqlgOextDIVTVham%2BNrKk7hRE241AJ%2F72pzLMAu%2Fkw8ajznj3gciHX31GCNY6T0qbeEv2%2B9fG9ayIyLIyHn5h%2BXlnkfvRa7fc6StQYWxJIVQMwFTZe2giF%2FEVFdpG%2F%2BatE7JmhbpDmgmgn8LIuFAH0W7vgVNHpHD930uJd1RkeXifnZk0eCjK58mAmRaiwKn%2BqqyjI2VRfTflKE7SO7bmCTUv0jivv90zTDChZ02L9c7pC38LTHcd9F0pZyWwnsEMI%2F8OQyoMasK3nLXAmlEKzQrgXA2KVan2TVbIqLK1Olmb%2F%2BxZ8FaGEwUgpqYL3rkEYxb9LPo%2Blt6sK%2FzJd4XBr%2F5iEVj2z6qDtMMBr3TqbD09RFz9gbUf3ENrbbZVT5jCBnFus5vKMv%2BqqkWO%2FpiHevwCxmuMMq11Bj%2F%2FNmHhT8Fpb3g94gd3j%2FJS4VsDsnrR8axDfEO47bETOZr68nZn0xqrmNQVj3rce1odhDRcP7QO9ZXOSGYz4%2BJOhEjxucnKUNtbTbb%2Ff6LcPuVFmp%2BDhPK%2BY7g%2F6DaogMJ%2FiwdEGOt0CxFYviaS%2Fk6tIgmpzDbSm76Qi7m0LeisgZpyne7vLsdjtm2%2BwEo73DcXwetIOvu1RjS%2FllkDHN8PblL3tuugGy9t1HYnFV8MtH%2Bi9mY8TSHfN0dnM4UagKkanUpVdJbVRUOY9RV29Oj8pANvyjFHbDAPGFcZt7nNRc%2B%2Ff5WqDOLTr5U%2FphbJXGG2Hfvs0Ha5MaCDp6hxSMhrIl6vaUDpa6zm%2Fr%2FyZ3zaccNemPFoDjW0CTfl9kToqDizzLkbCK5l1f3qnk4GlCFyXv%2FC18PdvLhvAJ6Bo6iPjo3464609G9XLFyjaV0nyuDTzuskYSsGn8mWbiLpVk2kfw1%2F9p0RuqLiwXZaQbgTU%2FICN9Lfn0ESuTeUgcnwhL4Wqeynfcs%2F%2FcRsNt4iWq1EWyNNyt5WmOSZasY2t94aSGxd75gx35r5OVeIYu8%2BL8JOCOG4NM19H4VFJbs9YTkUL21TLZA%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIATOSO4PGZ7DW2GCRL%2F20260615%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20260615T214237Z&X-Amz-Expires=43200&X-Amz-SignedHeaders=host&X-Amz-Signature=cf81f8e806fd1a4fb3d1a23e15c4627fd9de0c6ecb59a384e95263e736ca1602

## Mock for 06/12/2026
S3 link: https://mock0612-237462387123-us-east-1-an.s3.us-east-1.amazonaws.com/mock0612.mp4?response-content-disposition=inline&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEJ7%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJIMEYCIQDAZ5QbRm71M5SzAW3IP%2Bs%2Fzzh4dfPijOcHeEqsCmI7zwIhAPxE6ORm1S7OporvQWiSlgNc8UvlSKm6JqsZsYcnpDtfKrkDCGcQABoMMjM3NDYyMzg3MTIzIgz7sGaznHmgDpbRZ9MqlgOextDIVTVham%2BNrKk7hRE241AJ%2F72pzLMAu%2Fkw8ajznj3gciHX31GCNY6T0qbeEv2%2B9fG9ayIyLIyHn5h%2BXlnkfvRa7fc6StQYWxJIVQMwFTZe2giF%2FEVFdpG%2F%2BatE7JmhbpDmgmgn8LIuFAH0W7vgVNHpHD930uJd1RkeXifnZk0eCjK58mAmRaiwKn%2BqqyjI2VRfTflKE7SO7bmCTUv0jivv90zTDChZ02L9c7pC38LTHcd9F0pZyWwnsEMI%2F8OQyoMasK3nLXAmlEKzQrgXA2KVan2TVbIqLK1Olmb%2F%2BxZ8FaGEwUgpqYL3rkEYxb9LPo%2Blt6sK%2FzJd4XBr%2F5iEVj2z6qDtMMBr3TqbD09RFz9gbUf3ENrbbZVT5jCBnFus5vKMv%2BqqkWO%2FpiHevwCxmuMMq11Bj%2F%2FNmHhT8Fpb3g94gd3j%2FJS4VsDsnrR8axDfEO47bETOZr68nZn0xqrmNQVj3rce1odhDRcP7QO9ZXOSGYz4%2BJOhEjxucnKUNtbTbb%2Ff6LcPuVFmp%2BDhPK%2BY7g%2F6DaogMJ%2FiwdEGOt0CxFYviaS%2Fk6tIgmpzDbSm76Qi7m0LeisgZpyne7vLsdjtm2%2BwEo73DcXwetIOvu1RjS%2FllkDHN8PblL3tuugGy9t1HYnFV8MtH%2Bi9mY8TSHfN0dnM4UagKkanUpVdJbVRUOY9RV29Oj8pANvyjFHbDAPGFcZt7nNRc%2B%2Ff5WqDOLTr5U%2FphbJXGG2Hfvs0Ha5MaCDp6hxSMhrIl6vaUDpa6zm%2Fr%2FyZ3zaccNemPFoDjW0CTfl9kToqDizzLkbCK5l1f3qnk4GlCFyXv%2FC18PdvLhvAJ6Bo6iPjo3464609G9XLFyjaV0nyuDTzuskYSsGn8mWbiLpVk2kfw1%2F9p0RuqLiwXZaQbgTU%2FICN9Lfn0ESuTeUgcnwhL4Wqeynfcs%2F%2FcRsNt4iWq1EWyNNyt5WmOSZasY2t94aSGxd75gx35r5OVeIYu8%2BL8JOCOG4NM19H4VFJbs9YTkUL21TLZA%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIATOSO4PGZ7DW2GCRL%2F20260615%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20260615T214327Z&X-Amz-Expires=43200&X-Amz-SignedHeaders=host&X-Amz-Signature=8abf3f4bf1a7a75359bd393bd7dec509489f9cf3303ebb25109eaa197a8164d3

### 1. Can You Introduce the Spring Framework?

```text
1. Core Features
   - IoC
   - AOP

2. Evolution
   Spring Framework
        ↓
   Spring MVC
        ↓
   Spring Boot

3. Key Difference
   Spring -> manual configuration
   Spring MVC -> annotation introduced
   Spring Boot -> fully annotation driven
```

> Spring Framework is a Java enterprise framework, and the two core ideas I usually mention are IoC and AOP.
>
> IoC lets Spring manage object creation and dependency injection for us. AOP helps move cross-cutting concerns, like logging and exception handling, away from the main business logic.
>
> If we look at its evolution, Spring Framework came first, then Spring MVC, and later Spring Boot. In the earlier Spring days, developers had to write a lot of manual configuration. BeanFactory existed, but in modern web projects, ApplicationContext is used much more often.
>
> With Spring MVC, annotations like `@Controller` and `@RequestMapping` became very common. Spring Boot made development even easier by adding auto-configuration, embedded Tomcat, starter dependencies, and a mostly annotation-driven programming model.

### 2. Which Spring Boot Versions Have You Used?
```text
Spring Boot 2
  - Java 8/11/17

Spring Boot 3
  - Java 17+
  - javax -> jakarta

Recent project
  - Spring Boot 3 + Java 17
```
> I have worked with both Spring Boot 2 and Spring Boot 3.
>
> Spring Boot 2 is commonly used with Java 8, Java 11, or Java 17. In my recent projects, I mainly used Spring Boot 3 with Java 17.
>
> One important change in Spring Boot 3 is the migration from the `javax.*` namespace to the `jakarta.*` namespace. Because of that change, Spring Boot 3 requires Java 17 or above.

### 3. How Do You Define Profiles in Spring Boot?
```text
Purpose
  DEV / QA / PROD

Ways
  - properties
  - yaml

Activation
  - properties
  - env variable
  - JVM args

Annotation
  @Profile("DEV")
  @Profile("!DEV")
```
> In Spring Boot, profiles are used to manage environment-specific configuration, such as dev, QA, and production settings.
>
> I usually define them with either `application.properties` or `application.yml`. For example, I might have `application-dev.properties` and `application-prod.properties`.
>
> A profile can be activated through a config file, an environment variable, or JVM arguments.
>
> I also use the `@Profile` annotation on beans when I only want certain beans to be loaded in a specific environment.

### 4. Which Discovery Service Have You Used Before?
```text
Eureka

Service Registry

Startup
  register

Shutdown
  deregister

Annotations
  @SpringBootApplication
  @EnableEurekaClient
```
> I have used Eureka in a microservice project.
>
> Eureka works as a centralized service registry where services can register themselves.
>
> When a Spring Boot application starts, it registers itself with Eureka. If the service goes down, it will be removed from the registry.
>
> This allows services to find each other dynamically instead of relying on hardcoded hostnames or ports.
>
> Usually, I enable it by adding `@EnableEurekaClient` together with `@SpringBootApplication`.

### 5. What Is AOP?
```text
Purpose
  cross-cutting concerns

Style 1
  @RestControllerAdvice

Style 2
  @Aspect
  @Pointcut

WHERE
  Pointcut

WHEN
  Before
  After
  Around
```
> AOP stands for Aspect-Oriented Programming.
>
> The main purpose is to separate cross-cutting concerns from business logic, so we do not repeat the same code in many places.
>
> In real projects, I mainly use it in two ways.
>
> The first one is `@RestControllerAdvice`, which is useful for global exception handling at the controller layer.
>
> The second one is aspect-based AOP with `@Aspect` and `@Pointcut`.
>
> The pointcut defines where the extra logic should be applied, and advice annotations like `@Before`, `@After`, and `@Around` define when it should run.
>
> Common use cases include logging, exception handling, security checks, and performance monitoring.


### 6. How Does a Request Flow from Frontend to Database in Spring Boot?
```text
Browser
 ↓
Controller
(restful endpoint)
 ↓
Service
(interface + impl)
 ↓
DAO
(JPA / Mongo / DynamoDB)
 ↓
Database

ResponseEntity
 ↓
Tomcat
 ↓
Browser
```
> I usually follow a three-layer architecture.
>
> The request starts from the browser and first reaches the controller layer, where I expose RESTful endpoints and receive HTTP requests.
>
> Then the controller passes the request to the service layer, which contains the business logic. I usually use an interface plus implementation pattern to keep the design flexible.
>
> After that, the service calls the DAO or repository layer, which communicates with the database. For SQL databases, I typically use Spring Data JPA. For NoSQL databases, I may use Spring MongoDB or AWS DynamoDB libraries.
>
> After the database operation finishes, the result goes back through the service and controller layers. I usually wrap the response with `ResponseEntity`, and Tomcat sends the final HTTP response back to the browser.


### 7. Can You Describe Spring MVC?
```text
MVC
  Model
  View
  Controller

Example
  GET /employee/1
  PUT /employee/1

Core
  DispatcherServlet

Route
  URL + HTTP Method
```
> Spring MVC stands for Model-View-Controller.
>
> The core component in Spring MVC is DispatcherServlet, which acts as the front controller.
>
> When a request like GET `/employee/1` or PUT `/employee/1` comes in, DispatcherServlet receives it first and decides which controller method should handle it based on the URL and HTTP method.
>
> The controller processes the request, calls the service and repository layers when needed, and then returns either a view or JSON data.
>
> Spring MVC handles the routing and dispatching work for us, so developers can focus more on business logic.

### 8. How Do You Validate Input Data?
```text
Step 1
Validation Rule

@NotNull
@NotEmpty
@Email
@Min
@Max

Step 2
@Valid
```
> I usually validate input data in two steps.
>
> First, I define validation rules on DTOs, entities, or model classes with annotations like `@NotNull`, `@NotEmpty`, `@Email`, `@Min`, and `@Max`.
>
> Second, I enable validation in the controller by using the `@Valid` annotation.
>
> When the input is invalid, Spring performs validation automatically and returns validation errors before the request reaches the business logic layer.

### 9. How Do You Use Spring Boot Actuator?
```text
1. Dependency

2. Expose Endpoint
   /health
   /beans
   /cache

3. Prometheus

4. Grafana
```
> I usually set up Spring Boot Actuator in four steps.
>
> First, I add the `spring-boot-starter-actuator` dependency.
>
> Second, I configure which endpoints should be exposed in the application properties file. Common endpoints include health, beans, metrics, and cache information.
>
> Third, I send those metrics to a time-series database like Prometheus.
>
> Finally, I configure Prometheus as the data source for Grafana, so the metrics can be shown on dashboards.
>
> In production, I only expose the endpoints that are really needed, mainly for security reasons.

---

### 10. How Does Spring MVC Work?
```text
Browser
 ↓
DispatcherServlet
 ↓
HandlerMapping
 ↓
Controller
 ↓
Service
 ↓
Repository
 ↓
Database
 ↓
Response
```
> Spring MVC is centered around DispatcherServlet, which acts as the front controller.
>
> When a request comes in, DispatcherServlet receives it first and asks HandlerMapping to find the matching controller method based on the URL and HTTP method.
>
> The controller then processes the request and calls the service layer. If database access is needed, the service layer talks to the repository layer.
>
> Once the processing is done, the result goes back through DispatcherServlet and is sent to the client as either JSON data or a rendered view.

### 11. What Is a Controller?
```text
Top Layer

@RestController

RESTful Endpoint

Exception Handling
@RestControllerAdvice
```
> A controller is usually the top layer of a typical three-tier Spring Boot application.
>
> Its job is to expose RESTful endpoints to the UI and handle incoming HTTP requests.
>
> I usually write controllers with `@RestController` and mapping annotations like `@GetMapping`, `@PostMapping`, `@PutMapping`, and `@DeleteMapping`.
>
> The controller receives requests, validates input, calls the service layer, and returns responses.
>
> For exception handling, I often use `@RestControllerAdvice` to keep error handling centralized.

### 12. What Is WebFlux? Have You Used It in a Project?
```text
Purpose
  Reactive Programming

Style 1
  Servlet
  Thread Per Request
  Traditional MVC

Style 2
  Reactor
  Channel
  WorkerGroup
  Async

Return Type
  Mono
  Flux

Today
  Java21 Virtual Thread
```
> WebFlux is Spring's reactive, non-blocking web framework.
>
> Traditional Spring MVC is built on the Servlet API and follows a thread-per-request model, where each incoming request is handled by a dedicated thread.
>
> WebFlux takes a different approach. It is built on Reactor and uses asynchronous, event-driven processing with components like channels and worker groups.
>
> Instead of returning normal objects, WebFlux usually returns `Mono` for a single value and `Flux` for a stream or collection of values.
>
> I have studied WebFlux and built small demos with it, but most enterprise projects I worked on used Spring MVC because it is easier to debug and maintain.
>
> These days, with Java 21 Virtual Threads and improvements in modern Tomcat, WebFlux is not adopted as often as it was a few years ago.

### 13. How Do You Connect to a Database in Spring Boot?
```text
Step 1
  Spring Data JPA

Step 2
  application.properties
  application.yml

  url
  username
  password
  pool size
  timeout

Step 3
  DataSource

  @Configuration
  @Bean
  @Value

Multiple DB
  @Qualifier
  @Primary
```
> I usually connect to a database in Spring Boot in three steps.
>
> First, I add the Spring Data JPA dependency to the project.
>
> Second, I configure the datasource settings in `application.properties` or `application.yml`, including the database URL, username, password, connection pool size, and timeout settings.
>
> In some cases, I also use `@Configuration`, `@Bean`, and `@Value` to configure datasource settings programmatically.
>
> After that, Spring Boot creates and manages the datasource automatically.
>
> If the application has multiple databases, I can use `@Qualifier` or `@Primary` to control which datasource should be injected.
>
> Once the connection is ready, I typically use repositories and Spring Data JPA to interact with the database.

### 14. How Do You Handle Global Exceptions in Spring Boot?
```text
@RestControllerAdvice

@ExceptionHandler

404
400
500

Centralized Handling

AOP Style #1
```
> I usually handle global exceptions with `@RestControllerAdvice` and `@ExceptionHandler`.
>
> I create a dedicated global exception handler class and define separate handler methods for different exception types.
>
> For example, I may return 404 for a resource not found exception, 400 for validation failures, and 500 for unexpected server errors.
>
> This approach keeps exception handling centralized, makes controller code cleaner, and gives the application consistent error responses.


### 15. What Spring Boot Annotations Do You Commonly Use?
```text
Bootstrapping
  @SpringBootApplication

Bean Registration
  @Component
  @Service
  @Repository
  @Controller
  @RestController

Configuration
  @Configuration
  @Bean
  @Value
  @Profile

DI
  @Autowired
  @Qualifier
  @Primary
  @Lazy

Validation
  @Valid

AOP
  @Aspect
  @Pointcut
  @RestControllerAdvice
```
> I use Spring Boot annotations for different purposes throughout the application.
>
> At the application level, I use `@SpringBootApplication`, which combines auto-configuration, Spring configuration, and component scanning.
>
> For bean registration, I commonly use `@Component`, `@Service`, `@Repository`, `@Controller`, and `@RestController`.
>
> For configuration-related work, I use `@Configuration`, `@Bean`, `@Value`, and `@Profile`.
>
> For dependency injection, I use `@Autowired`, `@Qualifier`, `@Primary`, and sometimes `@Lazy`.
>
> For validation, I use `@Valid` together with validation annotations like `@NotNull` and `@Email`.
>
> For AOP and exception handling, I commonly use `@Aspect`, `@Pointcut`, and `@RestControllerAdvice`.


### 16. How Does Spring IoC Work?
```text
Step 1
  Read Metadata

  @SpringBootApplication
  Component Scan

Step 2
  Bean Instantiation

  @Lazy

Step 3
  Dependency Injection

  Constructor
  Setter
  Field

Step 4
  Lifecycle Management

  ApplicationContext
```
> IoC stands for Inversion of Control.
>
> Instead of creating and managing objects manually, we let Spring manage object creation, dependency injection, and lifecycle management through the IoC container.
>
> The process starts when the application boots up and reads metadata from annotations such as `@SpringBootApplication`.
>
> During component scanning, Spring finds bean definitions from annotations like `@Component`, `@Service`, `@Repository`, and `@RestController`.
>
> Next, Spring creates bean instances. By default, most beans are singleton-scoped, and `@Lazy` can be used when delayed initialization is needed.
>
> After creating the beans, Spring performs dependency injection through constructor injection, setter injection, or field injection.
>
> Finally, ApplicationContext manages the lifecycle of those beans throughout the application.
>
> This approach reduces coupling and makes the application easier to maintain and test.

### 17. What Are the Ways to Inject Beans in Spring? Which One Do You Use Most?
```text
3 Ways

1 Constructor
2 Setter
3 Field

Most Used
  Constructor
```
> There are three common ways to do dependency injection in Spring.
>
> They are constructor injection, setter injection, and field injection.
>
> Among these three, constructor injection is the one I use most often, and it is also the one generally recommended by Spring.
>
> Constructor injection makes dependencies explicit, improves testability, and helps catch dependency-related issues during application startup.

### 18. What Is the Difference Between By Name and By Type?
```text
Default
  By Type

Multiple Bean
  Ambiguous

Solution
  @Qualifier

Default Bean
  @Primary
```
> Spring performs dependency injection by type by default.
>
> For example, if there is only one implementation of an interface, Spring can automatically inject that bean based on the type.
>
> But if there are multiple implementations of the same type, Spring will not know which one to inject.
>
> In that case, I use `@Qualifier` to specify the bean by name.
>
> Another common approach is to mark one bean as the default implementation with `@Primary`.
>
> So in practice, Spring injects by type first. When there are multiple candidates, I use `@Qualifier` or `@Primary` to resolve the ambiguity.


### 19. Why Do You Prefer Constructor Injection?
```text
1 Explicit Dependency

2 Easier Testing

3 Prevent NullPointer

4 Fail Fast

5 Immutable Dependency
```
> Constructor injection is the approach I use most often.
>
> First, it makes dependencies explicit because all required dependencies are listed in the constructor.
>
> Second, it makes unit testing easier because mock objects can be passed directly into the constructor.
>
> Third, it helps prevent NullPointerExceptions because required dependencies must be provided when the object is created.
>
> It also follows the fail-fast principle. If a dependency is missing, the application fails during startup instead of failing later at runtime.
>
> Finally, constructor injection works well with immutable fields because dependencies can be declared as `final`.

### 20. What Java Version Can We Use with Spring Boot 3?
```text
Spring Boot 3

Minimum
  Java 17

Common
  Java 17
  Java 21

Major Change
  javax
      ↓
  jakarta
```
> Spring Boot 3 requires Java 17 or above.
>
> In practice, Java 17 and Java 21 are the most common choices.
>
> One major change in Spring Boot 3 is the migration from the `javax.*` namespace to the `jakarta.*` namespace.
>
> Because of this migration, applications moving from Spring Boot 2 to Spring Boot 3 often need both a Java upgrade and package migration work.

### 21. What Is DispatcherServlet?
```text
Front Controller

Receive Request

HandlerMapping

Find Controller

Execute Controller

Return Response

Core of Spring MVC
```
> DispatcherServlet is the front controller and the core component of Spring MVC.
>
> Every incoming HTTP request reaches DispatcherServlet first.
>
> DispatcherServlet then asks HandlerMapping to find the matching controller method based on the URL and HTTP method.
>
> Once the correct controller is found, DispatcherServlet calls that controller method and processes the result.
>
> Finally, the response is returned to the client either as JSON data or as a rendered view.
>
> In short, DispatcherServlet is responsible for routing, dispatching, and coordinating the whole request-response workflow in Spring MVC.



## Mock for 06/10/2026
https://mock0610.s3.us-east-1.amazonaws.com/mock0610.mov?response-content-disposition=inline&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEDoaCXVzLWVhc3QtMSJIMEYCIQDzeRtmyWPKMPZsjSlitfx%2F9FHHjxiISPsX3Vp9%2FlPyEQIhAPTKnwnpg%2FNC2ddfq6cyG9IgqaZrxLRpqDcdf%2BURriIoKv0CCAMQABoMMjM3NDYyMzg3MTIzIgwX9yuLlgX0Oxvmr3Qq2gIXaJFDKV0TIPAoxEwSeL7RfEtwE4S8ubt5AZh%2FlQbgdJXrmnpRRb4D0XU7i9Gz%2BKGuGV9MKIcUH26sB89tLoBKiAaAQH18u%2FZYwpEBHZZUG%2Fjlh5riPuxSW4WvPyFO5%2FEN0ImH2Ft5srkN17m5s4FlJxPOKBieK5yeD4OMVA0UufjE%2FLBBrBB8DTvggaUhTOibDAnrwV%2FOjhdVWOZpRlrccu3huvo49PHsq3VDt7SWqxQSOwBUsuBDd4lKjuYe6HgoaML1fFNeAhFY6x9H1yrLqIFb2tDlM9r4ignUEiKyTL61R2MfWtE5mkKemIhuWNLuiF2Ar6Vj82tYqWNj45R6vz%2F3FH8h%2BgOPsxmDaOw8mpC%2BM4GnE4MHkCNtX73qDNIa%2FRUYexQQj%2FgrXpTeCDkEZ5ivkbIVuDS%2FTmD63kYJkXEYw3MztMh12GXAkGFqVB2MhsMCR7%2FwEiw5MJ3tq9EGOo4Cd5lrTz6SpJ7eZnh3HqGvp23vMkRES76i2wOaENbwVDLHspB7fLCX%2FgBdvfzobmNIWKUHKjeThRVjbmpngcTyDXfF%2Bkz3MsmoarDZem51WqNvAN0Cj97QdMMnrv8ryaU6d6rHZquoGNgXA45hd7v2wAwFBd8aQnDmSbPheFq42Gf0YSBTGt7ngnlV1%2BCXS9vKS0VIfd50v6Tg4nml8zSbydNSSXZ33%2FqfUo%2BTPPzGfYC1cYegBSvD1MAG4GuitChx6efMv1BnyJFTDCUx8a4Lx8anKgT7C4Lgn3ecZSTh9RZLmgZjLOxmYyga3XWsdrSa%2BFZJ55py%2F9y23LsSAKUWfBI%2F8X1AC2l3GCz36T2W&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIATOSO4PGZXZONSEEW%2F20260611%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20260611T175758Z&X-Amz-Expires=43200&X-Amz-SignedHeaders=host&X-Amz-Signature=9283ab016514132b2d9600c6ffd501917359c557c5c3b61a369b5c68cac433ac
### 1. how to use stream to filter people younger than 30

First, we can use `.stream()` to convert the list of people into a stream. Then we use the `.filter()` method with a predicate, such as `person -> person.getAge() < 30`, to keep only people whose age is younger than 30. Finally, we use a terminal operation like `.toList()` or `.collect(Collectors.toList())` to convert the stream result back into a list. This is a common Java 8 Stream API use case because it makes filtering collection data more readable than writing a traditional for loop.

```java
List<Person> result = people.stream()
        .filter(person -> person.getAge() < 30)
        .toList();
```

### 2. where did you use singleton in your project

In my project, I used singleton mainly for shared resources that should only have one instance, such as database connection pools, cache clients, message queue clients, and thread pools. Creating these resources repeatedly would be expensive and could hurt performance. In Spring Boot, most service and repository beans are singleton-scoped by default, so Spring’s dependency injection reuses the same bean instance across the application. For example, in a PostgreSQL project, we usually program against `DataSource`, and Spring Boot uses HikariCP as the default connection pool. Business code does not need to manually create connections or write a singleton class. Similarly, for Redis, Spring manages `RedisConnectionFactory`, `RedisTemplate`, or `StringRedisTemplate`. For Kafka, Spring manages components like `KafkaTemplate`, `ProducerFactory`, and `ConsumerFactory`. This approach is better than manually calling `Singleton.getInstance()` because it is easier to test, replace, configure for different environments, and let Spring manage the lifecycle.

### 3. what is SOLID principle

SOLID is a set of five principles for object-oriented design. Single Responsibility means a class should focus on one responsibility. Open-Closed means code should be open for extension but closed for modification. Liskov Substitution means a child class should be able to replace its parent class safely without breaking the program. Interface Segregation means we should use small and focused interfaces instead of one huge interface. Dependency Inversion means high-level modules should depend on abstractions instead of concrete classes. In Spring Boot, Dependency Inversion is commonly achieved through dependency injection, because controllers or services usually depend on interfaces, and Spring injects the actual implementation at runtime.

### 4. how do you design RESTful APIs to GET/CREATE/UPDATE an object.

When I design RESTful APIs, I usually start from the resource instead of the action. The URL should use nouns, not verbs, because the HTTP method already represents the action. For example, if the resource is user, I would use `GET /users/{id}` to get one user, `POST /users` to create a new user, and `PUT /users/{id}` or `PATCH /users/{id}` to update an existing user. The controller layer receives the request, validates the input DTO, and then passes it to the service layer. The service layer handles business logic, and the repository layer handles database operations. The API response should include a clear response body and proper HTTP status code, such as 200 for success, 201 for creation, 400 for bad request, and 404 when the object is not found.

### 5. write rest api (User and ToDoltem): many-to-many relationship, create api for CRUD operations

For a User and TodoItem many-to-many relationship, I would first design three tables: a `users` table, a `todo_items` table, and a join table such as `user_todo_items`. The join table stores the relationship between user IDs and todo item IDs. In the entity layer, User can have a collection of TodoItems, and TodoItem can also have a collection of Users. For the API design, I would create CRUD endpoints for both resources, such as `POST /users`, `GET /users/{id}`, `PUT /users/{id}`, and `DELETE /users/{id}` for users, and similar endpoints for todo items. Then I would add relationship endpoints, such as `POST /users/{userId}/todos/{todoId}` to assign a todo item to a user, and `DELETE /users/{userId}/todos/{todoId}` to remove that relationship. The controller should only handle request mapping and validation, the service layer should handle business logic, and the repository layer should handle database access.


## Mock for 06/09/2026
https://mock0609.s3.us-east-1.amazonaws.com/mock0609.mov?response-content-disposition=inline&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjECQaCXVzLWVhc3QtMSJHMEUCIEmESfY6NRGVyA3SFzseEE18Rv4hgp8HOWh6NPwiDXYjAiEA7BqSC1XMkG44kLuO3dIxSQS%2FATBFH5U6m6vSPyPEB0YqhgMI7f%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARAAGgwyMzc0NjIzODcxMjMiDBVEzKzCWe7bQUrguCraAnjSnNc4kc0c6lu8yWwoQcTxcZn5kp5tGO6BcKUtaegRoQGfTmb%2FWvV%2B%2BMpU6bfIXmPChABUau9VPQxKq8RJUSukq6bd7hA2tzaB7lJvwMVTfHQVBhl2J4W93yeQ1i9i1CMZQ6H3Q8Krt%2FNUwt0l2JMXrF5CUGCuj63b910PUQYqmqqy24aGxrx6nAruhtsD0I2XZ7g3P9KKvJ3juoQoWdsHBmnY3bQOc6Jyi9cCKR5oYRUa5EDSkge0L0UGDsoaCv7f%2BexbPFsE03PqnA8YKnqtbl%2BtEGrIX4DYfRbb0X9GE3cFb4ggu3xYhvPnjkhm3kkDP7l%2BUClZwzKO%2FjyzQjoHLwdGZNfOdbC%2FZ4YxCfyQ7XpE%2BbHo2Wy5k7K%2BNx8g812G%2BWEfogRi380zuGqbGmTIbFhOG0JJk67%2F4jBCr0D4W4eyrowRGRaGGI7wYHN8KDolJ%2FZzdiJ5hKswgPam0QY6jwIJmpIVIMXakh8ZEzcpVs0rOtY0ytBUic%2Bd3doRcIZLq6G1fGKSLRNIMjOiWo8QNpSe6bQj5z58PSoVsUQLog2Bwo2l3Tntiv3Y7X%2BO4ehLfIgV3KhXz8dBjYfXt6l7Q5%2BgaZTxxdybbb%2BXvrBGjvrZarNfdQsyFwDis7bxQiNv7C9Osgrw4dbAyjfaZoGHmu4ueWNdGV6E5KtKF8WEsA5wA%2FtHULRnO5lY0drTfCfLksLy3CDc8AnYKmtS3GuE93pDFwcso1jsFnw1L20lT7iLvksh37uUNsIwluSdoUr4iE0snFSj%2BYPgA10aibEcAXIW5cMSeuFtIoxU36LaO0HHMRo%2FmVy6e0gY%2FFwc%2Bgwt&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIATOSO4PGZ6SLGWO7X%2F20260610%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20260610T193104Z&X-Amz-Expires=43200&X-Amz-SignedHeaders=host&X-Amz-Signature=827c90e2a6f8c8436222fbae1b6597e6b54ec381cf76a55c1595a6be2dc730de

### 1. Diff recursion and iteration
Recursion and iteration are two different ways to solve a problem. Recursion means a method calls itself repeatedly until it reaches a base condition. It is commonly used in problems such as tree traversal, graph traversal, and divide-and-conquer algorithms. One downside is that every recursive call creates a new stack frame in JVM memory, so deep recursion may cause a StackOverflowError. Iteration uses loops such as for or while loops to repeatedly execute logic. It usually has better performance and lower memory usage because it does not create additional stack frames. In general, if both solutions are possible, iteration is often more efficient, while recursion can make some problems easier to understand and implement.

### 2. Linked hashmap vs hashmap

Both HashMap and LinkedHashMap implement the Map interface and store data as key-value pairs. The biggest difference is the ordering behavior. HashMap does not guarantee any iteration order, so the order of elements may change over time. LinkedHashMap maintains the insertion order by internally using a doubly linked list in addition to the hash table structure. Because of this extra structure, LinkedHashMap uses slightly more memory than HashMap. If the application needs predictable iteration order, LinkedHashMap is a good choice. Otherwise, HashMap is usually sufficient and slightly more lightweight.

### 3. How to group people to key(age), value(list of people)

In Java 8, the most common way to solve this problem is by using the Stream API. We can convert the collection into a stream and use the collect terminal operation together with the groupingBy collector. The groupingBy method allows us to group objects based on a specific field, such as age. We typically use a method reference like Person::getAge to define the grouping condition. The final result is a Map where the key is the age and the value is a list of people who have that age. This approach is concise, readable, and commonly used in modern Java applications.

### 4. How to write REST API in spring boot

When designing a REST API in Spring Boot, the first step is to design resource-oriented URLs. We normally use nouns instead of verbs because the HTTP methods already define the action. For example, GET is used to retrieve data, POST to create data, PUT to update data, and DELETE to remove data. In the controller layer, we use annotations such as @RestController, @RequestMapping, @GetMapping, and @PostMapping to define endpoints. The controller receives data through path variables, request parameters, headers, or request bodies and then passes the request to the service layer for business processing. Finally, the API returns a response payload together with an appropriate HTTP status code such as 200, 400, or 500.

### 5. How did you debug

When debugging an issue, the first thing I focus on is not setting breakpoints. The first step is understanding how to reproduce the problem consistently. I usually start by checking logs, exception messages, HTTP status codes, and any monitoring information available. Once I identify the request that caused the issue, I try to reproduce the same behavior in the development environment using the same payload and tools such as Postman. After the issue is reproducible, I use IntelliJ breakpoints and debug mode to inspect variables and trace the execution flow. In production systems, monitoring tools such as Grafana, Prometheus, and Spring Actuator are also very useful for identifying the root cause.

### 6. New feature in java 11

Java 11 introduced several important features. One of the most useful additions is the standard HTTP Client API, which provides a modern way to send HTTP requests and handle responses without relying on third-party libraries. Java 11 also introduced experimental garbage collectors such as ZGC, which is designed to reduce pause times and improve application responsiveness for large-scale systems. Another addition is the Epsilon Garbage Collector, which performs memory allocation without reclaiming memory. It is mainly used for performance testing and benchmarking scenarios. Java 11 is also a Long-Term Support version, so it became widely adopted in enterprise applications.

### 7. Design the locking schema so that when a thread call method1(), it needs to until some other thread call method2()

One common solution is using wait() and notify() for thread communication. When a thread enters method1(), it acquires the lock and then calls wait(), which causes the thread to release the lock and enter a waiting state. Another thread later calls method2(), performs the required work, and then calls notify() or notifyAll() to wake up the waiting thread. Once the waiting thread receives the signal and reacquires the lock, it can continue execution. Another modern approach is using ReentrantLock together with Condition. This provides similar functionality but gives developers more control and flexibility for complex thread coordination scenarios.


## Mock for 06/08/2026
https://mock0608-237462387123-us-east-1-an.s3.us-east-1.amazonaws.com/mock0608.mov?response-content-disposition=inline&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEA4aCXVzLWVhc3QtMSJGMEQCIDILq9Ck4i86iuSi%2FA8FBSjqw1Q568nkQLcs89faS96KAiAYzkV1Sg2ZcP1m%2BX4GZzQLe25dqrfuTlOzMRFbSV8ewCqGAwjW%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8BEAAaDDIzNzQ2MjM4NzEyMyIMeo9499JFhn08CzhzKtoCC7NvYbZWD4gRPyEL5L6YM9OrvxrWHNThoEvqmktLOGi27UxIoUdSid8CSiZ1553qfP%2BLJNyII6HdwTkYjaQxKz99NHund0kggyDCeCOqZfKQcgQyhSPa6uJg10Ml7iypIV%2B6AXag%2BRzr%2BfzcR2yiaxa9ZBUXEzK%2B1sT3dO%2FUvdcH2TP33lpgAW%2BGDtROa4V3QtnSWZ5onAPWU0Avr0yMgNhxXbhnutTr6miOrsL1aPG3ATWeGN8lodKc%2B%2BTwaC8%2FiIouNJEu5w4%2BMfTDdsHTMFHfifz5yv3MLwcDrk15Qyke1u3%2FxfS%2B17h3cA5idyu4gfODWkKWkVvIt3c9DbfDPmv5a%2FQjdnUMz2lXinhpCj6LG7U9UVT0XGOt6ihQfobdhZpG60F1ou1xvZR6MVAw8Z0DUq1CzCrBwB18f7fnds8aXY8YOSmq762vTqlT%2BsJ2PUskrisRU%2BEDBTCRg6LRBjqQApPXLeTokpF1zMJ7QGVT524QAWVPDgeW1xc%2Fnz3nX5i5ZVH9izy%2BP9pfbkhYrArJjdj1D8iTU37pen1Jkqe%2FBbsTm2g6VSaP%2B2BCRNHNdgV21fHeok2PQkqiIYlk%2Bva%2BINTVlodNXdF48Euuwto1b8QpGJEram0bnD1Qq5HvS%2FoWYWsD9uSZvBOZYzmwcTRVA%2BLdhe8z9EjFf3PWk%2F78uDNLgyqqT5JOtHSB9RqD%2BUUm9NMnKWinTOPLjfSn7XNASV%2FbTucmBWd7gAb4wFxvRwPargFmVDk9HfL59AyAMidv8hPl1lm35Zd4Yw5LCOe5wF83zupwF0x1ey2Gk7YXlxc7ZRCGdfO%2BiNEtzisCbdxF&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIATOSO4PGZXZDQZUP7%2F20260609%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20260609T211416Z&X-Amz-Expires=43200&X-Amz-SignedHeaders=host&X-Amz-Signature=3c326a7e39994217ecd6f78ae82fa85c6d6df722479df522c0b9ba7d7d44382e

### websocket vs http
HTTP is a request-response protocol that is mainly used for one-time, independent communication. One request will have exactly one response, and the connection is typically closed after the response is returned. The server cannot send data to the client unless the client sends a request first.

WebSocket is designed for long-lived communication. Once the connection between the client and server is established, it stays open, and both sides can send messages to each other at any time. This makes WebSocket a good choice for real-time applications such as chat systems, live notifications, and real-time dashboards.

## Mock for 06/01/2026 
https://java-traning-demo-2-237462387123-us-east-2-an.s3.us-east-2.amazonaws.com/java-demo-2.mp4?response-content-disposition=inline&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEGQaCXVzLWVhc3QtMiJGMEQCIHLaLHLxq5Ib%2BLDqQpECENrMnJztT%2BzohqEH0mZqTw5sAiBsxTDsDPMx0qk3tgImA0y76tNoSjYzHJcT5IX3QktWviq1AwgtEAAaDDIzNzQ2MjM4NzEyMyIME%2Be9sgKkZRjSdsyCKpID37bZLk1DTt0LjTD8sEd7SPqVQ027JStsm5g0bYyPjlrEdT1W2vCI2%2FfGIOoRSRq9ZGatkQ%2FkqUTlxWlUASTMue7xPHOaXRGAYEJLobf74fTZFhNZErRBhxr%2FqP6VGdbAdxBjTzq86KRFuDnzb2FISlo0AC%2BYqTWt7hlVBSGR5OFvwqeJOK8hNB3OU1%2FQ6bVfHVPEf2sLbiopdO0qNYN3%2Bjm6G9R2nGSTJnDOcoVxaloloFuQ8zV5R8Pw7ObZiWgMNgb4Qld%2BYcZckH5TNdASb3l%2BRFDmJjBdCBRcDnuId6Ed59W8O%2F0OB2XFZWYaqPM7PjSrJo4jXqEi34MS7xkJN5fL3kxG4fJkeGAsy3Jg2FYXvePb64X37SyA8WRDyHGCL5AerjYHQAYJ2BXdzs2501F45dbo%2FUVWCETkWyCY9%2ByEf9JIK9kCTj8VjKVBJD3tqUnihBUmdZEQLZ%2B2fFVdw0Mc32OgaB3sSCNw%2F9vSxIOWSRALiv6E8m67TR%2BKser849VPPGwSMhrsgS%2F61lHsCShdMJja%2B9AGOt8CSWsy5ZyIb1uOLr1759ajxBvYAEx4kqPWEks75YfpGYzsjPvh9z04P27g2%2BTsSCs3q%2Byfoo1%2FV3BDv4legnDPXgdTQp0KWrfVIy6MblJsLWv1cWowVVc0SKqhjKKCXGOO1tekEIvw42qFlGW9t4un0Ryh4qT6cwf7%2BGRQgXtv1qwwUW%2BnzBYHZms2b90D3gGxAbr9YFurL73F7jkiuHnnoDdYW3DNyf5ULRCcXayO7lz%2BD01vHBSXbykgr6Nz7dV3kXygX9Edvns19moqvPMMij8ESGieltrZBA3e5IjZrvF%2Beqyu8c%2BsFl1xiFkgp0VPski2kQrowiHmSPlIf99UJFhXFKRkOEmh2X4narqvT4ELl8nR%2BRskMglaXUxa%2FicJJk%2BWhoxNtGfWXASKi06BaQvxhh0IiQJDHoyG3l3F1yPU8pVkq8TY9tzUa3%2BTMNIQl7bhINqAVyRd1uSuQImN&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIATOSO4PGZUKI57D5U%2F20260602%2Fus-east-2%2Fs3%2Faws4_request&X-Amz-Date=20260602T195809Z&X-Amz-Expires=43200&X-Amz-SignedHeaders=host&X-Amz-Signature=a22df71a232aa31e8d45e9e72501303cd0f1fd23d2ba410c69f7c240e59bab99

## Mock for 05/29/2026 
https://java-training-demo-237462387123-us-east-2-an.s3.us-east-2.amazonaws.com/java-demo.mp4?response-content-disposition=inline&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEEwaCXVzLWVhc3QtMiJHMEUCIQDEuiwSCeuL6EiDYOoCwumXizf0M4CXuCpluLhJjA6JmQIgOVhvh3O0l3wNYZrzLik%2FkAfkaNjsOpwSzRNdr9fasaUq%2BQIIFRAAGgwyMzc0NjIzODcxMjMiDJOvbuJk18S%2FD7fMryrWAiABPQG5jYFGrJaouLWrGIbyY0Wlb9Ob4dTa7LnXVfQ4EnChMKqwiZkVcVTp7d%2B3lUwxVPRPEMvsn%2Fq8lf716Y6oiOYGDEu3YF6VbxYom6gMecMhwlLCNz99H%2FvzhrrW2Ve96l3WUSeUT%2FqVw0oqqFg6I5mLUiS5EGYTRx5aqESzMydeeMKOBWKctnaLgmX88r8hnCpvL6NKTn0eJSTuPPkhuYonldrUDP0sm%2FuarwQ0LVbHj%2Bk8Q%2BeMdEGIVpWmRgYekCdfxz0%2FiAe1ipRmOuKuUMqLVlIUPn%2BgW3qCgYfq9JskA3lHtoaciXxV%2BekkfKLF9Rso0xVa6dHtYtpv2GcX04EELd33JyJyzf3D8w353JHcfdsaclnhyfVjjY0F0TLp3dwyZah3oCoBmUufihEqqn4sOz28G%2Fhxqy8TTUWVZ3kEcu9MKmn0bhb%2BdC5BdLlKWWVjOzDErffQBjqPAurlEAA8zzz02up6t38mx%2B3HLa2ZNbTsn5jj2Gn7YzRGMMWnqMb4SQ3SiL37BBPzfbzj7L5JyJSApv8AD0NZw0%2FEQCp5lIuJGuqnFpszg9gnTgnJVoV%2FLvnCfDSEGI4HvxG1keCrCrM%2FapvzolTxbiVPznzhwm8bTc08KRGNIxMs06npJWeSZv3p%2FctIvmwCmR7etG37q%2FLRvqzpGxCNen28FYoqDNUWzfWhbrdWEbBOtAWOa4rCv8U2YAErg869NrawBDUHd2mD%2B1apKf2BchJcri1Nd1E%2F2UtP4sAqoLMRnZ%2F%2FykV%2BzrVUd09r72u25wxSDn1HeOx9%2FMUjGicF7qqcgg0DVKBleC3r%2Fvdllh8%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIATOSO4PGZXUPQNKCC%2F20260601%2Fus-east-2%2Fs3%2Faws4_request&X-Amz-Date=20260601T194416Z&X-Amz-Expires=43200&X-Amz-SignedHeaders=host&X-Amz-Signature=97db89d390d7ee3586415938dbd2a268cbccafbb210cde398f1e05e5ca024d07
