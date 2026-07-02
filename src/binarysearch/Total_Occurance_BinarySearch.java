package binarysearch;
import java.util.*;
public class Total_Occurance_BinarySearch {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n = sc.nextInt();
	int arr[]= new int[n];
	for(int k=0;k<arr.length;k++) {
		arr[k] = sc.nextInt();
	}
	System.out.println("Enter the target");
	int target = sc.nextInt();
	int first = firstOccurance(arr,target);
	int last = lastOccurance(arr,target);
	int total=0;
	if (first ==-1) {
		System.out.println("Element not found");
}else
	total = last - first +1;
	System.out.println("total no.of times "+target+" is repeated "+total);
}
public static int firstOccurance(int arr[],int target) {
	int ans =-1;
	int start =0;
	int end =arr.length-1;
	while(start<=end) {
		int mid = start+(end-start)/2;
		if(target < arr[mid]) {
			end = mid-1;
		}
		else if(target > arr[mid]) {
			start = mid+1;
		}else {
			ans = mid;
			end = mid-1;
		}
	}
	return ans ;
}
public static int lastOccurance(int arr[],int target) {
	int ans =-1;
	int start =0;
	int end =arr.length-1;
	while(start<=end) {
		int mid = start+(end-start)/2;
		if(target < arr[mid]) {
			end = mid-1;
		}
		else if(target > arr[mid]) {
			start = mid+1;
		}else {
			ans = mid;
			start = mid+1;
		}
	}
	return ans ;
}
}
