import java.util.Scanner;

public class remove_X {
    
    public static String removeX(String str, char x) {
		
		String ans = "";
		if(str.length()==0) {
			return str;
		}
		String smallOutput = removeX(str.substring(1), x);
		if(str.charAt(0)==x) {
			return "" + smallOutput;
		}
		else {
			return str.charAt(0) + smallOutput;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = removeX(str, 'x');
		System.out.println(ans);
	}
}
