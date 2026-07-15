package sorting;
import java.util.*;
public class BubbleSort {
	public static void main(String[]args) {
		int arr[] = {5,11,21,3,6,57,1};
		System.out.println(Arrays.toString(bubbleSort(arr)));
		}
public static int[] bubbleSort(int arr[]) {
	
	for(int i=0;i<arr.length-1;i++) {
		boolean swapped = false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	return arr;
}
}
