import java.util.Arrays;

public class lonely {

    public static void lone(int[] num) {
        Arrays.sort(num); // Sort the array

        for (int i = 0; i < num.length; i++) {
            boolean isLonely = true;

            // Check previous element
            if (i > 0) {
                if (num[i] == num[i - 1] || num[i] - 1 == num[i - 1]) {
                    isLonely = false;
                }
            }

            // Check next element
            if (i < num.length - 1) {
                if (num[i] == num[i + 1] || num[i] + 1 == num[i + 1]) {
                    isLonely = false;
                }
            }

            if (isLonely) {
                System.out.println("Lonely number: " + num[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {10, 6, 5, 8};
        lone(num);
    }
}

