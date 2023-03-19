package java_lab.other.Test;
public class inheritance {

}
//    Inheritance is a fundamental concept in object-oriented programming that allows you to create new classes based
//        on existing classes. In Java, you can use inheritance to define a new class that inherits the properties and behaviors of an existing class.
//
//        The class that is being inherited from is called the "superclass" or "parent class", while the class that is inheriting
//        is called the "subclass" or "child class". The subclass can add new properties and methods, or it can override existing ones.
//
//        Here's an example of how inheritance works in Java:

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}

    Dog dog = new Dog("Max", 2, "Labrador");
    dog.eat();    // prints "The animal is eating."
        dog.sleep();  // prints "The dog is sleeping."
        dog.bark();   // prints "The dog is barking."

//            Single inheritance:
//            Single inheritance is when a subclass extends only one superclass. It is the most commonly used type of inheritance.
//            In single inheritance, the subclass inherits all the properties and methods of the superclass.

public class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}
//    Multilevel inheritance:
//        Multilevel inheritance is when a subclass extends another subclass. In this type of inheritance, the properties and methods of the superclass
//        are inherited by the subclass, and the properties and methods of the subclass are inherited by the next subclass in the hierarchy.
public class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}

public class Labrador extends Dog {
    public void swim() {
        System.out.println("The Labrador is swimming.");
    }
}
//    Hierarchical inheritance:
//        Hierarchical inheritance is when multiple classes extend the same superclass. In this type of inheritance, the properties and methods
//        of the superclass are inherited by all the subclasses.
public class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}

public class Cat extends Animal {
    public void meow() {
        System.out.println("The cat is meowing.");
    }
}
//    Hybrid inheritance:
//        Hybrid inheritance is a combination of two or more types of inheritance. For example, a class may use both single and
//        multiple inheritance, or it may use hierarchical and multilevel inheritance.
public class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

public interface Swim {
    public void swim();
}

public class Dog extends Animal implements Swim {
    public void bark() {
        System.out.println("The dog is barking.");
    }

    public void swim() {
        System.out.println("The dog is swimming.");
    }
}

//    Multiple inheritance:
//        Multiple inheritance is when a subclass extends more than one superclass. In Java, multiple inheritance is achieved
//        using interfaces, as Java does not support multiple inheritance with classes.
public interface Swim {
    public void swim();
}

public interface Walk {
    public void walk();
}

public class Duck implements Swim, Walk {
    public void swim() {
        System.out.println("The duck is swimming.");
    }

    public void walk() {
        System.out.println("The duck is walking.");
    }
}

public interface Shape {
    public double getArea();
    public double getPerimeter();
}
//An interface in Java is a way to define a contract that classes must follow in order to be considered "implementers" of that interface. The contract defines a
//        set of methods that the implementing class must provide, but it does not specify how those methods should be implemented.
//        This allows for greater flexibility in programming, as it separates the interface (what should be done) from the implementation (how it should be done).
//
//        Interfaces can be used to define a set of common methods that multiple classes may need to implement. For example, the Java standard library
//        includes the "Comparable" interface, which defines a method "compareTo()" that can be used to compare two objects. By implementing the
//        "Comparable" interface, a class can specify how instances of that class should be compared to each other.
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
//The "super" keyword is used to refer to the immediate parent class of a subclass. It is used to call a constructor or a
// method of the parent class, or to access a member variable or method of the parent class that is hidden by a member variable
// or method in the subclass. For example, the following code uses the "super" keyword to call the constructor of the parent class:
class Parent {
    public Parent(int x) { ... }
}

class Child extends Parent {
    public Child(int x) {
        super(x); // calls the constructor of the Parent class
    }
}

//The "this" keyword, on the other hand, is used to refer to the current object or instance of a class.
//        It is used to access member variables or methods of the current object, or to pass the current object as a parameter
//        to a method. For example, the following code uses the "this" keyword to access a member variable of the current object:
class MyClass {
    private int x;

    public void setX(int x) {
        this.x = x; // sets the value of x for the current object
    }
}
