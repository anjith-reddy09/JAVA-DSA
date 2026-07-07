package binarysearch;
import java.util.*;
public class FindPeakElement {
	public static void main(String[]args) {
		int arr[] = {5,7,11,13,8,6,3,2};
		System.out.println(peakIndex(arr));
	}
public static int peakIndex(int arr[]) {
	int start =0;
	int end = arr.length-1;
	while(start < end ) {
		int mid = start+(end-start)/2;
		if(arr[mid]>arr[mid+1]) {
			end = mid;
		}
		else {
			start = mid+1;
		}
	}
	return start;
}
}
