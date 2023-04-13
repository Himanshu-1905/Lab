
import java.util.ArrayList;

public class Num {
    ArrayList<Integer> A1, A2;

    ArrayList<Integer> storeOddNumbers(int n){
        A1 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i%2 != 0) A1.add(i);
        }
        return A1;
    }

    ArrayList<Integer> printOddNumbers(){
        A2 = new ArrayList<>();
        for(int i: A1){
            int num = i*5;
            A2.add(num);
        }
        return A2;
    }

    int retrieveOddNumber(int n){
        if(A1.contains(n)) return n;
        return 0;
    }
}
