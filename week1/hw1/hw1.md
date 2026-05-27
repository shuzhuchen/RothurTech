# HW1

## List vs Set
List is ordered, and duplicates are allowed. Set is unordered and does not allow duplicates. If we need order, we can use LinkedHashSet, and if we need sorting, we can use TreeSet.

## LinkedList vs ArrayList
ArrayList is optimal for operations that require frequent random access using indices. LinkedList is more efficient for insertions and deletions.

## What Is Map Interface?
Map is an interface that is used to store data in key-value pairs. 
Common implementations include: HashMap, LinkedHashMap, TreeMap, Hashtable. 
While commonly used, Map is not part of the official Collections framework because it does not inherit from the Iterable interface.

## How Does HashMap Work?
When we put a key-value pair into HashMap, Java first calls hashCode method. Then hashCode generates a hash value. 
HashMap converts that hash value into an array index called bucket hat. Then the object is stored in that bucket. 
If a collision occurs at a bucket, it attaches a linked list to store multiple entries, which is converted into a Red-Black tree if it exceeds 8 elements.

## What Is Hash Collision?
Hash collision occurs when two completely different objects generate the exact same hash value. 
To handle this, the system places the new value in the same bucket position and uses a linked list to connect them.

## What Is Collections Used For?
The Collections framework provides various data containers to hold and manipulate groups of values. 
It provides standardized interfaces and implementations (like Lists, Sets, and Queues) to organize, sort, and process data efficiently.

## What Is Immutable Class?
An immutable class is a class whose objects cannot be changed after creation. 
Example: String, since it stores its values in a constant string pool for performance efficiency.

## Hashtable vs HashMap vs ConcurrentHashMap
HashMap is not thread-safe. HashTable and ConcurrentHashMap are thread-safe. 
HashTable is deprecated due to inefficient global locking of the entire bucket array. 
ConcurrentHashMap is a recommended alternative because it utilizes refined lock granularity to lock only specific entries, thereby improving performance during read and write operations.

## String vs StringBuilder vs StringBuffer
String is immutable because it stores its values in a constant string pool. 
StringBuilder is mutable and not thread-safe. 
StringBuffer is mutable and thread-safe.

## Why Do We Need to Override the hashCode and equals Methods at the Same Time?
The system uses the hashCode to find the correct bucket, but it must use the equals method to check whether an entry is a hash collision or simply a value update for an identical object.

## Play Around Common Data Structure APIs (map, set, queue, list), write some practice codes
[Practice.java](src/Practice.java)

## Comparator vs Comparable: When to Use Which One?
Comparable is implemented directly within a class template to provide a default, built-in sorting strategy by overriding the compareTo method. 
Example: sorting employees by salary. 
Comparator is used to implement customized sorting that override the default logic. 
Example: sorting by age/name.

## Overriding vs Overloading
Overloading means methods have the same name but different parameter lists in the same class. 
It is compile-time polymorphism. 
Overriding means a child class provides its own implementation of a parent class method. 
It is runtime polymorphism.

## Java 8 Basic Data Types
byte, short, long, int, boolean, char, float, double

## Primitive Type vs Reference Type
Primitive types refer to the 8 basic data types (byte, short, long, int, boolean, char, float, double). 
Reference types include all other objects, such as String, List, Map, and custom classes like Employee.