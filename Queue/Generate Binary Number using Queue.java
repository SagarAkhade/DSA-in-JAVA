package com.company.A_8_Queue;
import java.util.*;

// Q. Generate Binary Number using queue | Coding Interview question
public class A_8_Queue_2_Generate_Binary_Number_Using_Queue {
    public static void main(String[] args) {
        int n = 4;
        String[] result = generateBinaryNumber(n);
        for(int i=0; i<n; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static String[] generateBinaryNumber(int n){
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>(); //creating Queue as LinkedList
        q.offer("1");   //q.offer(object) -> method directly insert element last FIFO
        for(int i=0; i<n; i++){
            result[i] = q.poll();  //q.poll() -> method removes element at first FIFO
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }
}
------------
Output - 
1 10 11 100
