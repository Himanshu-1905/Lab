
/*
 a.      A class named Arithmetic with a method named add that takes integers as parameters and returns an integer denoting their sum.
b.      A class named Adder that inherits from a superclass named Arithmetic.
 */

class Arithmetic
{
     int add(int a,int b)
    {
        return a+b;
    }
}
 class Adder extends Arithmetic {}

public class InheritanceLab1{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());    
        
        // Print the result of 3 calls to Adder's method
        System.out.print(a.add(5,10) + " " + a.add(10,20) + " " + a.add(10,10));
     }
}
