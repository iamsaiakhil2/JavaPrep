public class Switch_case {
    public static void main(String[] args) {
        int day = 6;
        switch (day) {
            case 1,7:
                System.out.println("8AM");
                break;
            case 2,3,6:
                System.out.println("6AM");
                break;
            case 5:
                System.out.println("9AM");
                break;
            case 4:
                System.out.println("7AM");
                break;
            default:
                System.out.println("12PM");
        }
        switch (day) {
            case 1, 7 -> System.out.println("8AM");
            case 2, 3, 6 -> System.out.println("6AM");
            case 5 -> System.out.println("9AM");
            case 4 -> System.out.println("7AM");
            default -> System.out.println("12PM");
        }
    }

}
