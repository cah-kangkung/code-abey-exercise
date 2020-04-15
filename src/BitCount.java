import java.util.*;

public class BitCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		String result = new String();
		while (k != 0) {
			int n = input.nextInt();
			result += count1(n) + " ";
			k--;
		}
		System.out.println(result);
		input.close();
	}
	
	public static int count1(int n) {
		String str = Integer.toBinaryString(n);
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1')
				counter++;
		}
		return counter;
	}

}
