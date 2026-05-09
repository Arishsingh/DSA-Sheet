public class A71 {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            //start
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }

            //space

            for (int s = 0; s < 2 * i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int s = 0; s < 2 * (5 - i); s++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
