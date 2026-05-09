//Count how many odd numbers are in the array.

public class A7{
    public static int  odd(int arr[]){
        int odd=0;
        for(int i =0; i< arr.length ; i++){
            if(arr[i] % 2 != 0){
            odd++;
                }
            }
            System.out.println(odd);
            return odd;
        }
        public static void main(String[] args) {
            int arr[] = {1,2,3,4};
            odd(arr);
        }
    }
