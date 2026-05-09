public class A59{
    public static void main(String[] args) {
        for(int i = 0 ; i<5;i++){
            //space
            for(int j = 0 ; j<= 6-i+1 ; j++ ){
                System.out.print(" ");
            }
            //star
            for(int j = 1 ; j<= 2*i+1 ; j++){
                System.out.print("*");
            }

            for(int j = 0 ; j<= 6-i+1 ; j++ ){
                System.out.print(" ");
            }

            System.out.println();
        }

        for(int i = 5 ; i>=0 ; i--){
            for(int j = 0 ; j<= 6-i+1 ; j++ ){
                System.out.print(" ");
            }

        //star
            for(int j = 1 ; j<= 2*i+1 ; j++){
                System.out.print("*");
            }

            //space
             for(int j = 0 ; j<= 6-i+1 ; j++ ){
                System.out.print(" ");
            }
        System.out.println();

        }
    }
}