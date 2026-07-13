package binarysearch;

public class RotatedBinarySearchWithDuplicates {
public static void main(String[]args) {
	int arr[] = {4,4,5,6,7,1,2,3};
	int target = 4;
	System.out.println("Target is found at Index no. "+search(target,arr));
}
public static int search(int target,int arr[]) {
	int start = 0;
	int end = arr.length-1;
	while(start <= end) {
		int mid = start +(end - start)/2;
		if(target == arr[mid]) {
			return mid;
		}if(arr[start]==arr[mid] && arr[mid]==arr[end]) {
			start++;
			end--;
		}
		if(arr[start]<=arr[mid]) {
			if(target < arr[mid] && target >= arr[start]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}else {
			if(target >arr[mid] && target<=arr[end]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
	}
	return -1;
}
}
