
public class Excep2 {
    public static void main(String[] args) {
        System.out.println(addTwoPositives(4, -6));
    }
    static int addTwoPositives(int a, int b) {
        int sum = 0;
        try {
            sum = a + b;
            if (a <= 0 || b <= 0) {
                throw new ArithmeticException("Non-positive integer sent");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return sum;
        }
    }
}