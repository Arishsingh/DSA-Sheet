
public class pairsum {
    public static boolean pair(int arr[], int targetSum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // start j from i+1 to avoid duplicate/self-pairs
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + targetSum);
                    return true;
                }
            }
        }
        System.out.println("No pair found with sum " + targetSum);
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int targetSum = 16;
        pair(arr, targetSum);
    }
}
