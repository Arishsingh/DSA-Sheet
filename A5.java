//Find the smallest element in an array.

public class A5 {

    public static int smallest(int arr[]) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println(small);
        return small;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        smallest(arr);
    }
}
