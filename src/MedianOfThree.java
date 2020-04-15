import java.util.*;

public class MedianOfThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = "";
		while (n != 0) {
			int a, b, c, med;
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			
			med = a;
			if (b > med && b < c || b < med && b > c)
				med = b;
			if (c < a && c > b || c > a && c < b)
				med = c;
			result += med + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}
