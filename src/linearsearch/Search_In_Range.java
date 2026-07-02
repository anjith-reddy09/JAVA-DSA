package linearsearch;
import java.util.*;
public class Search_In_Range {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i =0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter the element to find ");
	int target = sc.nextInt();
	if(search(arr,target)==-1)
		System.out.println("element not found");
	else
	System.out.println("Element is found in index number "+search(arr,target));
}
public static int search(int arr[],int target) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target)
			return i ;
	}
	return -1;
}
}
