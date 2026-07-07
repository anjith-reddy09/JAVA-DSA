package binarysearch;
import java.util.*;
public class InfiniteSortedArrayBinarySearch {
public static void main(String[]args) {
	int arr[] = {2,3,5,6,7,8,9,11,13,16,17,19,29};
   int target = 16;
   System.out.println(ans(arr,target));
}
public static int ans(int arr[],int target) {
	int start = 0;
	int end = 1;
	while(end < arr.length && target > arr[end]) {
		int temp = end+1;
		end = end +(end - start+1)*2;
		start = temp;
	}
	if(end >= arr.length) {
		end = arr.length-1;
	}
	return binarySearch(arr,target,start,end);
}
public static int binarySearch(int arr[],int target,int start,int end) {
	while(start<=end) {
		int mid = start+(end-start)/2;
		if(target > arr[mid]) {
			start = mid+1;
		}else if(target <arr[mid]) {
			end = mid-11;
		}else {
			return mid;
		}
	}
	return -1;
}
}
