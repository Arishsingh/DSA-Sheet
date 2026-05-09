public class A64 {

    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            // left side numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // spaces
            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print(" ");
            }

            // right side numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
