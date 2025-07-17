//kandels algorithm
public class subarr{
    public static int sub(int arr[]){
int currsum=arr[0];
int maxsum =arr[0];
for(int i =0;i<arr.length;i++){
    currsum = Math.max(arr[i]+ currsum ,  arr[i]);
maxsum = Math.max(currsum , maxsum);

}
return maxsum;
    }
    public static void main(String [] args){
        int arr[]={1,2,3,4,6};
        sub(arr);
    }
}