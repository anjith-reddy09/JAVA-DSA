package binarysearch;
public class PracticeMountainArray {
	public static void main(String[]args) {
		int arr[] = {2,4,6,8,9,7,5,3,};
		int target = 5;
		int ans = search(arr,target);
		System.out.println(ans);
	}
public static int search(int arr[],int target) {
	int peak = peakElementSearch(arr);
	int firstHalf = binarySearch(arr,target,0,peak);
	if(firstHalf == -1) {
		return binarySearch(arr,target,peak+1,arr.length-1);
	}else return firstHalf;
}
public static int peakElementSearch(int arr[]) {
	int start = 0;
    int end = arr.length-1;
    while(start<end) {
    	int mid = start+(end-start)/2;
    	if(arr[mid] > arr[mid+1]) {
    		end = mid;
    	}else
    		start = mid+1;
    }
    return start;
}
public static int  binarySearch(int arr[],int target,int start,int end) {
	while(start < end) {
		int mid = start+(end-start)/2;
		boolean isAsc=arr[start] <arr[end];
		if(isAsc) {
			if(target > arr[mid]) {
				start = mid+1;
			}else if(target < arr[mid]) {
				end = mid-1;
			}else {
			return mid;
			}
			
		}else {
			if(target > arr[mid]){
				end = mid-1;
			}else if(target < arr[mid]){
				start = mid+1;
			}
			else {
			return mid;
			}
 	}
	}
	return -1;
}
}
