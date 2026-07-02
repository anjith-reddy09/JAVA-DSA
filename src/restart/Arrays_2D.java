package restart;
import java.util.*;
public class Arrays_2D {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of row");
	int row =sc.nextInt();
	System.out.println("Enter the size of column");
	int col=sc.nextInt();
	int arr[][]= new int[row][col];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	//System.out.println(Arrays.deepToString(arr));
	for(int i=0;i<arr.length;i++) {
	System.out.println(Arrays.toString(arr[i]));
}
}
}