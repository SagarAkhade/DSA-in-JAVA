// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/program-remove-vowels-string/
Q. remove all the vowels from a string.
Input : welcome to geeksforgeeks
Output : wlcm t gksfrgks
Input : what is your name ?
Output : wht s yr nm ?
*/
public class Main {
    public static void main(String[] args) {
        String str = "welcome to geeksforgeeks";
        System.out.println(removeVowelsOpti(str));
    }
    
    //Optimal Solution : Time Complexity - O(N)  Space Complexity - O(1) 
    public static String removeVowelsOpti(String str){
         return str.replaceAll("[aeiouAEIOU]", "");
    }
    
    //BruteForce Solution : Time Complexity - O(N)  Space Complexity - O(N) 
    public static String removeVowelsBrute(String str){
        char[] chars = str.toCharArray();
        Set<Character> vowels = Set.of('a','e','i','o','u');
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            if(!vowels.contains(chars[i])){
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}

-------
Output :
wlcm t gksfrgks
