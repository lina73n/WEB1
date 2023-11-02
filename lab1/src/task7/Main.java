package task7;

import java.util.Scanner;

public class Main {
    public static void sort(double[] arr) {
    int i = 1;
    while (i < arr.length-1) {
        if (arr[i] <= arr[i+1]) {
            i++;
        } else {
            double tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
            if (i > 0) {
                i--;
            }
        }
    }
}
}
