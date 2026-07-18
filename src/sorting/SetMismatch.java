package sorting;
import java.util.*;
public class SetMismatch {
public static void main(String[]args) {
	int arr[] = {2,1,4,2,6,5};
	System.out.println(miss(arr));
}
public static List<Integer> miss(int arr[]){
	int index =0;
	while(index<arr.length) {
		int cIndex = arr[index] - 1;
		if(arr[index]!=arr[cIndex]) {
			int temp = arr[index];
			arr[index] = arr[cIndex];
			arr[cIndex] = temp;
		} else {
		index++;
	}
}
	int i= 0;
	List<Integer> ans = new ArrayList<>();
	while(i<arr.length) {
		if(arr[i]!=i+1) {
			ans.add(arr[i]);
			ans.add(i+1);
		}
		i++;
	}
	return ans;
}
}
