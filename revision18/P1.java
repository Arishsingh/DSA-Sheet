import java.util.*;
public class P1{
public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(3,9);
list.set(1,10);
list.remove(2);
list.remove(Integer.valueOf(10));

if(list.contains(2)){
    System.out.println("true");
}
int index  = list.indexOf(4);
System.out.println("index of  4 is : " + index);

for (Integer lists : list) {
    System.out.println(lists);
}
list.clear();
if (list.isEmpty()){
    System.out.println("yes its empty");
}
ArrayList<Integer> meow = new ArrayList<>();
Collections.sort(list);
meow .addAll(list);
}

}