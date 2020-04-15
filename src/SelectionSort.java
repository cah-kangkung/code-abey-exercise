import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        selection(array);
        input.close();
    }
    
    public static void selection(int[] array) {
        int swap;
        
        for (int i = array.length-1; i > 0; i--) {
            //System.out.print(array[i]);
            int max = i;
            for (int j = 0; j <= i; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            System.out.print(max + " ");
            swap = array[i];
            array[i] = array[max];
            array[max] = swap;
        }
        //System.out.println(Arrays.toString(array));
    }

}