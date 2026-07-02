package restart;
import java.util.*;
public class Sum_Of_Elements_At_Even_Indices {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i] = sc.nextInt();
	}
	int sum = sumOfEvenElements(arr);
	System.out.println("Sum of Even elements at even Indices "+sum);
	
}
public static int sumOfEvenElements(int arr[]) {
	int sum =0;
	for(int i=0;i<=arr.length-1;i++) {
		int ele = arr[i];
		if(i%2==0) {
			if(ele%2==0) {
				sum+=ele;
			}
		}
	}
	return sum;
}
}
