package task5;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Input next number: ");
            arr[i] = in.nextInt();
        }

        System.out.printf("\nResult is %d",count(n,arr));
    }

    public static int count(int n, int[] arr){
        if (n > 0) {
            int[] lengthArr = new int[n];
            lengthArr[0] = 1;

            for (int i = 1; i < n; i++) {
                int max = maxNum(i, lengthArr, arr);
                lengthArr[i] = Math.max(max, 1);
            }

            int maxLength = maxLength(lengthArr);
            return n - maxLength;
        }
        else return 0;
    }
    private static int maxNum(int index, int[] lengthArr,int[] arr){
        int max = 0;
        for(int i = 0; i < index; i++){
            if(arr[index] >= arr[i] && lengthArr[i] + 1 > max)
            {
                max = lengthArr[i] + 1;
            }
        }
        return max;
    }
    private static int maxLength(int[] lengthArr){
        int maxLength = 0;
        for (int j : lengthArr) {
            if (j >= maxLength) {
                maxLength = j;
            }
        }
        return maxLength;
    }
}

