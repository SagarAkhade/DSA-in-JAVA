package com.company;
import java.util.HashMap;

// HashMap basic program
public class A_1_Hashing_6_HashMap_Implementation {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap1 = new HashMap<>();  // Syntax for implementation of HashMap

        // hmap1.put("key" , value);  --> map.put() method for putting values to HashMap
        hmap1.put("John", 30000);    // Adding elements to HashMap
        hmap1.put("Fredrick", 20000);
        hmap1.put("Mack", 25000);
        hmap1.put("Amy", 27000);

        System.out.println(hmap1);  // Printing our HashMap
        // Output - {Fredrick=20000, John=30000, Mack=25000, Amy=27000}  --> Order is not maintained here
        // When we add new value to same key it just get updated

        System.out.println("Size of our HashMap is : " + hmap1.size());  // hmap1.size(); method gives us size of our Hashmap
        // Output - 4

        if(hmap1.containsKey("Mack")){   // hmap1.containsKey("Mack"); method is to check whether given key is present in HashMap or not
            int val = hmap1.get("Mack");   // hmap1.get("Mack");  method gives value at that key
            System.out.println("The value for key Mack : " +val);
        }
    }
}
