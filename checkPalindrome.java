import java.util.Scanner;

public class checkPalindrome {
    
    public static boolean palindrome(String str, int start, int end) {
		
		if(start>end) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		boolean smallOutput = palindrome(str, start+1, end-1);
		return smallOutput;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean b = palindrome(str, 0, str.length()-1);
		System.out.println(b);
	}
}
