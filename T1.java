import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        try {
             a = in.nextInt();
             b = in.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input");
            return;
        }
        if (a == b) { 
            System.out.println("a = b");
        } else if (a > b) {
            System.out.println("a > b");
        
        } else if (a < b) {
            System.out.println("a < b");
        }

        System.out.println(String.format("Sum: %s", a + b));
        System.out.println(String.format("Difference: %s", a - b));
        System.out.println(String.format("Quotient: %s", a / b));
        System.out.println(String.format("Product: %s", a * b));

    }
}