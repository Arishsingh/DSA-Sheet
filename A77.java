public class A77 {

    public static void main(String[] args) {
        //space
        int n = 10;
        for (int i = 0; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print("   ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" " + " *   ");
            }

            System.out.println();
        }
    }
}

/*




*/
