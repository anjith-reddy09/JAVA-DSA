package binarysearch;
import java.util.*;
public class LastOccurance_BinarySearch {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size = sc.nextInt();
	int arr[] =new int[size];
	for(int i =0;i<arr.length;i++) {
		arr[i]= sc.nextInt();
	}
	System.out.println("Enter the target");
	int target = sc.nextInt();
	int ans = lastOccurance(arr,target);
	if(ans == -1)
		System.out.println("no element found");
	else 
		System.out.println("Last occurance of element is at index "+ans);
}
public static int lastOccurance(int arr[],int target) {
	int ans =-1;
	int start =0;
	int end = arr.length-1;
	while(start<=end) {
		int mid = start +(end-start)/2;
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
	return ans;
}
}
