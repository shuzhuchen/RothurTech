# HW6

## 1. Client-server model

The client-server model is a communication pattern between a client and a server. The client is usually a browser, mobile app, or frontend application that sends requests and displays results to the user. The server receives the requests, runs business logic, accesses data, and returns responses. For example, when a user clicks the login button, the browser sends a request to the server, and the server checks the user's information before returning a success or error response.

## 2. Application service

An application service contains the main business workflow of an application. In a common Spring Boot project, the controller receives HTTP requests, the service handles business logic, and the DAO or repository accesses the database. For example, in an e-commerce system, an order service may check inventory, calculate the total price, save the order, and call a payment service.

## 3. HTTP request and response

HTTP request and response are the basic way for a client and server to communicate. An HTTP request is sent from the client to the server and usually contains an HTTP method such as `GET`, `POST`, `PUT`, or `DELETE`, a URL, request headers, and an optional request body. An HTTP response is sent from the server back to the client and usually contains a status code, response headers, and a response body, often in JSON format. For example, `200` means the request was successful, `400` means client-side problems, and `500` means the server had a problem.

## 4. Horizontal scaling vs vertical scaling

Horizontal scaling means adding more servers, while vertical scaling means making one server stronger. Vertical scaling adds more CPU, memory, or disk to one machine, but it hits a physical hard limit and can become expensive. Horizontal scaling adds more server instances/rents extra cloud servers to share traffic, so it is usually more flexible and can improve availability. However, horizontal scaling also requires tools such as load balancers and careful distributed system design.

## 5. Load balancer

A load balancer is a tool sits between clients and servers and distributes incoming requests across multiple server instances. It prevents one server from receiving too much traffic and getting overwhelmed. It also improves availability because if one server becomes unhealthy, the load balancer can send new requests to other healthy servers.

## 6. Microservice and microfrontend

Microservices achitecture split a large backend application into smaller services, and each service is responsible for one business area, such as users, orders, payments, or notifications. A microfrontend applies the same idea to the frontend by splitting a large user interface into smaller modules. The main advantages are independent development, deployment, and scaling, but communication, data consistency, monitoring, and deployment become more complex.

## 7. Relational database and non-relational database

A relational database stores structured data in tables, while a non-relational database supports other data models and more flexible schemas. Relational databases such as MySQL, PostgreSQL, and Oracle are commonly used for users, orders, payments, and other structured business data because they support SQL, relationships, and transactions. Non-relational databases such as MongoDB, Redis, and Cassandra are useful for documents, caching, key-value data, or large distributed data when a traditional table model is not the best fit.

## 8. API gateway

An API gateway is the single entry point in front of multiple backend services. It analyzes an incoming URL and figures out exactly which microservice should handle the request. The client sends requests to the API gateway instead of calling every microservice directly, and the gateway routes each request to the correct service. It can also handle shared tasks such as authentication, rate limiting, and logging, which makes the client simpler and keeps common logic in one place.

## 9. Message queue

A message queue is used for asynchronous communication between services. The sender puts a message into the queue and continues its work without waiting for the receiver, and the receiver processes the message later. This reduces direct dependency between services, helps handle traffic spikes, and is useful for background tasks such as sending emails or generating reports. Common message queue tools include Kafka and RabbitMQ.

## 10. Log and monitor

Log records what happened in the system, while monitoring shows the current health and performance of the system. Logs usually contain requests, errors, business actions, and system events, so they are useful for troubleshooting and auditing. Monitoring tracks information such as CPU usage, memory usage, latency, request count, error rate, and availability, and it can send alerts when a problem happens. Common tools include the ELK Stack, Prometheus, Grafana, and AWS CloudWatch.

## 11. Deployment with AWS, Azure, or GCP

AWS, Azure, and GCP are cloud platforms that provide infrastructure and managed services for deploying applications. They provide services such as virtual machines, databases, load balancers, file storage, message queues, and monitoring tools. Instead of maintaining physical servers, engineers can rent cloud resources, deploy application code, configure security, and scale the system based on traffic.

## 12. Security: authentication and authorization

Authentication checks who the user is, while authorization checks what the user is allowed to do. Authentication can happen when a user logs in with a username and password or uses a token, SSO or OAuth. Authorization happens after authentication and decides whether the user has permission to perform an action, such as allowing an admin to delete data while a normal user can only view it. Web applications also use HTTPS with TLS to encrypt data while it travels between the client and server.

## 13. Why testing

Testing helps us find bugs before they reach production and gives us more confidence when changing code. It verifies that the code works as expected, reduces regression bugs, makes refactoring safer, and improves maintainability. Unit tests check small pieces of logic, integration tests check whether multiple parts work together, and end-to-end tests check a complete user flow. Common Java testing tools include Mockito and Junit.


## recording url
https://hw6-237462387123-us-east-2-an.s3.us-east-2.amazonaws.com/hw6-demo.mp4?response-content-disposition=inline&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEJT%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMiJGMEQCID8F4Q3PC4hAWDSjvDijk5tObPR%2BE%2BxFhdalOIfZpbmyAiBu6TiEh%2BF4T6DURxSDXAA21ZOkfg0EB4lkgqaEb%2FgVKSq5AwheEAAaDDIzNzQ2MjM4NzEyMyIMjAznSVOsRmw6%2B1dDKpYDG98%2B4%2FLsOeyYWsUf8Mj%2BNG7H9bSZQ3PMQL8lJIZW3dZLNUKewErTe5dCaL7ht%2FeSgzbYbYQw%2FkbTmO%2BJeuzl2DpVYYA3xmORvfdKhbnrVHDQGkQclHilIgtCqJO7ldjJjax0omd2uKYP5P9L8PuxGdGdkhXAa5Sz%2BZE09a9T%2B7Cr4LwnBCDj7SgtkdXKoaV5Hbabnw3gj9rS6DnvaGC%2FuR%2FQDy%2FzfDfFqACWakwyUMoNfUdgb9AkD%2BR3zkpbb8k472gEcVFa8rG6F%2FzMrkttkxG4fBOoV06pa94KzLcD6rCoXQ%2BkDOBnKyI0XCPX6uBQpio35wroxCxuY2RGXWHAka9%2FOnM6SvvgEu%2FdMaMwiH8BhFrG12n3aQj33h6oKvn1zXH0oeFPGtUUEphl9t3MV8Q4WLVe7V0oCln37%2BUOoBFDL%2BTln76t3Gg2QaqRak8UCjxEbx23tD4cl8jZP5ZJeLpzgkBwmkRAeAuH0XkhzDcPnQdK%2FYFuGacsdtwPrwlfc%2FnxwP6dj4%2Bv9A2U%2FaVsTklpNFwbpTDvvYfRBjrfAhxGpoft0uDMGstcjzBojeqoFozRYbOQ67yBrMgPADH31s8prl7%2Fh9hQP0iZAxdLhGGRlpHJ3NA652RayasPkcRYFWZMc9qJNl%2BedNj8hxpoPtL2%2FEUP%2BZrp15aJS%2BMNR9jotoGptaLG7lt7il%2FTLXEZGseHSE86ffmJTyGwh075HjD2jB8ufC8g2Z9ZrP2ph37vImW%2FXPZM5djS74pfmQwvwmaMMcv3zzbPr3b6LyvplY8X4OZQoIicSY7EczCl%2Fge%2BuAmuapaN%2FpdGNisQw4xKq9phtOnZVn56I%2FpoV54%2Fxe%2B5SY6UusZXxt63s%2Fxns%2FoGdf%2BmfQpq0BdmPAdA%2FQyNRg%2F9WwTed5tvdoYKyjbTgLDV7M%2BBdj8P%2FGPXJGliBm1ih2XxMPrIPuPmZoLGJpOwnXXMP9%2BZj7cpZLYr9zd2%2BP0VuzOSbAcUNi0RK6pW1vzRis5qNzYScilQZ%2FnhYA%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIATOSO4PGZX3MT6GW4%2F20260604%2Fus-east-2%2Fs3%2Faws4_request&X-Amz-Date=20260604T202620Z&X-Amz-Expires=43200&X-Amz-SignedHeaders=host&X-Amz-Signature=62e7b00bf91d4b06e2308ef8dc4caf265f969396d1ee437559e056d0eded2967