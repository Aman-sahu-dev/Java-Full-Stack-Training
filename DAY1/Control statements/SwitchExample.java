public class SwitchExample {
    public static void main(String[] args) {
        String fruitColor = "red";

        switch (fruitColor) {
            case "red":
                System.out.println("Apple");
                break;
            case "yellow":
                System.out.println("Banana");
                break;
            case "orange":
                System.out.println("Orange");
                break;
            default:
                System.out.println("Unknown fruit");
        }

        // Example 2
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Default block");
        }
    }
}
