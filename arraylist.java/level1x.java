import java.util.*;
public class level1x {
    public static void replace(ArrayList<Integer>list){
        for(int i =0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.set(i,0);
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
        replace(list);
    }
}
