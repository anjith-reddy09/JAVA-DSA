package restart;
import java.util.*;
public class Linear_Search01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("enter the element to find");
	int target = sc.nextInt();
	int found = linearSearch(arr,target);
	if(found==-1)
		System.out.println("element not found");
	else
	System.out.println("element is found "+found);
	
}
public static int linearSearch(int arr[],int target) {
	for(int i=0;i<=arr.length-1;i++) {
		int ele = arr[i];
		if(ele==target) {
			return ele;
		}
			
	}
	return Integer.MAX_VALUE;
}
}
