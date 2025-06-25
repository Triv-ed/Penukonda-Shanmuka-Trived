package assign;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int inp=sc.nextInt();
		if (inp % 2 == 0) {
            inp = inp - 1;
        }
		
		int count=0;
		int num=1;
		while(count<inp) {
			System.out.print(num);
			if(count<inp-1) {
				System.out.print(", ");
			}
			num+=2;
			count+=1;
		}
		
			sc.close();
	}

}
