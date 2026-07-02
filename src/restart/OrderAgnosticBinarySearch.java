package restart;
import java.util.*;
public class OrderAgnosticBinarySearch {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n = sc.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the target");
	int target = sc.nextInt();
	int ans = agnosticBinary(arr,target);
	if(ans ==-1) {
		System.out.println("Target not found");
	}
	else System.out.println(" Target found at index no. "+ans);
}
public static int agnosticBinary(int arr[],int target) {
	int start =0;
	int end =arr.length-1;
	boolean asend;
	if(arr[start]<arr[end]) {
		asend = true;
	}else
		asend = false;
	while(start<=end) {
		int mid = start+(end-start)/2;
		if(asend) {
			if(target>arr[mid]) {
				start = mid+1;
			}
			else if(target<arr[mid]) {
				end = mid-1;
			}
			else return mid;
		}
		else {
			if(target > arr[mid]) {
				end = mid-1;
			}
			else if(target<arr[mid]) {
				start = mid+1;
			}
			else return mid;
		}
	}
	return -1;
}
}
