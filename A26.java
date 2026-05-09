//check if a string is pallindrome or not
public class A26{
    public static void  ckeck(String s ){
        String t = "";
    for(int i = s.length()-1; i>=0 ;i--){
    t = t + s.charAt(i);
    }
    if(t.equals(s)){
        System.out.println("its a pallindrome");
    }else{
        System.out.println("they are not pallindrome");

}
    }
public static void main(String[] args) {
        String s = "aa";
        ckeck(s);
    }
}