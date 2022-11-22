// Polymorphism ->>
// - The word Polymorphism made of two words poly + morphism
// - poly(many) & morphism(forms) ie. many forms
// - There are two types of Polymorphism
// - 1) Compile time Polymorphism (Function Overloading)
// - 2) Run time Polymorphism (Function Overriding)

// 1) Function Overloading(Compile time Polymorphism) ->>
// - Function Overloading means when we create multiple function with same name
//   but with different arguments and do different things
// - Function Overloading is also called as Compile time Polymorphism

// 2) Function Overriding(Run time Polymorphism) ->>
// - Runtime polymorphism is also known as dynamic polymorphism
// - Function overriding means when the child class contains the method which is already present in the parent class.
// - Hence, the child class overrides the method of the parent class.
// - In case of function overriding, parent and child classes both contain the same function with a different definition
// - The call to the function is determined at runtime is known as runtime polymorphism.

// Example of Function Overloading(Compile time Polymorphism)
class Student1{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

// Example of Function Overriding(Run time Polymorphism)
class Shape1{
    public void area(){
        System.out.println("Display area");
    }
}
class Rectangle extends Shape1{
    public void area(int l, int b) {
        System.out.println(l*b);
    }
}

public class A_02_Polymorphism {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "aman";
        s1.age = 24;

        //Polymorphism(Function Overloading)
        s1.printInfo(s1.name);         // Output: aman
        s1.printInfo(s1.age);          // Output: 24
        s1.printInfo(s1.name, s1.age); // Output: aman 24

        //Polymorphism(Function Overriding)
        Rectangle rectangle = new Rectangle();
        rectangle.area();               // Output: Display area
        rectangle.area(3,4);            // Output: 12
    }
}
