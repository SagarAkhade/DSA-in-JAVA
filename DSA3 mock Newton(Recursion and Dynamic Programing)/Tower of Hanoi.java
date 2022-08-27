// "static void main" must be defined in a public class.
/*
Link: https://www.geeksforgeeks.org/c-program-for-tower-of-hanoi/
Q. Tower of Hanoi
Input : 2
Output : Disk 1 moved from A to B
         Disk 2 moved from A to C
         Disk 1 moved from B to C

Input : 3
Output : Disk 1 moved from A to C
         Disk 2 moved from A to B
         Disk 1 moved from C to B
         Disk 3 moved from A to C
         Disk 1 moved from B to A
         Disk 2 moved from B to C
         Disk 1 moved from A to C
*/
public class Main { 
    public static void main(String[] args) {
        int n = 2;
        towerOfHanoi(n, 'A', 'C', 'B');
    }
    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if(n == 0){
            return;
        }
        towerOfHanoi(n-1, fromRod, auxRod, toRod);
        System.out.println("Disk " + n + " moved from " + fromRod + " to " + toRod);
        towerOfHanoi(n -1, auxRod, toRod, fromRod);
    }
}
