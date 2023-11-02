package task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int next = in.nextInt();
        int[] b = new int[next];
        for (int i = 0; i < next; i++){
            b[i] = in.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);

        List<Integer> res = newSequence(a,b,n,next);
        System.out.println(res);

    }
    public static List<Integer> newSequence(int[] a, int[] b, int n, int next){
        List<Integer> sequence = new ArrayList<>();
        int x = 0;
        int y = 0;

        while (x < n && y < next){
            if(a[x] <= b[y]){
                x++;
            }
            else {
                sequence.add(x);
                y++;
            }
        }
        while (y < next){
            sequence.add(x);
            y++;
        }

        return sequence;
    }
}
