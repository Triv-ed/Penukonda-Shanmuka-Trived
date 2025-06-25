package assign;

import java.util.HashMap;
import java.util.Map;

public class Problem_4 {
	public static void main(String[] args) {
		
		int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
	     Map<Integer, Integer> result = new HashMap<>();
	     
	     for(int i=1; i<=9; i++) {
	    	 result.put(i, 0);
	     }
	     for (int num : input) {
	            for (int i = 1; i <= 9; i++) {
	                if (num % i == 0) {
	                    result.put(i, result.get(i) + 1);
	                }
	            }
	        }
	     System.out.print("{");
	     for (int i = 1; i <= 9; i++) {
	            System.out.print(i + ":" + result.get(i));
	            if (i != 9) {
	                System.out.print(", ");
	            }
	        }
	     System.out.print("}");
	}
	
}
