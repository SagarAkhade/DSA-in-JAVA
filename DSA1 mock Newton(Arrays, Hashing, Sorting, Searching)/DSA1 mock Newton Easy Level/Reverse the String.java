public class Main {
    public static void main(String[] args) {
        System.out.println("Revese String! ");
        String str = "sagar";
        System.out.print(str);
        System.out.println();
        revString(str);
    }
    static void revString(String str){
        char[] chars = str.toCharArray();
        for(int i=chars.length-1; i>=0; i--){
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
----------------------
Output :-
Revese String! 
sagar
ragas
