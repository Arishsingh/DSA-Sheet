public class A66 {

    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
