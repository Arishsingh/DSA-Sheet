import java.util.*;
public class p9 {
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>commonlist = new ArrayList<>();

        list1.add(10);
    list1.add(20);
    list1.add(30);
    list1.add(40);
    list1.add(50);
    list2.add(30);
    list2.add(40);
    list2.add(60);
    list2.add(70);

    for(Integer num : list2){
        if(list1.contains(num)){
            commonlist.add(num);
        }
    }
    System.out.println("common lidt is :"+ commonlist);

    }
}
