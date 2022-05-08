// "static void main" must be defined in a public class.
public class Main {
    public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		if(isAnagram(str1, str2)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
    
static boolean isAnagram(String str1, String str2){
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for(char ch1 : arr1){
            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
    }
    for(char ch2 : arr2){
       map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
    }

		if(map1.equals(map2)){
			return true;
		}
		else{
			return false;
		}
	}
}
-------
Inputs :-
naman
manan
Output :-
YES
