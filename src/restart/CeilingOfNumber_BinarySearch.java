package restart;
import java.util.*;
public class CeilingOfNumber_BinarySearch {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the siz eof an array");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the target");
	int target = sc.nextInt();
	int ans =search(arr,target);
	if(ans == -1)
		System.out.println("no ceiling exists");
	else
		System.out.println("Ceiling number is "+ans);
}
public static int search(int arr[],int target) {
	int start =0;
	int end = arr.length-1;
	while(start<=end) {
		int mid = start+(end-start)/2;
		if(target < arr[mid]) {
			end = mid-1;
		}
		else if(target > arr[mid]) {
			start = mid+1;
		}else
			return arr[mid];
	}
	if(start==arr.length) {
		return -1;
	}
	return arr[start];
}
}
