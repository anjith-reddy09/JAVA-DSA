package binarysearch;
import java.util.*;
public class RotatedBinarySearch {
	public static void main(String[]args) {
		int arr[]= {4,5,6,7,0,1,2,3};
		int target = 4;
		System.out.println(search(arr,target));
	}
	public static int search(int arr[],int target) {
		int pivit = findPivit(arr);
		if(pivit==-1) {
			return binarySearch(arr,target,0,arr.length-1);
		}
		if(arr[pivit]==target) {
			return pivit;
		}if(target >=arr[0]) {
			return binarySearch(arr,target,0,pivit-1);
		}
		return binarySearch(arr,target,pivit+1,arr.length-1);
	}
	public static int binarySearch(int arr[],int target,int start,int end) {
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target > arr[mid]) {
				start = mid+1;
			}else if(target < arr[mid]) {
				end = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
public static int findPivit(int arr[]) {
	int start = 0;
	int end = arr.length-1;
	while(start<=end) {
		int mid = start+(end-start)/2;
		if(mid < end && arr[mid]>arr[mid+1]) {
			return mid;
		}
		if(mid > start && arr[mid]<arr[mid-1]) {
			return mid-1;
		}
		if(arr[start]>arr[mid]) {
			end = mid-1;
		}else {
			start = mid+1;
		}
	}
	return -1;
}
}
