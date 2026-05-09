public class A17{

    public static boolean  search(String s1 , String s2){

        return(s1.equals(s2));

    }
    public static void main(String[] args) {
        A17 meow = new A17();
        String s1 = "arish";
        String s2 = "arish";
        if (meow.search(s1, s2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

    }
}