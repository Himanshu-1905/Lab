
import java.util.Scanner;

public class IfNeg {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            if (x < 0 || y < 0) {
                throw new Exception("x and y should not be negative.");
            } else if (x == 0 || y == 0) {
                throw new Exception("x and y should not be zero.");
            } else {
                int product = x * y;
                System.out.println(product);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}