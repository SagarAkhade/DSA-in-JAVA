// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
Check balanced parenthesis
Check for Balanced Brackets in an expression (well-formedness) using Stack
Input: exp = “[()]{}{[()()]()}” 
Output: Balanced
Input: exp = “[(])” 
Output: Not Balanced 
*/
public class Main {
    public static void main(String[] args) {
        String str = "[()]{}{[()()]()}";
        
        if(isValid(str)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
  
   //Most Optimal Solution : Time Complexity - O(N)  Space Complexity - O(1) 
    public static boolean isValid(String str){
        char[] charArray = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(char c : charArray){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.peek();
                    if((c==')' && top=='(') || (c=='}' && top=='{') || (c==']' && top=='[')){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}

-------------
Output : 
Balanced
