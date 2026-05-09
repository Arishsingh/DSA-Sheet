public class A65 {

    public static void main(String args[]) {
        char m = 'A';
        for (int i = 0; i <= 5; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
