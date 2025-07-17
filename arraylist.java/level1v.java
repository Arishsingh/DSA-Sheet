import java.util.*;
public class level1v {
    public static void number(ArrayList<Integer>list){
for(int i =list.size()-1;i>=0;i++){
    System.out.print(list.get(i));

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
