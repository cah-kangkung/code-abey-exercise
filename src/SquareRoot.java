import java.util.*;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = new String();
		while (n != 0) {
			float a = input.nextFloat();
			int b = input.nextInt();
			float r = 1;
			float d;
			while (b != 0) {
				d = a / r;
				r = (r + d) / 2;
				b--;
			}
			result += r + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}
