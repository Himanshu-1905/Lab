
public class Common_elements_in_array {
    public static void main(String[] args) {
        int[] a = {0, 1, 3, 4, 5};
        int[] b = {1, 2, 3, 5, 7, 9};
        int[] c = {-2, 1, 1, 2, 3, 5};

        for(int j: a){
            if(inArray(b, j) && inArray(c, j)) System.out.print(j + " ");;
        }
    }

    static boolean inArray(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) return true;
        }
        return false;
    }

}
