import java.util.*;

public class BubbleInArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[46]; //still static, manualy input following the amount of data
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(String.format("%d %d", swap(array), checksum(array)));
        input.close();
    }
    
    public static int swap(int[] array) {
        int n = array.length -1;
        int counter = 0;
        int temp;
        for(int i = 0; i < n-1; i++) {
            if (array[i] > array[i+1]) {
                temp= array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                //System.out.println(Arrays.toString(array));
                counter++;
            }
        }
        return counter;
    }
    
    public static int checksum(int[] array) {
        int result = 0;
        int limit = 10000007;
        int seed = 113;
        int n = array.length - 1;
        for (int i = 0; i < n; i++) {
            result = result % limit;
            result = (result + array[i]) * seed;
            result = result % limit;
        }
        return result;
    }

}