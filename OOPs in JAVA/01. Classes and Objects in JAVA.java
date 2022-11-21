// Classes and Objects in JAVA:-

// Class ->>
// - Classes and objects are invented to solve real world problems using programing
// - Example1 : Suppose we have the Animal class and the different-different
//              sub-animals are the Objects(entity) of that class
// - Example2 : Suppose in Car company be Audi is class and different-different
//             cars of the Audi are objects of that class
// - Example3 : Pen is class and different colors of pens are its objects
// - main function comes under public class where actual execution of program starts
// - name of classes always start with Capital letters

// Methods ->>
// - Functions which we define inside the class are called Methods

// this keyword ->>
// - this keyword refers to the current object in a method or constructor

// new keyword ->>
// - In Java when we use new keyword it will completely create new empty object in memory

// Constructor in Java :-
// - Name of constructor and name of class is always same
// - Constructor donot return anything
// - Constructor donot have any return type ie. no void, no int return type
// - for one object constructor will be called only once
// - In Java there is no destructor, java has garbage collector which automatically deletes unuse variables
// - Constructors in Java has 3 types
// - 1) Non-parameterize constructors :- These constructors doesn't have parameters
// - 2) Parameterize constructors:- These constructors have parameters
// - 3) Copy Constructor :- These will copy one object to another object


//Example 1 :
//Creating the class Pen with some properties and methods
class Pen{
    //these below are properties of class (also called data)
    String color;
    String type; //ballpoint, gel

    // This is method (also called members)
    public void write(){
        System.out.println("Writing something" );
    }
    public void printColor() {
        System.out.println(this.color);
    }
}


//Example 2 :
//Creating the class Student with some properties and methods
class Student {
    String name;
    int age;

    // This is constructor for the class student
    // 1) Non-parameterized constructor:
    //    Student() {
    //        System.out.println("Constructor called");
    //    }
    // Whenever object of this class is created this constructor called

    // 2) Parameterized constructor:-
    //    Student(String name, int age){
    //        this.name = name;
    //        this.age = age;
    //    }

    // 3) Copy Constructor :-
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
    Student(){}
    public void printInfo() {
        System.out.println(this.name + " " + this.age);
    }
}

public class A_01_classesAndObjects {
    public static void main(String[] args) {
        // Creating Object of class pen
        Pen pen1 = new Pen();
        pen1.color = "blue";   // assigning properties
        pen1.type = "gel";

        // calling method of the class
        pen1.write();
        //Output: Writing something

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();  //Output: blue
        pen2.printColor();  //Output: black

        //Example 2
        // using parameterized constructor
        //  Student s1 = new Student("aman", 24);
        //Using copy constructor
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        Student s2 = new Student(s1);
        s2.printInfo();
        //Output: aman 24
    }
}
