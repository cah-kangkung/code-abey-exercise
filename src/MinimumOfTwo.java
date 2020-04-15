import java.util.*;
public class MinimumOfTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = "";
		while(n != 0) {
			int min, a, b;
			a = input.nextInt();
			b = input.nextInt();
			if (a < b) {
				min = a;
			} else {
				min = b;
			}
			result += min + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}
