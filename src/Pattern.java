public class pattern {
    public static void main(String[] args) {
        print_pattern(10);
    }
    private static void print_pattern(int n) {
        print_inverse_triangle (n);
        print_triangle(n);
    }

    private static void print_inverse_triangle(int n) {
        for(int i=n; i>0; i--) {
            print_star(i);
            System.out.println();
        }
    }

    private static void print_star(int n) {
        while(n>0) {
            System.out.print("*");
            n--;
        }
    }

    private static void print_triangle(int n) {
        for(int i=0; i<=n; i++) {
            print_star(i);
            System.out.println();
        }
    }
}

