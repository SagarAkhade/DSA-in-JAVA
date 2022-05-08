package com.company;
import java.util.*;

// HashSet Implementation
public class A_1_Hashing_7_HashSet_Implementation {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();  // Declaration of HashSet

        // HashSet only stores the one value and duplicates are not allowed in HashSet
        hset.add("Italy");  // hset.add(value); method used for adding values in HashSet
        hset.add("Cuba");
        hset.add("Russia");
        hset.add("Maldives");

        System.out.println(hset);  // Printing HashSet --> Order is not maintained here
        // Output -> [Cuba, Maldives, Italy, Russia]

        hset.remove("Cuba");   //  hset.remove("Cuba"); method will remove data
        System.out.println("After removing Cuba : " + hset);
        // Output -> After removing Cuba : [Maldives, Italy, Russia]

        System.out.println("Is Italy present : " + hset.contains("Italy"));  // hset.contains("Italy"); checks whether data present in HashSet or not and returns boolean value
        // Output -> Is Italy present : true

        System.out.println("Iterating over HashSet : ");
        Iterator<String> vals = hset.iterator();  // iterating over HashSet
        while(vals.hasNext()){  // vals.hasNext(); method checks whether next element is present or not
            System.out.println(vals.next());  // vals.next(); to go to next value of HashSet
        }
        // Output ->
        // Iterating over HashSet :
        // Maldives
        // Italy
        // Russia
    }
}
