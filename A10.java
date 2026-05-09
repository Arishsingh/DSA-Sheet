//Search for a number in an array (linear search).

public class A10{
    public static  void search(int arr[] , int target){
        for(int i =0; i<=arr.length-1 ; i++){
            if(arr[i]==target){
                System.out.println("target founded at : " + i);
                return;
            }
        }
        System.out.println("target not found");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target =4;
        search(arr,target);
    }
}