package restart;
import java.util.*;
public class SumOfeachRow_2Darray {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of row and column");
	int row = sc.nextInt(),col =sc.nextInt();
	int arr[][] = new int[row][col];
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<=arr.length-1;i++) {
		int sum = 0;
		for(int j=0;j<=arr[i].length-1;j++) {
			sum = sum+arr[i][j];
		}
		System.out.println(sum);
	}
}
}