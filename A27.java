//Print day of week using number (1–7).

public class A27{
    public static void day(int number){
    switch (number) {
        case 1 :
            System.out.println("Monday");
            break;

            case 2 :
            System.out.println("Tuesday");
            break;

            case 3 :
            System.out.println("Wednesday");
            break;

            case 4 :
            System.out.println("Thrusday");
            break;

            case 5 :
            System.out.println("Friday");
            break;

            case 6 :
            System.out.println("Saturday");
            break;

            case 7 :
            System.out.println("Sunday");
            break;
        default:
            System.out.println("invalid");
    }
    }

}