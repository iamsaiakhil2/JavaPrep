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
class Student {
    int id;
    void info() {
        id = 4;
        double avg= 4.5;
        System.out.println(id + "   "+ avg);
    }
// Instance variables are such variables which are created or declared directly inside class outside any block or method
// instance variable memory will be allocated on heap area inside the object or instance
// Default value will be initialized for instance variable
//    Memory will be deallocated by garbage collector when object becomes reference less
//    ------------------
//    local variables are such variables which are declared inside a method or block of a class
//    Default values are not initialized
//    Memory will be inside stack frame of the method or block within stack area
//    Once method execution is over the memory for local variable will be deallocated

}