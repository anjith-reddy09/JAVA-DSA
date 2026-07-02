package restart;
import java.util.*;
public class OrderAgnostic_BinarySearch {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i =0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
System.out.println("Enter the target");
int target = sc.nextInt();
	if(arr[0] >arr[arr.length-1]) {
     int ans = desendingBinary(arr,target);
     if(ans==-1) {
    	 System.out.println("Target not found");
     }else
     System.out.println("target is prestent at index no. "+ans);
	}else {
	int ans =	assendingBinary(arr,target);
	if(ans ==-1) {
		System.out.println("Target not found");
	}else
		System.out.println("Target is found at index no. "+ans);
	}
}
public static int desendingBinary(int arr[],int target) {
	int start =0;
	int end = arr.length-1;
	while(start<=end) {
		int mid = start+(end-start)/2;
		if(target>arr[mid]) {
			end = mid-1;
		}
		else if(target<arr[mid]) {
			start = mid+1;
		}
		else return mid;
	}
	 return -1;
}
public static int assendingBinary(int arr[],int target) {
	int start = 0;
	int end = arr.length-1;
	while(start<=end) {
		int mid = start+(end-start)/2;
		if(target>arr[mid]) {
			start = mid+1;
		}
		else if(target<arr[mid]) {
			end = mid-1;
		}else return mid;
	}
	return -1;
}
}
