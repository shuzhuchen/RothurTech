# Homework 7

## write out the optimized Singleton Version and explain each line of code

Here: [Singleton.java](src/Singleton.java).

## what is reflection
Reflection is a Java API that allows a running program to inspect and dynamically modify its own structure at runtime. By using reflection, Java can look at a class, read its private fields, check its annotations, and execute its methods without explicitly knowing their names when the code was originally compiled.

Frameworks like Spring Boot use reflection to scan @Component or @RestController annotations and perform Dependency Injection automatically.


## what are http status code, 200/ 201/202/ 204/ 307/ 301/ 400/ 401/ 403/ 404/ 500, explain them by your own words
There are five levels http status code: 100s for informational, 200s for success, 300s for redirection, 400s for client errors, and 500s for server errors.

200 (OK): The standard success code. The server successfully processed the request and is returning the requested data.

201 (Created): Success, specifically used when a POST request successfully inserts a brand new record into the database.

202 (Accepted): The server has received the request and accepted it, but it hasn't finished processing it yet (often used for long background tasks).

204 (No Content): The server successfully processed the request, but there is no data to send back in the response body (often used after a successful DELETE).

301 (Moved Permanently): The URL you are trying to reach has been permanently moved to a new address.

307 (Temporary Redirect): The requested resource has temporarily moved to a new URL, but you should keep using the original URL for future requests.

400 (Bad Request): Client-side error. The user sent invalid input, like a malformed JSON payload or a bad credit card format.

401 (Unauthorized): The user is not authenticated (meaning they haven't logged in or provided a valid token).

403 (Forbidden): The user is logged in, but they don't have the administrative permissions required to view this specific resource.

404 (Not Found): Client-side error. The requested resource or URL does not exist in the database or server.

500 (Internal Server Error): Server-side error. Our backend Java code crashed or threw an unhandled exception while processing the request.


## what is http  
HTTP (Hypertext Transfer Protocol) is the universal communication language of the web. It is a stateless, request-response protocol used to pass data over the network. Developers use it not only for the front-end UI to talk to our backend, but also as the primary way isolated backend microservices communicate with one another across different JVMs.

## what is get, post, put, delete, patch method
These are HTTP methods that map directly to database operations.

`GET`: Used to read/fetch data. It never modifies the database.

`POST`: Used to insert/create a new record into the database.

`PUT`: Used to completely update or replace an existing record.

`DELETE`: Used to remove a record.

`PATCH`: Used to partially update a record.

Only `GET` is safe because `GET` method won't change the state of the server.

Other HTTP methods include head, options, trace, connect.

## post vs patch

`POST` is used when I want to create an entirely new record from scratch (ex. creating a new user account). `PATCH` is used when the record already exists, and I only want to update a specific, targeted piece of it (ex. the user just wants to change their profile picture, leaving their password and email untouched).

Both are safe and cacheable and `POST` is not idempotent while `PATCH` is conditionally idempotent.

## post vs put

`POST` inserts a new row. If I send the same `POST` request three times, I will end up creating three duplicate rows in the database. `PUT` is a full replacement of an existing row. If I send the same `PUT` request three times, it will simply overwrite the existing row with the exact same data three times, causing no additional side effects.

That's why `POST` is not idempotent and `PUT` is idempotent. Both are safe and cacheable.

## What is idempotent, which http method is idempotent?
Idempotency means that executing the exact same network request multiple times will result in the exact same final state on the server as executing it just once.

### Idempotent Methods: 
 1. `GET` (reading data 10 times doesn't change anything)
 2. `PUT` (overwriting a file 10 times leaves with the same file)
 3. `DELETE` (deleting a record 10 times still leaves with 0 records). 
 4. `PATCH` is also considered idempotent in standard implementations.

### Non-Idempotent Methods: 
`POST`. In a e-commerce system, pressing a "checkout" button (a `POST` request) twice by accident will charge the user's credit card twice and create two separate orders. Developers have to manually write safety checks in the code to force a `POST` request to act idempotently.
