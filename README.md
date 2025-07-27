# Java Design Patterns

This repository demonstrates various software design patterns using JAVA, organized into three main categories. Each pattern is implemented in its own directory with clear examples.

## Directory Structure

- [`src/BehavioralDesignPatterns/`](src/BehavioralDesignPatterns/)  
  Patterns that focus on communication between objects and responsibilities.
- [`src/CreationalDesignPatterns/`](src/CreationalDesignPatterns/)  
  Patterns that deal with object creation mechanisms.
- [`src/StructuralDesignPatterns/`](src/StructuralDesignPatterns/)  
  Patterns that simplify relationships between objects.

---

## Design Patterns Included

### Behavioral Patterns

- [**Chain of Responsibility**](src/BehavioralDesignPatterns/ChainOfResponsibility/)  
  Passes a request along a chain of handlers, allowing each handler to process the request or pass it along.

- [**Command**](src/BehavioralDesignPatterns/Command/)  
  Encapsulates a request as an object, allowing for parameterization and queuing of requests.

- [**Iterator**](src/BehavioralDesignPatterns/Iterator/)  
  Provides a way to access elements of a collection sequentially without exposing its underlying representation.

- [**Mediator**](src/BehavioralDesignPatterns/Mediator/)  
  Defines an object that centralizes complex communications and control between related objects.

- [**Memento**](src/BehavioralDesignPatterns/Memento/)  
  Captures and externalizes an object's internal state so it can be restored later, without violating encapsulation.

- [**Observer**](src/BehavioralDesignPatterns/Observer/)  
  Defines a one-to-many dependency so that when one object changes state, all its dependents are notified.

- [**State**](src/BehavioralDesignPatterns/State/)  
  Allows an object to alter its behavior when its internal state changes.

- [**Strategy**](src/BehavioralDesignPatterns/Strategy/)  
  Defines a family of algorithms, encapsulates each one, and makes them interchangeable.

- [**Template Method**](src/BehavioralDesignPatterns/TemplateMethod/)  
  Defines the skeleton of an algorithm, deferring some steps to subclasses.

- [**Visitor**](src/BehavioralDesignPatterns/Visitor/)  
  Separates an algorithm from the objects on which it operates, allowing new operations to be added without modifying those objects.

---

### Creational Patterns

- [**Abstract Factory**](src/CreationalDesignPatterns/AbstractFactory/)  
  Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

- [**Builder**](src/CreationalDesignPatterns/Builder/)  
  Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

- [**Factory Method**](src/CreationalDesignPatterns/FactoryMethod/)  
  Defines an interface for creating an object, but lets subclasses decide which class to instantiate.

- [**Prototype**](src/CreationalDesignPatterns/Prototype/)  
  Creates new objects by copying an existing object, known as the prototype.

- [**Singleton**](src/CreationalDesignPatterns/Singleton/)  
  Ensures a class has only one instance and provides a global point of access to it.

---

### Structural Patterns

- [**Adapter**](src/StructuralDesignPatterns/Adapter/)  
  Allows incompatible interfaces to work together by converting the interface of one class into another expected by the clients.

- [**Bridge**](src/StructuralDesignPatterns/Bridge/)  
  Decouples an abstraction from its implementation so that the two can vary independently.

- [**Composite**](src/StructuralDesignPatterns/Composite/)  
  Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions uniformly.

- [**Decorator**](src/StructuralDesignPatterns/Decorator/)  
  Adds additional responsibilities to an object dynamically.

- [**Facade**](src/StructuralDesignPatterns/Facade/)  
  Provides a simplified interface to a complex subsystem.

- [**Flyweight**](src/StructuralDesignPatterns/Flyweight/)  
  Reduces memory usage by sharing as much data as possible with similar objects.

- [**Proxy**](src/StructuralDesignPatterns/Proxy/)  
  Provides a surrogate or placeholder for another object to control access to it.

---

Each pattern directory contains example programs and, where relevant, both **Good** and **Ugly** implementations to illustrate best practices and common pitfalls.

## License

This repository is for educational purposes.