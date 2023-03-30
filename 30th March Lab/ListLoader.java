package ThursdayLab;
/*
Problem Statement 1:
 Develop a simple java application which needs to store 100Lakh Integers in an ArrayList starting from 0…100lakhs.Create a main method which can have a loop ranging from 0 -100lakh. Calculate the response time required for the process. The response time can be calculated as the difference between the start time and end time of the process which can be calculated using the system time.
1.      Develop a class ListLoader  with a method loadList()
Method Name : loadList
Method Arguments : Integer startNumber, Integer lastNumber
Method return type : void
Method Logic: Should iterate using a looping starting from startNumber and ending with lastNumber and load an array list (L) with the Integer numbers. The Array List (L) should be defined as a member variable in the class.
Develop a main method which will invoke the loadList() and pass the parameter startNumber as  0 and lastNumber as 100 lakh. Print the time taken for the method to run.
*/
import java.util.ArrayList;

public class ListLoader {
    ArrayList<Integer> L;

    public void loadList(Integer startNumber, Integer lastNumber) {
        L = new ArrayList<>();
        for (int i = startNumber; i <= lastNumber; i++) {
            L.add(i);
        }
    }

    public static void main(String[] args) {
        ListLoader listLoader = new ListLoader();
        long startTime = System.currentTimeMillis();
        listLoader.loadList(0, 1000000);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("Response Time: " + responseTime + " milliseconds");
    }
}
