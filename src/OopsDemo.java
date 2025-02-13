public class OopsDemo {
    public static void main(String[] args) {
        int num = 5;
        Laptop lap = new Laptop();

        System.out.println(lap.ram);
        System.out.println(lap.brand);
        lap.run();

    }
}
class Laptop {
    int ram=16;
    String brand="Asus";

    public void run(){
        System.out.println("Running Smooth Laptop");
    }
}