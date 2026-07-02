package linearsearch;
import java.util.*;
public class Finding_Minvalue_In2Darray {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of row and col");
	int row = sc.nextInt(), col = sc.nextInt();
	int arr[][] = new int[row][col];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	int min = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]>min) {
				min = arr[i][j];
			}
		}
	}
	System.out.println(min);
}
}
