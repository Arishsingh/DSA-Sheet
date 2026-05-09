import java.util.Scanner;

public class StrassenMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        System.out.println("MATRIX MULTIPLICATION USING STRASSEN ALGORITHM");
        System.out.println("FOR 2 X 2 MATRICES");

        System.out.println("Enter the elements of the first matrix:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                b[i][j] = sc.nextInt();
            }
        }

        // Strassen Algorithm formulla 
        int m1 = (a[0][0] + a[1][1]) * (b[0][0] + b[1][1]);
        int m2 = (a[1][0] + a[1][1]) * b[0][0];
        int m3 = a[0][0] * (b[0][1] - b[1][1]);
        int m4 = a[1][1] * (b[1][0] - b[0][0]);
        int m5 = (a[0][0] + a[0][1]) * b[1][1];
        int m6 = (a[1][0] - a[0][0]) * (b[0][0] + b[0][1]);
        int m7 = (a[0][1] - a[1][1]) * (b[1][0] + b[1][1]);

        c[0][0] = m1 + m4 - m5 + m7;
        c[0][1] = m3 + m5;
        c[1][0] = m2 + m4;
        c[1][1] = m1 - m2 + m3 + m6;

        // Print Result Matrix
        System.out.println("Resultant matrix is:");

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}