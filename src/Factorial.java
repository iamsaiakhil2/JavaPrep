public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialCalc(5));
        System.out.println(operator());
    }
    public static int factorialCalc (int n) {
        int value =1;
        for(int i=1;i<=n;i++) {
            value = value * i;
        }
        return value;
    }
    private static int operator () {
        int a =5;
        int b;
        b = ++a + a++ + a++ + ++a;
        return a+b;

    }
}