import java.util.*;
public class A89{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
           int[][] arr = new int[row][col];

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
            arr[i][j] = sc.nextInt();
            }
        }


        int meow = arr[0][0]
        for(int i =0;i<row ;i++){
            for(int j =0;j<col ;j++){
                if(arr[i][j] > meow){
                    meow = arr[i][j];
                }

            }
        }
          System.out.print(meow);
    }
}
