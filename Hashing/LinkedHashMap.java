package com.company;
import java.util.*;

// LinkedHahMap implementation
public class A_1_Hashing_7_LinkedHashMap_Implementation {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhmap = new LinkedHashMap<>();  // Declaration of LinkedHashMap

        // The LinkedHaspMap maintains the order while putting key-value pair and this is only difference between HashMap and LinkedHashMap
        lhmap.put("Oman", "Muscat");  // lmap.put(); method for putting key-value pair in LinkedHashMap
        lhmap.put("India", "Delhi");
        lhmap.put("Russia", "Moscow");
        lhmap.put("Japan", "Tokyo");

        System.out.println(lhmap); // here we are printing LHP
        // Output --> {Oman=Muscat, India=Delhi, Russia=Moscow, Japan=Tokyo} --> Order is maintained here

        System.out.println("The size of LinkedHashMap is : " + lhmap.size());  // lhmap.size(); method used for getting size of LHM
        // Output --> The size of LinkedHashMap is : 4

        System.out.println("The value for key 'Oman' is : " + lhmap.get("Oman"));  // get(key); method gives value for particular key
        // Output --> The value for key 'Oman' is : Muscat

        System.out.println("Does it have 'Russia' key : " + lhmap.containsKey("Russia"));  // lhamp.containsKey(key); method for checking whether key present in LHM or not & return boolean value
        // Output --> Does it have 'Russia' key : true

        System.out.println("Deleting element 'Oman' " + lhmap.remove("Oman"));  // remove(key); method removes particular key
        // Output --> Deleting element 'Oman' Muscat

        System.out.println(lhmap); // here we are printing LHP
        // Output --> {India=Delhi, Russia=Moscow, Japan=Tokyo}  --> Here Oman=Muscat deleted

    }
}
