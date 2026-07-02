package binarysearch;
import java.util.*;
public class BinarySearch_01 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter the target");
	int target = sc.nextInt();
	System.out.println(binarySearch(arr,target));
}
public static int binarySearch(int arr[], int target) {
	int start =0;
	int end = arr.length-1;
	while(start<=end) {
		int mid = start +(end - start)/2;
		if(target  > arr[mid] ) {
			start = mid+1;
		}else if(target < arr[mid]) {
			end = mid-1;
		}else {
			return mid;
		}
		}
	return -1;
}
}
