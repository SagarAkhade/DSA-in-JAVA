package bank;
// Packages And Access Modifiers in JAVA ->>
// - Package are the collection of similar type of items eg. package of pens, eraser, etc
// - Also in code everything inside the packages
// - Java has 2 types of packages :- 1) BuildInPackages and 2) User made packages
// - 1) BuildInPackages :-
//      - These are packages which are already present in Java
//      - eg. java.util.*;
// - To use the package they need to in specific folder and then import it where they required

// Access Modifiers :-
// - There 4 types of Access Modifiers in java
// - public, private, protected and default

// 1) public Access Modifiers :-
//     - Whenever we write public before any variable or function it is accessible to in whole class
//       and in other package also
//     - main method is always need to keep as public because actual execution starts from main method

// 2) Default Access Modifiers :-
//      - when we write nothing infront of any variable and function then it automatically becomes default
//      - Default Access Modifiers are accessed in whole class but not accessible in other package

// 3) Protected Access Modifiers :-
//      - When we use Protected Access Modifiers then whole class has access of it
//        but in other package only subclasses can access them

// 4) Private Access Modifiers :-
//      - Private Access Modifiers are accessed only inside same class
//      - Private Access Modifiers are not accessible outside the class or in any outside package
//      - when we want to access the protected data in java we use getters and setters functions
//      - getters give the protected information
//      - setters sets the value to protected variables

class Account {
    public String name;
    protected String email;
    private String password;

    //getters and setter function to access protected variables:
    // getter function
    public String getPassword(){
        return this.password;
    }
    // setter function
    public void setPassword(String pass){
         this.password = pass;
    }
}

public class Bank {
    public String name;
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.email = "apnacollege@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
        // Output: abcd
    }
}


/*-----------------------------------------*/
// New file 
// Continue Packages And Access Modifiers->>
// we use bank package here

import bank.Bank;

public class A_04_PackageAndAccessModifiers {
    public static void main(String[] args) {
        bank.Bank account1 = new bank.Bank();
        account1.name = "customer1";
    }
}
