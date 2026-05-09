import java.util.Scanner;

public class LCS {

    public static void main(String[] args) {

        System.out.println("LONGEST COMMON SUBSEQUENCE");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.next();

        System.out.print("Enter the second string: ");
        String str2 = sc.next();

        int m = str1.length();
        int n = str2.length();

        int[][] L = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                }

                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                }

                else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        System.out.println("Length of LCS is " + L[m][n]);

        int index = L[m][n];
        char[] lcs = new char[index];

        int i = m, j = n;

        while (i > 0 && j > 0) {

            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcs[index - 1] = str1.charAt(i - 1);
                i--;
                j--;
                index--;
            }

            else if (L[i - 1][j] > L[i][j - 1]) {
                i--;
            }

            else {
                j--;
            }
        }

        System.out.print("LCS string: ");
        System.out.println(new String(lcs));
    }
}
