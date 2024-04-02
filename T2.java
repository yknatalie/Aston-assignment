import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if (s1.equals(s2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }

    }
}