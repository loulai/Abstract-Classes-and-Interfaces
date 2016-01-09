Interfaces vs. Abstract Classes
=======
Both interfaces and abstract classes are required for abstraction.

Abstract class: ``A seabass is a type of fish and every fish can swim``
Interface: ``this thing can swim``

Abstract classes define characteristics of an object. Interfaces define capabilites.

###Interfaces

An interface is an empty shell. It contains empty method signatures that aren't implemented.

The person writing the interface: *Here are some capabilities for some thing. It's up to you to fill out how it does it.*

###Abstract Classes
An abstract class is very similar to an interface, but with something extra: you can define common behaviour and methods. When using an abstract class, you inherit methods that may or may not be already fleshed out.

The person writing the abstract class: *Here is a thing and it looks like this. I'm defining that they have commanilities, and I've left some blanks for you to flesh out.*


Key Differences
---
- Abstract classes are **extended**, interfaces are **implemented**.

- A class can extend *one* abstract class, but can implement *many* interfaces.

- Interfaces only contain empty method signatures and constants, whereas abstract classes can have those *and* **defined** methods.
