package Arrays;

import java.util.Scanner;

public class oned_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int [3];
        System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
}
