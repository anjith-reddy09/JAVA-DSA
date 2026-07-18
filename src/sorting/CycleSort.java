package sorting;
import java.util.Arrays;
public class CycleSort {
	public static void main(String[]args) {
		int arr[]= {6,4,2,3,7,8,1,5};
		System.out.println(Arrays.toString(cycleSort(arr)));
	}
public static int[] cycleSort(int arr[]) {
	int i=0;
	while(i<arr.length) {
		int correct = arr[i]-1;
		if(arr[i] != arr[correct]) {
				int temp = arr[correct];
				arr[correct] = arr[i];
				arr[i]=temp;
		}else {
			i++;
		}
	}
	return arr;
}
}
