import java.util.*;

public class A79 {

    public static int check(int n) {
        int cnt = (int) (Math.log10(n) + 1);
        return cnt;
    }

    public static void main(String[] args) {
        int n = 245;
        int result = check(n);
        System.out.print(result);
    }
}
