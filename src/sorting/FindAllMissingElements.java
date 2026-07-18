package sorting;
import java.util.*;
public class FindAllMissingElements {
	public static void main(String[]args) {
		int arr[]= {4,3,2,7,8,2,3,1};
		System.out.println(missing(arr));
	}
public static List<Integer> missing(int arr[]) {
	int i=0;
	while(i<arr.length) {
		int cIndex = arr[i]-1;
		if(arr[i]<=arr.length && arr[i] != arr[cIndex]) {
			int temp = arr[i];
			arr[i]= arr[cIndex];
			arr[cIndex]= temp;
		}else {
			i++;
		}
	}
	List<Integer> ans = new ArrayList<>();
	int index =0;
	while(index <arr.length) {
		if(arr[index] != index+1) {
			ans.add(index+1);
		}
		index++;
	}
	return ans;
}
}