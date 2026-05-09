//Display simple menu system.

public class A31{
    public void menu(int time){

        switch(time){

        case time <10  :
            System.out.println(" tea ");
            System.out.println(" banana ");
            System.out.println(" paratha ");
            System.out.println(" poha ");
            System.out.println(" thepla ");
            System.out.println(" idli ");
            System.out.println(" sambar ");
            break;

        case "time >=10 && time < 4") :
            System.out.println(" 1 ");
            System.out.println(" 2");
            System.out.println(" 3 ");
            System.out.println(" 4 ");
            System.out.println("5 ");
            System.out.println(" 6 ");
            System.out.println(" 7 ");
            break;


            case "time >=4 && time < 7" :
            System.out.println(" tea ");
            System.out.println("chips");
            System.out.println(" cofeee ");
            System.out.println(" poha ");
            System.out.println(" thepla ");
            System.out.println(" idli ");
            System.out.println(" sambar ");
            break;


            case "time >= 7 && time <= 10 " :
            System.out.println(" tea ");
            System.out.println(" banana ");
            System.out.println(" paratha ");
            System.out.println(" poha ");
            System.out.println(" thepla ");
            System.out.println(" idli ");
            System.out.println(" sambar ");
            break;


            default:
                System.out.println("niklo");

        }

    }
}



// Your code has a concept mistake: in Java, switch cannot use conditions like <, >, &&.
//switch only works with exact values (like 1, 2, "hello"), not ranges.
