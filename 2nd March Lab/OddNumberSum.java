
import java.util.*;
 
public class OddNumberSum { // class
    public static void main(String args[]) { 
        int N, i, sum = 0;
 
        Scanner in = new Scanner(System.in); // taking scanner class
        System.out.println("Enter a number");
        N = in.nextInt();
 
        for(i = 0; i <= N; i++){ // taking for loop
            if((i%2) == 1){
                sum += i;
            }
        }
     
        System.out.print("Sum of all odd numbers upto "
            + N + " = " + sum);
    }
}