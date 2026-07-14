package binarysearch;

public class SplitArray {
public static void main(String[]args) {
	
}
public static int splitArray(int []arr,int m) {
	int start =0;
	int end = 0;
	for(int i=0;i<arr.length;i++) {
		start =Math.max(start, arr[i]);
		end += arr[i];
	}
	while(start < end) {
		int mid = start+(end-start)/2;
		int sum = 0;
		int pieces = 1;
		for(int n : arr) {
			if(sum+n > mid) {
				sum = n;
				pieces++;
			}else {
				sum += n;
			}
		}
		if(pieces > m) {
			start = mid+1;
		}else {
			end = mid;
		}
	}
	return start ;
}
}
