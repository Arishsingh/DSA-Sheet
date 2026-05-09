//Find the average of array elements.

public class A8{
    public static void  average(int arr[]){
        int sum =0;
        for(int i =0;i<  arr.length;i++){
            sum += arr[i];
        }
        int averagesss =  sum/arr.length;
        System.out.println(averagesss);

    }
    public static void main(String[] args) {
        int arr [] = {5,4,3};
        average(arr);
    }
}