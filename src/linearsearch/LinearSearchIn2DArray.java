package linearsearch;

import java.util.Arrays;

public class LinearSearchIn2DArray {
	public static void main(String[]args) {
		int arr[][] = {
			    {3,6,2,4},
				{7,11,9,21},
				{23,31,51,42}
	};
		int target = 21;
		System.out.println(Arrays.toString(search(arr,target)));
	}
public static int[] search(int arr[][],int target) {
	for(int i= 0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(target ==arr[i][j]) {
				return new int[] {i,j};
			}
		}
	}
	return new int[] {-1,-1};
}
}
