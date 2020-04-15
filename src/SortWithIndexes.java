import java.util.*;

public class SortWithIndexes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        String result = new String();
        
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
            array2[i] = array1[i];
        }
        bubbleSort(array1);
        for (int i = 0; i < array1.length; i++) {
             int counter = 0;
             for (int j = 0; j < array2.length; j++) {
                 if (array1[i] == array2[j]) {
                     counter = j + 1;
                 }
             }
             result += counter + " ";
        }
        //System.out.println(Arrays.toString(array1));
        //System.out.println(Arrays.toString(array2));
        System.out.println(result);
        input.close();
    }
    
    public static int[] bubbleSort(int[] array) {
        //also using my old code for sorting array with bubble sort method
        int n = array.length;
        int temp;
        boolean flag = true;
        
        while (flag) {
            flag = false;
            for (int i = 0; i < n-1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

}