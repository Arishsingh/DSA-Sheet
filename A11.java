//Copy elements from one array to another array.
    public class A11{
        public static int copy(int arr[]){
            int arr2[] = new int[arr.length];
            for(int i =0 ; i<= arr.length-1 ; i++){
                arr2[i] = arr[i];
                System.out.print(arr2[i] + " ");
            }
            return 0;
        }
        public static void main(String args[]){
            int arr[] = {1,2,3,4};
            copy(arr);
        }


    }