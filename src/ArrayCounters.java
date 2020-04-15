import java.util.Scanner;

public class ArrayCounters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        String result = new String();
        
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }
        //System.out.println(Arrays.toString(array1));
        
        int counter = 1;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = counter + i;
            int sum = 0;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) 
                    sum++;
            }
            result += sum + " ";
        }
        System.out.println(result);
        input.close();
    }

}