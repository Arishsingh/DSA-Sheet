public class A70 {

    public static void main(String args[]) {
        for (int i = 0; i <= 5; i++) {
            //space
            for (int s = 0; s <= 5 - i; s++) {
                System.out.print(" ");
            }

            //ascending

            for (char ch = 'E'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            //decending

            for (char ch = (char) ('E' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
