import java.util.*;
public class SumsInLoop {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = "";
		while(n != 0) {
			int sum = 0;
			for(int i = 0; i < 2; i++) {
				sum += input.nextInt();
			}
			result += sum + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}
}
