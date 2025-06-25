package assign;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int[] arr = new int[num]; 
        int value = 1;
        for (int i = 0; i < num; i++) {
            arr[i] = value;
            value += 2;
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i]);
            if (i < num - 1) {
                System.out.print(",");
            }
        }
        sc.close();
	}

}
