//Reverse the array.
public class A9{
    public static void   reverse(int arr[]){
        for(int i = arr.length -1 ; i>=0 ; i--){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args []){
        int arr[]= {1,2,3,4,5};
        reverse(arr);
    }
    }
