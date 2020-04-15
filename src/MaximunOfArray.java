import java.util.*;

public class MaximunOfArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[300];
		int max, min;
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		//System.out.println(Arrays.toString(array));
		
		max = array[0];
		for(int i = 0; i < array.length-1; i++) {
			if (array[i+1] > max) {
				max = array[i+1];
			}
		}
		
		min = array[0];
		for(int i = 0; i < array.length-1; i++) {
			if (array[i+1] < min) {
				min = array[i+1];
			}
		}
		
		System.out.print(String.format("%d %d", max, min));
		input.close();
		
	}

}
