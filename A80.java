public class A80 {

    public static int reverse(int n) {
        long reversedNum = 0;

        while (n != 0) {
            // 1. Get the last digit
            int digit = n % 10;

            // 2. Shift and add
            reversedNum = (reversedNum * 10) + digit;

            // 3. Remove the last digit
            n /= 10;

            // 4. Overflow check
            // as long reversedNum will be grater than int so have to check
            //
            if (
                reversedNum > Integer.MAX_VALUE ||
                reversedNum < Integer.MIN_VALUE
            ) {
                return 0;
            }
        }

        return (int) reversedNum;
    }

    public static void main(String[] args) {
        int num = -1234;
        System.out.println("Original: " + num);
        System.out.println("Reversed: " + reverse(num));
    }
}
