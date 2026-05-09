//Find the largest element in an array.
public class A4 {

    public static int largest(int arr[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println(large);
        return large;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        largest(arr);

    }
}


