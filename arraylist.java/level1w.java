import java.util.*;
public class level1w {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
           return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to print prime numbers from the list
    public static void printPrimes(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (isPrime(list.get(i))) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(11);
        list.add(13);
        list.add(4);
        list.add(9);
        list.add(17);

        printPrimes(list);
    }
}


