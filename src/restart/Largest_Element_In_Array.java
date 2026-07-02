package restart;
import java.util.*;
public class Largest_Element_In_Array {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int arr[]= new int[size];
	int largest = Integer.MIN_VALUE;
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
		int ele = arr[i];
		if(ele > largest)
			largest = ele;
	}
	System.out.println("largest Among the elements int the given array is :"+largest);
}
}
