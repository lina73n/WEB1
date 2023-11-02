package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TangentCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = in.nextDouble();
        System.out.println("Input b: ");
        double b = in.nextDouble();
        System.out.println("Input h: ");
        double h = in.nextDouble();

        System.out.println(findResult( a, b, h));
    }
    public static List<Double> findResult(double a, double b, double h) {
        List<Double> resultList = new ArrayList<>();
        do {
            double result = tg(a);
            resultList.add(result);
            System.out.printf("%.2f | %.5f%n",a,result);
            a += h;
        } while (a < b);
        return resultList;
    }
    public static double tg(double a){
        return Math.tan(a);
    }
}
