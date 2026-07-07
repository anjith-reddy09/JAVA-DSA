package binarysearch;
import java.util.*;
public class SearchInMountainArray {
	public static void main(String[]args) {
		int arr[]= {3,5,6,7,15,17,11,9,4,2,1};
		int target = 9;
		System.out.println(search(arr,target));
	}
public static int peakIndex(int arr[]) {
	int start = 0;
	int end = arr.length-1;
	while(start < end) {
		int mid = start+(end-start)/2;
		if(arr[mid]>arr[mid+1]) {
			end = mid;
		}else {
			start = mid+1;
		}
	}
	return start;
}
public static int binarySearch(int arr[],int target,int start ,int end) {
	boolean isAsc = arr[start] < arr[end];
	while(start <=end) {
     int mid = start +(end - start)/2;
     if(target == arr[mid]) {
    	 return mid;
     }
     if(isAsc) {
    	 if(target < arr[mid]) {
    		 end = mid-1;
    	 }else
    		 start = mid+1;
     }
     else
     {
    	 if(target < arr[mid]) {
    		 start = mid+1;
    	 }else {
    		 end = mid-1;
    	 }
     }
	}
	return -1;
}
public static int search(int arr[],int target) {
	int peak = peakIndex(arr);
	int firstTry = binarySearch(arr,target,0,peak);
	if(firstTry != -1) {
		return firstTry;
	}
	return binarySearch(arr,target,peak+1,arr.length-1);
}
}
