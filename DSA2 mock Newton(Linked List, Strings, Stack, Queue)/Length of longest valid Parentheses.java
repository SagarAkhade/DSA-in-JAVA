// "static void main" must be defined in a public class.
public class Main {
     public static void main(String[] args){
        String str = "(()()";
        System.out.println(maxLength(str));
    }
    static int maxLength(String str){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int result = 0; 
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '('){
                stack.push(i);
            }
            else{
                if(!stack.empty()){
                    stack.pop();
                }
                if (!stack.empty()){
                    result= Math.max(result, i - stack.peek());
                }
                else
                    stack.push(i);
            }
        }
        return result;
    }
}
-----------
Output : 
4
