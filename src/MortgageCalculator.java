import java.util.Scanner;

public class MortgageCalculator {

    // found a formula used by many accountant to calculate monthly loan payment that has to be paid
    // the formula goes:
    // M = p / {((1+i)^l - 1) / (i*(1+i)^l)} *happens to contain all variables necessary (same as the input)
    // p = loan size
    // i = interest rate ((rate/12)/100)
    // l = length of time to pay out (in months)
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        double i = input.nextDouble();
        int l = input.nextInt();
        i = ((double)i  / (double)12) / 100;
        double d = (Math.pow((1 + i), l) - 1) / (i * Math.pow((1 + i), l));
        double m = p / d;
        System.out.println(Math.round(m));
        input.close();
    }

}