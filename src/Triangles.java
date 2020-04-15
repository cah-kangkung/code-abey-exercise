import java.util.*;
public class Triangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = "";
		while (n != 0) {
			int a, b, c, max, sum;
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			
			max = a;
			sum = b + c;
			if (max < b) {
				max = b;
				sum = a + c;
			}if (max < c) {
				max = c;
				sum = a + b;
			}
			
			if (sum >= max)
				result += 1 + " ";
			else 
				result += 0 + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}
