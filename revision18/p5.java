import java.util.*;

public class p5 {
    public static void main(String[] args) {
ArrayList<String>list = new ArrayList<>();
list.add("delhi");
list.add("mumbai");
list.add("banglore");
list.add(0,"kolkata");
list.add("chennai");

for(String  lists : list){
    System.out.print(lists + " ");
}
    }
}
