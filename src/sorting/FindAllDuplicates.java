package sorting;
import java.util.*;
public class FindAllDuplicates {
	public static void main(String[]args) {
		int arr[] = {4,3,2,7,8,2,3,1};
		System.out.println(duplicates(arr));
	}
public static List<Integer> duplicates(int arr[]){
	int i=0;
	List<Integer> ans = new ArrayList<>();
	while(i<arr.length) {
			int cIndex = arr[i] - 1;
			if(arr[i]!=arr[cIndex]) {
				int temp = arr[i];
				arr[i] = arr[cIndex];
				arr[cIndex] = temp;
			} else {
			i++;
		}
	}
	for(int index =0;index<arr.length;index++) {
		if(arr[index]!=index+1) {
			ans.add(arr[index]);
		}
	}
	return ans;
}
}
