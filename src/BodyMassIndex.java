import java.util.*;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String result = "";
		while(n != 0) {
			int a;
			double b, BMI;
			a = input.nextInt();
			b = input.nextDouble();
			BMI = a / Math.pow(b, 2);
			
			String temp = "under";
			if (BMI >= 18.5)
				temp = "normal";
			if (BMI >= 25.0)
				temp = "over";
			if (BMI >= 30.0)
				temp = "obese";
			
			result += temp + " ";
			n--;
		}
		System.out.println(result);
		input.close();
	}

}
