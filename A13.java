//Check if a number is even or odd.

public class A13{
    public static  void  evenn (int arr[]){
    for(int i =0;i<=arr.length-1 ; i++){
        if(arr[i] %2==0){
        System.out.println("even");
        }else{
            System.out.println("not even");
        }
    }
}
    public static void main(String[] args) {
        int [] arr= {1 , 2 ,3 };
        evenn(arr);


    }
}