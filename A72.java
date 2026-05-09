public class A72 {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int s = 0; s < 2 * (5 - i); s++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            //space
            for (int s = 0; s < 2 * (5 - i); s++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
