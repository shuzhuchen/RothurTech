# HW2

## JRE vs JDK vs JVM
JDK (Java Development Kit) provides the compiler and necessary tools for development
JRE (Java Runtime Environment) is the minimum unit required to run a Java program in a production environment
JVM (Java Virtual Machine) is a subset of the JRE that specifically handles memory management and the execution of the program

## How Does JVM Work?
JVM works by taking compiled .class files and loading them into the system's RAM using a class loader. Once loaded, the JVM manages the execution of the program's logic by distributing the data across its designated memory areas and automatically handling processes like garbage collection.

## JVM Memory Data Model
JVM memory is mainly divided into 5 memory areas that organize data during runtime:
Method Area stores static elements and class templates.
Heap stores objects created at runtime.
VM Stack stores references.
Program Counter Register is for tracking method execution lines.
Native Method Stack supports native methods written in languages like C or C++.

## How Does GC Work?
Garbage collection is an automatic process that recycles objects and references that are no longer in use to free up system resources. It runs in the background using daemon threads (or guardian threads) to track memory usage, though running this process does incur a cost in CPU and RAM


## Young / Old / Perm Generation
Young Generation stores newly created objects. It is divided into Eden space and two Survivor spaces. Most objects are created in Eden and quickly collected by Minor GC.

Old Generation stores objects that survive multiple Minor GCs or large objects that are promoted directly. Old Generation is collected by Major GC or Full GC.

Perm Generation stores class metadata in Java 7 and earlier versions. Starting from Java 8, PermGen was replaced by Metaspace, which uses native memory instead of heap memory.

## Different Types of GC
Common garbage collectors include G1, ZGC, Shenandoah, and Epsilon.
G1 GC divides the heap into regions and balances throughput with lower pause time.
ZGC and Shenandoah are low-latency collectors designed for very short pause times.
Epsilon does not perform any cleanup, it delivers virtually zero garbage-collection overhead and minimizes latency spikes.