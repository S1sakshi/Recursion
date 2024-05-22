//A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.

import java.util.Scanner;

public class staircase {
    
    public static int staircase(int n) {
		
		if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else if(n==3) {
			return 3;
		}
		int smallOutput1 = staircase(n-1);
		int smallOutput2 = staircase(n-2);
		int smallOutput3 = staircase(n-3);
		int output = staircase(n-1) + staircase(n-2) + staircase(n-3);
		return output;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = staircase(n);
		System.out.println(s);
	}
}
