public class A81 {

    public boolean pallindrome(int n) {
        int dup = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = (reverse * 10) + digit;
            n = n / 10;
        }
        return dup == reverse;
    }

    public static void main(String[] args) {
        int n = 11223;
        A81 obj = new A81();
        if (obj.pallindrome(n)) {
            System.out.print("meow meow");
        } else {
            System.out.print("its not a pallindrome");
        }
    }
}
