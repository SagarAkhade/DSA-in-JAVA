// Encapsulation in Java->>
// - Encapsulation is process in which we combine data and fuctions in single entity called class
// - Using Encapsulation we achieve Data Hiding
// - By providing only a setter or getter method, you can make the class read-only or write-only

//Example of Encapsulation
class StudentName {
    private String name;
    // getter function
    public String getName(){
        return this.name;
    }
    // setter function
    public void setName(String name){
        this.name = name;
    }
}
public class A_05_Encapsulation {
    public static void main(String[] args) {
        StudentName s1 = new StudentName();
        s1.setName("Sagar");
        System.out.println(s1.getName());  //Output: Sagar
    }
}
