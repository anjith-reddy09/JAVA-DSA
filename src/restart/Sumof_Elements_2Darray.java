package restart;
import java.util.*;
public class Sumof_Elements_2Darray {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int row = sc.nextInt(),col = sc.nextInt();
	int arr[][] = new int[row][col];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	System.out.println(sumElements(arr));
}
public static int sumElements(int arr[][]){
	int sum =0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
		int ele = arr[i][j];
		sum+=ele;
		}
	}
	return sum;
}
}
