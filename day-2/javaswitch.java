public class javaswitch {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("It's Monday.");
                // break;
            default:
                System.out.println("It's Monday!!! go to work."); //here the default case will be executed because there is no break statement, normal ah execute aagum
                break;
            case "Tuesday":
                System.out.println("It's Tuesday.");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday.");
                break;
            case "Thursday":
                System.out.println("It's Thursday.");       
                break;
            case "Friday":
                System.out.println("It's Friday.");
                break;
                case "Saturday":
                System.out.println("It's Saturday.");
                break;
                case "Sunday":
                System.out.println("It's Sunday.");
                break;
            // default:
            //     System.out.println("It's not a weekday.");
        }

    }
}
// case "a" => case "A" -> System.out.println("It's A."); no break and colon is needed here the statement will be executed for both cases a and A. This is called fall-through behavior in switch statements.