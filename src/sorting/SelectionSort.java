package sorting;
import java.util.Arrays;
public class SelectionSort {
	public static void main(String[]args) {
		int arr[] = {5,2,8,7};
		System.out.println(Arrays.toString(selectionSort(arr)));
	}
public static int[] selectionSort(int arr[]) {
	for(int i=0;i<arr. length-1;i++) {
		int max = 0;
		for(int j=1;j<=arr.length-1-i;j++) {
			if(arr[max]<arr[j]) {
				max = j;
			}
		}
		if(max != arr.length-1-i) {
			int temp=arr[max];
			arr[max] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
	return arr;
}
}
