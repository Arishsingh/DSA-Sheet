//Find the sum of all elements in an array


public class A2{
    public static void  sum (int arr[]){
        int sum = 0;
        for(int i =0 ; i <   arr.length ; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int [] arr = {1,2,3,4,5};
        sum (arr);

    }
}

