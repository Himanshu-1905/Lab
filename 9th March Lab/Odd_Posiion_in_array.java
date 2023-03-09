
public class Odd_Posiion_in_array {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i += 2;
        }
    }
}
