import java.util.Scanner;

public class SmoothingWeather {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		
		String result = new String();
		for (int i = 1; i < array.length - 1; i++) {
			double sum = (array[i-1] + array[i] + array[i+1]) / 3;
			result += sum + " ";
		}
		System.out.println(array[0] + " " + result + array[array.length-1]);
		input.close();
	}
	
}
