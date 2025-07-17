//Count how many numbers in the list are greater than 3 or Print only even numbers from the list?

import java.util.*;

public class level1J {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 3;
        int sum = 0;

        list.add(1);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(4);
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > count) {
                sum += list.get(i);  // ✅ Add the number from the list
            }
        }

        if (sum % 2 == 0) {
            System.out.println("Sum of numbers > 3 is even: " + sum);
        } else {
            System.out.println("Sum of numbers > 3 is odd: " + sum);
        }
    }
}
