public class A82 {

    public static int find(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        int result = find(n1, n2);
        System.out.print(result);
    }
}
