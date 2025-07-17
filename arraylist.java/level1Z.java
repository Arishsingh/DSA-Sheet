import java.util.*;
public class level1Z {
    public static void average(ArrayList<Integer>list){
    int sum=0;
    for(int i =0;i<list.size();i++){
        sum+=list.get(i);
    }
        double  avg = (double) sum/list.size();
        System.out.println(avg);
    
    }
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(89);
        list.add(67);
        list.add(13);
        list.add(19);
        list.add(69);
        System.out.println("avarage: ");
        average(list);
    }
}
