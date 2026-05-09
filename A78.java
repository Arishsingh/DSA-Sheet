public class A78 {

    public static int check(int n) {
        int cntr = 0;
        while (n > 0) {
            cntr = cntr + 1;
            n = n / 10;
        }
        return cntr;
    }

    public static void main(String[] args) {
        int n = 2345;
        int result = check(n);
        System.out.print(result);
    }
}
