// Abstraction in Java ->>>
// - Abstraction is showing only important data to user and hide un-important data
// - There are two ways to use Abstraction in Java
//      - 1) using abstract classes, functions and properties
//      - 2) using interfaces

// 1) using abstract classes, functions and properties ->
// - Abstract is basically use for that thing which not necessarily use in code
// - using abstract keyword before method we don't need to write that method completely
// - Abstract is only concept that cannot be actually used
// - Abstract class must be declare with abstract keyword
// - It can have abstract and non-abstract methods

// Constructor chaining ->>
// - It is just simply, first parent constructor called then its child constructor will be called
// - i.e. Constructor of Parent class -> then Constructor of Child class executed

// Example of Abstraction
abstract class Animal{
     abstract void walk();  //abstract method
    public void eat(){
        System.out.println("Animal can eat");
    }
    // Constructor of animal class
    Animal(){
        System.out.println("You are creating a new animal");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

// 2) Using Interfaces->>
// - Interfaces are pure abstract type
// - Interfaces are similar to classes, but they have fixed properties
// - Interfaces defined using interfaces keyword
// - Interfaces don't have constructors
// - Interfaces are not extends they are implements
// Multiple Inheritance ->
// - With Interfaces, single child class can have multiple parent classes this is called Multiple Inheritance
// - Multiple Inheritance is only possible using Interfaces

// Example of Interfaces
interface Animal1{
    public void walk1();
}
interface Herbivore{}
class Elephant implements Animal1, Herbivore{
    public void walk1(){
        System.out.println("Walks on 4 legs");
    }
}

// static keyword in Java ->>>
// - using static keyword the properties or method are accessible in whole program
// - for making any variable or method to be common in all code we use static keyword

// Example of static
class Student2{
    String name;
    static String school;
    public static void changeSchool() {
        school = "newSchool";
    }
}

public class A_06_Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();   // Output : Walks on 4 legs
        horse.eat();    // Output : Animal can eat

        // for Interfaces
        Elephant elephant = new Elephant();
        elephant.walk1();   // Output : Walks on 4 legs

        // for static keyword
        Student2.school = "JMV";
        Student2 student2 = new Student2();
        student2.name = "tony";
        System.out.println(student2.school);  // Output : JMV
    }
}
