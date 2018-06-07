<h1>Java Design Patterns</h1>
A design pattern is a well described solution to a common software problem.

Benefits

- Design Patterns are already defined and provides industry standard approach to solve a recurring problem.
- Using design patterns promotes reusability that leads to more robust and highly maintainable code. It helps in reducing total cost of ownership (TCO) of the software product.
- Since design patterns are already defined, it makes our code easy to understand and debug. It leads to faster development and new members of team understand it easily.

Creational Design Patterns
Creational patterns are ones that create objects for you, rather than having you instantiate objects directly. This gives your program more flexibility in deciding which objects need to be created for a given case.

- Abstract factory pattern groups object factories that have a common theme.
- Builder pattern constructs complex objects by separating construction and representation.
- Factory method pattern creates objects without specifying the exact class to create.
- Prototype pattern creates objects by cloning an existing object.
- Singleton pattern restricts object creation for a class to only one instance.

Structural Design Patterns
These concern class and object composition. They use inheritance to compose interfaces and define ways to compose objects to obtain new functionality.

- Adapter allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class.
- Bridge decouples an abstraction from its implementation so that the two can vary independently.
- Composite composes zero-or-more similar objects so that they can be manipulated as one object.
- Decorator dynamically adds/overrides behaviour in an existing method of an object.
- Facade provides a simplified interface to a large body of code.
- Flyweight reduces the cost of creating and manipulating a large number of similar objects.
- Proxy provides a placeholder for another object to control access, reduce cost, and reduce complexity

Behavioral Design Patterns
Most of these design patterns are specifically concerned with communication between objects.

- Chain of responsibility delegates commands to a chain of processing objects.
- Command creates objects which encapsulate actions and parameters.
- Interpreter implements a specialized language.
- Iterator accesses the elements of an object sequentially without exposing its underlying representation.
- Mediator allows loose coupling between classes by being the only class that has detailed knowledge of their methods.
- <b>Memento</b> provides the ability to restore an object to its previous state (undo).
- <b>Observer</b> is a publish/subscribe pattern which allows a number of observer objects to see an event.
- <b>State</b> allows an object to alter its behavior when its internal state changes.
- <b>Strategy</b> allows one of a family of algorithms to be selected on-the-fly at runtime.
- <b>Template method</b> defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior.
- <b>Visitor</b> separates an algorithm from an object structure by moving the hierarchy of methods into one object.

Inspired by: https://www.journaldev.com/1827/java-design-patterns-example-tutorial