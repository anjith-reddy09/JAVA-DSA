package linearsearch;
import java.util.*;
public class Linear_Search_1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int find = sc.nextInt();
		int []arr = new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	int ans = linearSearch(arr,find);
	System.out.println(ans);
}
	public static int linearSearch(int[] arr,int find ) {
				for(int i=0;i<=arr.length-1;i++) {
					int ele = arr[i];
			if(find ==ele) {
				return i;
			}
		}
				return -1; 
	}
}