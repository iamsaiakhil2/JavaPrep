public class Even_or_odd {
    public static void main(String[] args) {
        printEvenOrOdd();
    }
    //write a function to print numbers from 1 to 100 with even or odd,  write a separate function to check whether its even or odd
    private static boolean IsEven(int n) {
        return n %2 ==0;
    }
    private static void printEvenOrOdd() {
        for (int i = 0; i <= 100; i++) {
            if (IsEven(i)) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }

        }
    }
}
