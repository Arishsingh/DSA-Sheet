import java.util.*;
public class chocalate {
    public static int find(int arr [], int k){
if(arr.length<k){
    return -1;
}

Arrays.sort(arr);
int mindif= Integer.MAX_VALUE;
for(int i =0;i<arr.length-k;i++){
int diff =arr[i +k-1]-arr[i];
if(diff<mindif){
    mindif = diff;
}
}
return mindif;
    }
    public static void main(String [] args){
int [] arr={1,2,3,5,6,7};
int k =3;
int result = find(arr,k);
System.out.println(result);
    }
}
