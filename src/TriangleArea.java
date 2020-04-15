import java.util.*;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result = new String();
        while (n != 0) {
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double x3 = input.nextDouble();
            double y3 = input.nextDouble();
            
            double a = distance(x1, y1, x2, y2);
            double b = distance(x2, y2, x3, y3);
            double c = distance(x3, y3, x1, y1);
            
            double A = area(a, b, c);
            result += A + " ";
            n--;
        }
        System.out.println(result);
        input.close();
    }
    
    // once had an exercise with Mr. Med about this formula
    // getting the distance beetwen two coordinates
    // the parameter reads as (x1, y1), (x2, y2) --> two coordinates
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDiff = x1 - x2;
        double yDiff = y1 - y2;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    // using what's called heron's formula to calculate area
    // a, b, c are length of sides
    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double A = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        return A;
    }

}