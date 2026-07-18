package sorting;
import java.util.Arrays;
public class FindDuplicateNumber {
	public static void main(String[]args) {
		int arr[]= {1,5,6,4,4,2,3};
		System.out.println(duplicate(arr));
	}
public static int duplicate(int arr[]) {
	int i=0;
	while(i<arr.length) {
		if(arr[i] != i+1) {
			int cIndex = arr[i]-1;
			if(arr[i]!= arr[cIndex] ) {
				int temp = arr[i];
				arr[i] = arr[cIndex];
				arr[cIndex] = temp;
			}else {
				return arr[i] ;
			} 
		}else {
			i++;
		}
	}
	return -1;
}
}
