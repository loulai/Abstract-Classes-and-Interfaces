Interfaces vs. Abstract Classes
=======
Both interfaces and abstract classes are required for abstraction.

Abstract class: ``A seabass is a type of fish and every fish can swim``

Interface: ``this thing can swim``

Abstract classes define characteristics of an object. Interfaces define capabilites.

###Interfaces

An interface is an empty shell. It contains empty method signatures that aren't implemented.

The person writing the interface: *Here are some capabilities for some thing. It's up to you to code how it does it.*

###Abstract Classes
An abstract class is very similar to an interface, but has the extra ability of defining common behaviour that will be shared by all classes extending it. When using an abstract class, methods are inherited that may or may not be already fleshed out.

The person writing the abstract class: *Here is a thing and it looks like this. They have commonalities, but I've left some blanks for you to flesh out.*


###Key Differences
- Abstract classes are **extended**, interfaces are **implemented**.

- A class can extend *one* abstract class, but can implement *many* interfaces.

- Interfaces only contain empty method signatures and constants, abstract classes can have those *as well as* **defined** methods.

##When to Prefer Interfaces
- If creating something that provides common functionality to unrelated classes, use an **interface**. 

- If creating something for objects that are closely related in a hierachy, use an **abstract class**.
