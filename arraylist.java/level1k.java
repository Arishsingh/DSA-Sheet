
import java.util.*;
// Find the maximum and minimum number from the list?
public class level1k {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList <>();
int min=list.get(0);
int max=list.get(0);


list.add(1);
list.add(2);
list.add(4);
list.add(6);
list.add(3);
list.add(5);
list.add(7);
for(int i =1;i<list.size();i++){
        if( list.get(i)>max){
            max =list.get(i);
        }
        if(list.get(i)<min){
            min =list.get(i);
        }
    }
    System.out.print("maximum numbers are : " +max);
    System.out.print("minimum numbers are : " +min);

}

    }
