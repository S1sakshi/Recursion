import java.util.Scanner;

public class pairStar {
    
    public static String pairStar(String str) {
		
		if(str.length()==1) {
			return str;
		}
		
		String smallOutput = pairStar(str.substring(1));
		if(str.charAt(0)==str.charAt(1)) {
			String ans = str.charAt(0) + "*" + smallOutput;
			return ans;
		}
		else {
			String ans = str.charAt(0) + smallOutput;
			return ans;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ps = pairStar(str);
		System.out.println(ps);
	}
}
