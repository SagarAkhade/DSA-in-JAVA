// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
Q. print all permutations of a given string 
Input : abc
Output :
abc 
acb
bac
bca
cab
cba
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int start = 0;
        int end = str.length() - 1;
        
        permutatuions(str, start, end);
    }
    
    //Most Optimal Solution : Time Complexity - O(N) Space Complexity - O(N) 
    public static void permutatuions(String str, int start, int end){
        if(start == end){
            System.out.println(str);
        }
        else{
            for(int i = start; i <= end; i++){
                str = swap(str, start, i);
                permutatuions(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }
    
    public static String swap(String str, int start, int i){
        char[] charArray = str.toCharArray();
        char temp =  charArray[start];
        charArray[start] = charArray[i];
        charArray [i] = temp;
        return new String(charArray);
    }
}

/*
---------------------
Input : abc
Output : 
abc
acb
bac
bca
cba
cab
*/
