//sum of number
import java.util.*;
public class level1L {
    public static  int sum(ArrayList<Integer>list){
int sum =0;
for(int num:list){
    sum+=num;
}
    return sum;
}
public static void main(String[] args) {
ArrayList<Integer>list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
 int total = sum(list);
 System.out.print(total);
}
}

