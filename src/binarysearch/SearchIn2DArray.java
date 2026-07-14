package binarysearch;

import java.util.Arrays;

public class SearchIn2DArray {
	public static void main(String[]args) {
		int[][]arr= {
				{10,20,30,40},
				{15,25,35,45},
				{21,26,37,47},
				{31,38,41,50}
				
		};
		int target =40;
		System.out.println(Arrays.toString(search(arr,target)));
	}
public static int[] search(int arr[][],int target) {
	int r = 0;
	int c = arr.length-1;
	while(r < arr.length && c>=0) {
		if(arr[r][c]==target) {
			return new int[] {r,c};
		}
		if(target > arr[r][c]) {
			r++;
		}else {
			c--;
		}
	}
	return new int[] {-1,-1};
}
}
