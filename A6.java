//Count how many even numbers are in the array.

public class A6 {
        public static int even (int arr[]) {
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println(even);
        return even;
    }

    public static void main (String[] args ) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        even(arr);

    }
}
