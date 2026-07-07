package binarysearch;
import java.util.*;
public class PositonOfFirstAndLastOccurance_BinarySearch {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int ans[] = answer(arr,target);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] answer(int arr[],int target) {
		int ans[] = new int[2];
		ans[0]= search(arr,target,true);
		ans[1] = search(arr,target,false);
		return ans;
	}
public static int search(int arr[],int target,boolean isFirst) {
	int start =0;
	int end = arr.length-1;
	int ans=-1;
	while(start <= end) {
		int mid = start+(end-start)/2;
		if(target<arr[mid]) {
			end = mid-1;
		}
		else if (target > arr[mid]) {
			start = mid+1;
		}
		else {
			if(isFirst) {
			ans = mid;
			end = mid-1;
			}else {
				ans=mid;
			start = mid+1;
			}
		}
	}
	return ans;
}
}
