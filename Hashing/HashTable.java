package com.company;
import java.util.*;
import java.util.Hashtable;

public class A_1_HashTable_5_Basic_Implementation {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>(); // Basic Syntax of Hashtable

        ht.put(1, "A");  // put() method for inserting key - value pair in Hashtable
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");

        System.out.println(ht);  // Here Simply print our Hashtable
        // Output here -> {4=D, 3=C, 2=B, 1=A}

        String val = ht.get(3);   // get(key) -> get method is for getting value at particular key
        System.out.println(val);
        // Output here -> C

        ht.remove(2); // remove(key); method will remove key-vale pair at key 2
        System.out.println(ht);
        // Output here -> {4=D, 3=C, 1=A}  -> 2=B get removed

        Iterator<Integer> itr = ht.keySet().iterator(); // This Method for iterating Hashtable
        while(itr.hasNext()){   // itr.hasNext() method checks whether our table is empty or not
            Integer key = itr.next();
            String value = ht.get(key);
            System.out.println("KEY: " + key + ", VALUE: " + value);
        }
    }
}
-------------
Output -
{4=D, 3=C, 2=B, 1=A}
C
{4=D, 3=C, 1=A}
KEY: 4, VALUE: D
KEY: 3, VALUE: C
KEY: 1, VALUE: A
