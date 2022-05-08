// link - https://www.geeksforgeeks.org/maximum-profit-by-buying-and-selling-a-share-at-most-twice/
// "static void main" must be defined in a public class.
/*
Q.20 Maximum profit by buying and selling a share at most twice
In daily share trading, a buyer buys shares in the morning and sells them on the same day.
If the trader is allowed to make at most 2 transactions in a day, whereas the second 
transaction can only start after the first one is complete (Buy->sell->Buy->sell). 
Given stock prices throughout the day, find out the maximum profit that a share trader 
could have made.
Input:   price[] = {10, 22, 5, 75, 65, 80}
Output:  87
*/
public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 22, 5, 75, 65, 80};
        int n = arr.length;
        System.out.println(maxTwoBuySell(arr, n));
    }
    
    // Most Optimal Solution - Time complexity -> O(N) Space complexity -> O(1) 
    public static int maxTwoBuySell(int[] arr, int n){
        int firstBuy = Integer.MIN_VALUE;
        int firstSell = 0;
        int secondBuy = Integer.MIN_VALUE;
        int secondSell = 0;
        for(int i=0; i<n; i++){
            firstBuy = Math.max(firstBuy, -arr[i]);
            firstSell = Math.max(firstSell, firstBuy + arr[i]);
            secondBuy = Math.max(secondBuy, firstSell - arr[i]);
            secondSell = Math.max(secondSell, secondBuy + arr[i]);
        }
        return secondSell;
    }
}
----------
Output - 
87
