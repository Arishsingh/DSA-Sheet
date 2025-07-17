import java.util.*;

public class level2L {
    public static void main(String[] args) {
        // First list
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(5, 1, 3));

        // Second list
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(6, 2, 4));

        // Merge them
        list1.addAll(list2);   // merge

        // Sort them
        Collections.sort(list1);

        // Print

        System.out.println(list1);
    }
}
