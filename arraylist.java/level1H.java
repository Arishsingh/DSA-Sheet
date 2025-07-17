import java.util.*;
public class level1H {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.print(list);
        Collections.replaceAll(list,1, 100);
        System.out.print(list);

    }
}
//collection.replaceall(nameofarray,old value,newvalue)
 //it will repolace all occunrece of 1 to 100

 //or
 //list.set(0,100) it will only do changes at 1st index
