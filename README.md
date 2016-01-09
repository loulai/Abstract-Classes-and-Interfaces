Interfaces vs. Abstract Classes
=======
Both interfaces and abstract classes are required for abstraction.

Interfaces don't express something like ``A seabass is a type of fish and every fish can swim``. That's an abstract class' job. An interface simply expresses ``this thing can swim``.

Abstract classes define characteristics of an object. Interfaces define capabilites.

###Interfaces

An interface is an empty shell. It contains empty method signatures that aren't implemented.

The person writing the interface: *This thing should have these methods. It's up to you to fill it out.*

###Abstract Classes
An abstract class is very similar to an interface, but with something extra: you can define common behaviour and methods. When using an abstract class, you inherit methods that may or may not be already fleshed out.

The person writing the abstract class: *This thing looks like this and I'm defining that they have commanilities, and I've left some blanks for you to flesh out.*


Key Differences
---
- Abstract classes are **extended**, interfaces are **implemented**

- Interfaces only contain only empty method signatures and constants, whereas abstract classes can have those *and* **defined** methods.

- A class can only extend *one* abstract class, whereas interfaces can implement multiple other interfaces.
