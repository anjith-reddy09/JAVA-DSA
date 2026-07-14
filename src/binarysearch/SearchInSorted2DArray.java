package binarysearch;

import java.util.Arrays;

public class SearchInSorted2DArray {
public static void main(String[]args) {
	int arr[][] = {
			{2,4,6,8},
			{10,12,14,16},
			{18,20,22,24},
			{26,28,30,32},
	};
	int target = 28;
	System.out.println(Arrays.toString(search(arr,target)));
}
public static int[] search(int arr[][],int target) {
	int rows = arr.length;
	int cols = arr[0].length;
	int start = 0;
	int end = rows*cols-1;
	while(start <= end) {
		int mid = start+(end-start)/2;
		int row = mid/cols;
		int col = mid%cols;
		if(arr[row][col]==target) {
			return new int[] {row,col};
		}else if(arr[row][col]>target) {
			end = mid-1;
		}else {
			start = mid+1;
		}
	}
	return new int[] {-1,-1};
}
}