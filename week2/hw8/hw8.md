# Homework8

## TCP 3 way handshaking

TCP 3-way handshake is the process used to build a reliable TCP connection between a client and a server before sending data.

First the client send a `SYN` (Synchronize) request to the server to request a connection. 

Then the server receives the request and replies with a `SYN-ACK`(Synchronize-Acknowledge) to confirm and synchronize its own sequence number.

Finally, the client sends an `ACK` back to the server. After that the TCP connection is established and data transmission can begin.


## TCP vs UDP

Both are transport layer protocols, but used for different situations.

TCP is reliable and connection-oriented. It uses a 3-way handshake to establish a connection, guarantees data delivery and order, and retransmits lost packets. UDP is connectionless and faster, but it does not guarantee delivery or order. So TCP is usually used when correctness is important, like web requests or file transfer, and UDP is used when speed is more important, like video calls, online gaming or streaming.

## what is Tomcat
Tomcat is a popular and standard web server implementation. In development, the Spring Boot application compiles and is deployed directly into an embedded Tomcat server, which acts as its default web server.

When developers boot up a Spring Boot application, Tomcat automatically starts and exposes the application to external traffic, typically running on port 8080 by default.

## what are the basic components for tomcat

```
Server
 └── Service
      ├── Connector
      └── Engine
           └── Host
                └── Context
                     └── Servlet
```

The Connector receives HTTP requests, the Engine processes them, the Host represents a virtual domain, and the Context represents a deployed web application. Inside the web application, Servlets handle the actual request and generate the response.

## what is web server
A web server acts as an intermediate layer that handles boilerplate tasks like request distribution, routing, and response packaging. 

Instead of developers manually writing complex network code to accept traffic, the web server parses incoming requests and routes the URLs to the appropriate logic in application.

This allows developers to focus purely on business logic rather than network infrastructure. Standard implementations include Tomcat, JBoss, Jetty, and Apache


## what is 3 tire architecture

3-tier (or MVC) architecture is the standard design pattern used to structure modern web applications, ensuring that code responsibilities are strictly separated. 

The three layers are:

1. Controller Layer (@RestController): This is the entry point that defines the RESTful endpoints (URLs and HTTP methods) and receives external HTTP requests. It does not process business logic; instead, it sanitizes the payload and passes it down to the Service layer.

2. Service Layer (@Service): This acts as the "brain" of the application where all core business processing logic and conditional flows are executed.

3. Repository Layer (@Repository): This layer is purely dedicated to managing the persistent data, executing SQL statements to interact with the database

## what is OSI Model, what is each layer doing
Open Systems Interconnection(OSI) model is a 7-layer framework used to describe how networking systems communicate:

1. Physical Layer: Transmits raw binary data over physical mediums like cables, or hubs.

2. Data Link Layer: Provides error-free transfer of data frames from one node to another over the Physical layer.(contains MAC address) 

3. Network Layer: Controls the operations of the subnet, deciding which physical path the data takes. (contains IP sddress)

4. Transport Layer: Ensures that messages are delivered error-free, in sequence, and with no losses or duplications using protocols like TCP and UDP.

5. Session Layer: Allows session establishment between processes running on different stations.

6. Presentation Layer: Formats the data to be presented to the Application layer. It can be viewed as the "Translator" for the network.

7. Application Layer: Serves as the window for users and application processes to access the network services using protocols like HTTP, FTP, or SMTP.
