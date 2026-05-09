import java.util.*;

public class A84 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                sb.append(arr[j][i]).append(" ");
            }
        }

        System.out.print(sb);
    }
}
