import java.util.*;
public class level1Q {
    public static void countt(ArrayList<Integer>list){
int count=0;
for(int i =0; i<list.size();i++){
    if(list.get(i)>10){
        count++;
    }
}
    System.out.print(count+" ");

    }
    public static void main(String[] args) {
       ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(11);
        list.add(13);
        countt(list);



    }
}
