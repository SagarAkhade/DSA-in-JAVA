// "static void main" must be defined in a public class.
//Q. Print all subset of an Array
//Input: arr = {1, 2, 3};
//Output : [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subset(arr));
    }
    public static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<Integer>());
        for(int num : arr) {
            int n = outerList.size();
            for(int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outerList.get(i));
                internal.add(num);
                outerList.add(internal);
            }
        }
        return outerList;
    }
}
