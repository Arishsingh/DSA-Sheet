public class A69 {

    public static void main(String args[]) {
        for (int i = 0; i < 4; i++) {
            //space
            for (int s = 0; s <= 4 - i; s++) {
                System.out.print(" ");
            }

            //scending

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            //decending

            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
