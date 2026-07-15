package sorting;
import java.util.Arrays;
public class SelectionSort01 {
	public static void main(String[]args) {
		int arr[] = {2,8,7,11,5,6};
		selectionSort(arr);
	}
public static void selectionSort(int arr[]) {
	int count =0;
	for(int i =0;i<arr.length-1;i++) {
		int max =0;
		int last = arr.length-1-i;
		for(int j=1;j<=arr.length-1-i;j++) {
			if(arr[max]<arr[j]) {
				max = j;
			}
		}
		int temp = arr[max];
		arr[max]=arr[last];
		arr[last]= temp;
		count++;
		System.out.println(Arrays.toString(arr));
	}
	System.out.println("No.of Swapps = "+count);
	
}
}
