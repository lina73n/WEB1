package task4;

import java.util.ArrayList;
import java.util.List;

public class PrimeArray {
    public static List<Integer> findPrimeNumbers(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                result.add(i);
                System.out.println(i);
            }
        }
        return result;
    }
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
