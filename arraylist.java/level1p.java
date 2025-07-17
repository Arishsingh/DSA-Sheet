import java.util.*;
public class level1p {
    public static void  even(ArrayList<Integer>list){
for(int evenn:list){
    if(evenn%2==0){
        System.out.print(evenn+" ");
    }
}

    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        even(list);
    }
}
