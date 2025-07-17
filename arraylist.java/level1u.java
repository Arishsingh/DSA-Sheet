import java.util.*;
public class level1u {
    public static void number(ArrayList<Integer>list){
for(int i =0;i<list.size();i++){
    if(i%2==0){
       System.out.print(list.get(i)+" ");
    }

}
    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(11);
        list.add(13);
       number(list);
}
}
