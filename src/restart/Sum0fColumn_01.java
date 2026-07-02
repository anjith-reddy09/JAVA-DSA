package restart;
import java.util.*;
public class Sum0fColumn_01 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of row and col");
	int row = sc.nextInt(),col = sc.nextInt();
	int arr[][] = new int[row][col];
	for(int i =0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr.length-1;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	for(int j=0;j<=arr[0].length-1;j++) {
		int sum = 0;
		for(int i=0;i<=arr.length-1;i++) {
			sum+=arr[i][j];
		}
		System.out.println("Sum of column "+j+" = "+sum);
	}
}
}
