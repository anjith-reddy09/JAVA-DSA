package sorting;
import java.util.Arrays;
public class MissingNumberUsingCycleSort {
	public static void main(String[]args) {
		int arr[] = {5,3,2,1,0};
		if(missingElement(arr)==-1) {
			System.out.println("No Missing Elements");
		}else {
			System.out.println(missingElement(arr)+" Is the Missing Element");
		}
	}
public static int missingElement(int arr[]) {
	int i=0;
	while(i<arr.length) {
		int cIndex = arr[i];
		if(arr[i]<arr.length && arr[i]!=arr[cIndex]) {
			int temp = arr[i];
			arr[i] = arr[cIndex];
			arr[cIndex]= temp;
		}else {
			i++;
		}
	}
for(int index =0;index<arr.length;index++) {
	if( arr[index] != index) {
		return index;
			}
}
return -1;
}
}
