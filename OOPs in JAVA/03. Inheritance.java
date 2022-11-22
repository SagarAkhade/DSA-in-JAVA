// Inheritance ->>
// - Inheritance means passing the data from one generation to other
// - In Java, Inheritance means when one of class wants to access the properties and methods of other class
// - Using Inheritance the reusability of code increases i.e. we don't need to declare same class again and again
// - Main class is called parent(base) class and the class use it is called child(sub) class

// Types of Inheritance :-
// - 1) Single level Inheritance :-
//      - It has single base class and one derived class
//      - eg. Shape->Triangle
// - 2) Multi level Inheritance :-
//      - It has chain of subclasses in single chain
//      - eg. Shape->Triangle->EquilateralTriangle
// - 3) Hierarchial Inheritance :-
//      - It has Single base class and multiple sub-classes having same parent class
//      - eg. Shape->Triangle    also   Shape->Circle
// - 4) Hybrid Inheritance :-
//      - Hybrid Inheritance is combination of all above Inheritance


// Example of Single level Inheritance
class Shape {
    String color;
    public void area() {
        System.out.println("Display Area");
    }
}
// Here this Triangle class has access to all properties and methods of Shape class
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

// Example of Multi level Inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

// Example of Hierarchial Inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class A_03_Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
