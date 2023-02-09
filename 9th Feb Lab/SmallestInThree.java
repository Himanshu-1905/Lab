
import java.util.Scanner;

//Find Smallest of Three Numbers
 
public class SmallestInThree {
 
    public static void main(String[] args) {
        //three numbers
    	
    	  System.out.println("Enter number 1:");
	      Scanner o = new Scanner(System.in);
	      int a = o.nextInt();
	      
	      System.out.println("Enter number 2:");
	      Scanner obj = new Scanner(System.in);
	      int b = obj.nextInt();
	      
	      System.out.println("Enter number 3:");
	      Scanner obj1 = new Scanner(System.in);
	      int c = obj1.nextInt();
	      
        int smallest;
        //find the smallest
        if(a<b) {
            if(c<a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            if(b<c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }
        System.out.println(smallest + " is the smallest.");
    }
}