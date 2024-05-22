import java.util.Scanner;

public class countZeroes {
    
    public static int count(int n) {
		int count = 0;
		if(n==0) {
			return 1;
		}
		if(n<10) {
			return count;
		}
		if(n%10==0) {
			count++;
		}
		int smallOutput = count(n/10);
		return smallOutput;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = count(n);
		System.out.println(c);
	}
}
