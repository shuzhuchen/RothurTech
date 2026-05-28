# HW3

## Java Modifier Scope: public, private, protected, default scope

Access modifiers implement encapsulation by controlling data visibility within a Java program. Default scope allows access only within the same package, while protected scope permits access beyond package boundaries specifically for parent-child class relationships. Private provides the minimum access level to guarantee data security, while public makes elements accessible to external users

## What Is Static Scope?
The static keyword can be applied to variables, methods, inner classes, and code blocks, but it cannot be applied to outer classes. 
Because static elements are physically stored in the Method Area of the JVM, they belong to the class template itself rather than specific object instances. 
Also static blocks execute once and only once upon class loading, making them ideal for running initialization logic.

## How Does ClassLoader Work?
A class loader works by taking compiled .class files and dynamically loading them into the system's RAM (the JVM memory). Since raw source code is not directly executable, the class loader must load the compiled byte code into the JVM's Method Area before the program's logic can run.

## Checked Exception vs Unchecked Exception
Checked exceptions are monitored by the compiler during compile-time and will stop the program from compiling if they are not explicitly handled. 
In contrast, unchecked exceptions (or runtime exceptions) occur during runtime and are completely ignored by the compiler. 
Unchecked exceptions are frequently utilized in web applications to handle unpredictable user behavior without crashing the backend server.

## finally vs final vs finalize
finally is a block used in exception handling (try-catch-finally) to wrap up exception responses and ensure specific logic executes. 

final is a keyword applied to classes, variables, or methods to prevent modification, overriding, or inheritance, which is crucial for building immutable classes.

finalize is a method called by GC before an object is collected, but it is deprecated and should not be used for resource cleanup.

## Define try-with resource. How can you say that it differs from an ordinary try?
try-with-resources automatically closes resources that implement AutoCloseable.
It is different from ordinary try because we do not need to manually close the resource in a finally block.

## Define Runtime Exception. Describe it with the help of an example.
RuntimeException is an unchecked exception that occurs during program execution and is not monitored by the compiler.
Examples include arithmetic exceptions, invalid user inputs, or wrong format inputs. Developers deliberately use these to catch unpredictable user behaviors without fully crashing the entire web application.

## NoClassDefFoundError vs ClassNotFoundException
ClassNotFoundException is a checked exception. It happens when code tries to load a class by name at runtime, but the class cannot be found. Example: Class.forName("com.example.User").

NoClassDefFoundError is an error. It happens when the class existed during compilation but is missing at runtime.

## Why should we clean up activities such as I/O resources in the finally block?
I/O resources such as files, sockets, and database connections use system resources outside normal JVM memory. If they are not closed, the program may cause memory leaks, file locks, or connection exhaustion. The finally block helps ensure cleanup happens even when an exception occurs.

## Describe OutofMemoryError in exception handling.
OutOfMemoryError is classified as an Error rather than an Exception, as it relates to severe hardware or virtual machine failures that software logic alone typically cannot handle. Developers can debug OutOfMemory errors by configuring JVM arguments (such as -Xmx and -Xms) to generate garbage collection logs for troubleshooting.

## What Is Generics in Java? What Are the Advantages?
Generics use templates (like <E>) to strictly define what data types a collection can hold, ensuring data structure type safety. The primary advantage of generics is that they prevent unexpected exceptions during iteration by restricting a container to hold only the specified type. This strict typing establishes robust, enterprise-level code that prevents invalid data operations from breaking the application.


## How Does Generics Work in Java? What Is Type Erasure?

Generics work by providing a template symbol (such as <E>) that enforces strict type rules on what data a structure can hold, such as allowing only one specific object type in a List.

After compilation, generic type information is mostly removed. This process is called type erasure.


## List<? extends T> vs List<? super T>
The difference is defined by the PECS principle (Producer Extends, Consumer Super). 

List<? extends T> is used for reading operations (producers) and allows the list to hold a broader range of subtypes while maintaining standardized access to parent APIs. 

List<? super T> is used for consuming operations and allows for more flexible data aggregation by holding generic parent classes of the specified type.


## what is Optional class (write a demo code to use ofNullable, orElse, orElseThrow method)
It is a container object used to represent the presence or absence of a value, primarily designed to help developers handle null values more safely and reduce the occurrence of NullPointerException (NPE)

[OptionalDemo.java](src/OptionalDemo.java)

## What Is OOP?
The four main principles are encapsulation, inheritance, polymorphism, and abstraction.

Encapsulation is implemented using access modifiers: public, private, protected, and default. Setting class fields to private and removing setter methods enforce a minimum access level that guarantees data security, which is essential when building immutable classes.

Inheritance is achieved through abstract classes or interfaces. While Java strictly enforces single inheritance for classes, it allows multiple inheritance for interfaces. This principle frequently utilizes the protected access modifier to permit data access beyond package boundaries.

Polymorphism is implemented through method overloading (resolved at compile-time for methods with different signatures) and method overriding (resolved at runtime for methods with the same signature but different logic). 

Abstraction is implemented using abstract classes and interfaces to hide complex implementation details behind standardized templates.
