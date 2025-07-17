import java.util.*;
public class level1S {
    public static boolean countt(ArrayList<Integer>list){
int  number =1;
for(int i =0; i<list.size();i++){
    if(list.get(i)==number){
       return true;
    }
}
   return false;

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
    


