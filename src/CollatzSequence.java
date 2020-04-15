import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		String result = new String();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			int x = array[i];
			int counter = 0;
			while (x != 1) {
				if (x % 2 == 0) {
					x = x / 2;
					counter++;
				} else {
					x = 3 * x + 1;
					counter++;
				}
			}
			result += counter + " ";
			//System.out.println(x);
		}
		System.out.println(result);
		input.close();
		//System.out.println(Arrays.toString(array));
	}

}
