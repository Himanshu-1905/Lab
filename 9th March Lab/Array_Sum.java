
public class Array_Sum { // Taking class
    public static void main(String[] args) { // Main class
        int[] arr = {1, 2, 3, 4, 5, -2, 0};
        int sum = 3;
        for (int i = 0; i < arr.length; i++) { // Taking for loop
            for (int j = i+1; j < arr.length; j++) { // Taking for loop
                if(arr[j] == (sum-arr[i])){  // Taking if ladder
                    System.out.println("[" + arr[i] + ", " + arr[j] + "]");
                }
            }
        }
    }
}
