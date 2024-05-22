import java.util.Scanner;

public class sumOfArray {
    
    public static int sum(int arr[], int low, int high) {
		
		if(low>high) {
			return 0;
		}
		int smallOutput = sum(arr, low+1, high);
		int output = arr[low] + smallOutput;
		return output;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int s = sum(arr, 0, arr.length-1);
		System.out.println(s);
	}
}
