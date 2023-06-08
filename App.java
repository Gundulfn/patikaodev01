import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers separately: ");
        float a = scan.nextFloat();
        float b = scan.nextFloat();

        System.out.println("Sum: " + (a+b));
        scan.close();
    }
}