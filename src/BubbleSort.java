import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println(bubbleSort(array));
        System.out.println(Arrays.toString(array));
        input.close();
        
    }
    
    public static String bubbleSort(int[] array) {
        //using my old code for sorting array with bubble sort method
        int n = array.length;
        int temp;
        boolean flag = true;
        int pass = 0;
        int swap = 0;
        String result = new String();
        
        while (flag) {
            flag = false;
            for (int i = 0; i < n-1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                    swap++;
                }
            }
            pass++;
        }
        result += pass + " " + swap;
        return result;
    }

}