import java.util.Scanner;

public class stringToInteger {
    
    public static int stringToInt(String str) {
		
		if(str.length()==1) {
			return (str.charAt(0) - 48);
		}
		int smallOutput1 = str.charAt(0) - 48;
		int smallOutput2 = stringToInt(str.substring(1));
		int output = (int)(smallOutput1*Math.pow(10, str.length()-1) + smallOutput2);
		return output;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int c = stringToInt(str);
		System.out.println(c);
	}
}
