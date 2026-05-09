public class A16{
    public static  void access(String s ){
        for(int i =0 ; i<s.length()  ; i++){
       System.err.print(s.charAt(i));
        }
    }
    public static void main(String[] args) {
        A16 su = new A16();
        String s = "hello  by arish";
        su.access(s);
    }
}