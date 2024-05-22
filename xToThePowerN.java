import java.util.*;

public class xToThePowerN {

    public static int pow(int x, int n) {
		if(n==1){
			return x;
		}
		int smallOutput = pow(x, n-1);
		int output = x*smallOutput;
		return output;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int i = pow(x, n);
		System.out.println(i);
	}
}