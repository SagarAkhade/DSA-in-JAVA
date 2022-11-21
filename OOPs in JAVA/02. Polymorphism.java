// Polymorphism ->>
// - The word Polymorphism made of two words poly + morphism
// - poly(many) & morphism(forms) ie. many forms
// - There are two types of Polymorphism
// - 1) Function Overloading : Compile time Polymorphism
// - 2) Function Overriding : Run time Polymorphism (will discuss it later)

// 1) Function Overloading ->>
// - Function Overloading means when we create multiple function with same name
//   but with different arguments and do different things
// - Function Overloading is also called as Compile time Polymorphism

// Example of Polymorphism
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
public class A_02_Polymorphism {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "aman";
        s1.age = 24;

        //Polymorphism(Function Overloading)
        s1.printInfo(s1.name);         // Output: aman
        s1.printInfo(s1.age);          // Output: 24
        s1.printInfo(s1.name, s1.age); // Output: aman 24
    }
}
