
//linear search
public class minrotated {
    public static int rotated(int arr[]) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
    
        System.out.println("Minimum element is: " + min);
        return minIndex;
    }


    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        rotated(arr);

}


// binary search

public class inrotated {
    public static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                // Minimum is in the right half
                low = mid + 1;
            } else {
                // Minimum is in the left half including mid
                high = mid;
            }
        }
    

        // low == high is the index of the smallest element
        System.out.println("Minimum element is: " + arr[low]);
        return arr[low];
    
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        findMin(arr); // Output: Minimum element is: 0
}

}
