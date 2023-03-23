
import java.util.*;

public class Excep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = x / y;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}