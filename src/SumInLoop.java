import java.util.*;

public class SumInLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int sum = 0;
		while(a != 0) {
			sum += input.nextInt();
			a --;
		}
		System.out.println(sum);
		input.close();
	}

}
