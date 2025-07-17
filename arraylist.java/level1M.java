
//Find the size of the list.
import java.util.*;
public class level1M {
public static void  size(ArrayList<Integer>list){
    int sizeoflist=list.size();
    System.out.print(sizeoflist);
}

public static void main(String args[]){
    ArrayList<Integer>list=new ArrayList<>();
    list.add(1);
    size(list);
}
}
