import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();       // read integer
        double d = scan.nextDouble(); // read double
        scan.nextLine();              // consume leftover newline
        String s = scan.nextLine();   // read string

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
