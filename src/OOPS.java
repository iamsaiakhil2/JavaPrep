public class Oops {

    public static void main(String[] args) {

        //method call to the method "add"
        System.out.println(add(3, 4));
        System.out.println(add(5, 6));

        //method call to the method "sprint"
        sprint(10, 20);
        sprint(100, 110);

        //method call to the method "odd_or_even"
        System.out.println(odd_or_even(2222));
        System.out.println(odd_or_even(221));

        //method call to the method "practice_while"
        practice_while(12);

        //method call to the method "subtract"
        System.out.println(subtract(256, 456));

        //method call to the method "multiply"
        // we are assigning variable 'm' of type "int" to the value returned by the method call "multiply" and then we are printing the number
        float m;
        m = multiply(5, 6);
        System.out.println(m);

        int s;
        s = square_of_two_numbers(34, 56);
        System.out.println(s);

        int as;
        as = (add(100, 200) + subtract(100, 200));
        System.out.println(as);

        System.out.println(simple_interest(100000, 1, 36));

        sprint2(50, 75);

        System.out.println(circle_area(20));
        System.out.println(rectangle_area(25, 35));
        System.out.println(triangle_area(2, 10.5F));
        System.out.println(measure_angle(98));
        System.out.println(measure_angle(30));
        System.out.println(measure_angle(90));

    }

    //in this method, we are adding two numbers
    //here we are using "private" as access modifier
    //the return type of this method is "int"
    private static int add(int x, int y) {
        return x + y;
    }

    //in this method, we are printing numbers between lower and upper limit
    //in the "for" loop, we are initiating the variable "i" with lower limit and incrementing with 1 for every iteration and print the value of i until it reaches the upper limit
    //the return type of this method is void as we are not returning anything and we are just printing
    private static void sprint(int lower_limit, int upper_limit) {
        for (int i = lower_limit; i <= upper_limit; i++) {
            System.out.println(i);
        }
    }

    //in this method, we are finding if the given input is odd or even
    //in this "if" condition statement is used to check whether the given number is odd or even
    //the return type of this method is "String"
    private static String odd_or_even(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    //in this method, we are printing number until it becomes "0"
    //in this "while" condition loop is used to check the given number is "0"
    //the return type of this method is void as we are not returning and we are just printing
    private static void practice_while(int number) {
        while (number != 0) {
            System.out.println(number--);
        }
    }

    public static int subtract(int x, int y) {
        return (x - y);
    }

    private static float multiply(float x, float y) {
        return (x * y);
    }

    private static int square_of_two_numbers(int x, int y) {
        return x ^ 2 + y ^ 2 + (2 * x * y);
    }

    //write a method to return simple interest

    private static int simple_interest(int x, int y, int z) {
        return (x * y * z / 100);
    }

    //write a method to print numbers between two limits while increasing by 2 for every iteration
    private static void sprint2(int lower_limit, int upper_limit) {
        for (int i = lower_limit; i <= upper_limit; i += 2) {
            System.out.println(i);
        }
    }

    //write a method to return the area of circle given radius of circle
    private static float circle_area(float radius) {
        return multiply(3.14F, multiply(radius, radius));
    }

    //write a method to return the area of rectangle
    private static float rectangle_area(float length, float breadth) {
        return multiply(length, breadth);
    }

    //write a method to return area of triangle
    private static float triangle_area(float base, float height) {
        return multiply(0.5F, multiply(base, height));
    }

    //write a method to find whether the given angle is acute or obtuse
    private static String measure_angle(float angle) {
        if (angle < 90) {
            return "Acute";
        } else if (angle ==90) {
            return "Right";
        } else {
            return "Obtuse";
        }
    }
}

