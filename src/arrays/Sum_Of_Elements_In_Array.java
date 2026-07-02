package arrays;
import java.util.*;
public class Sum_Of_Elements_In_Array {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int arr[] = new int[size];
	int sum =0;
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]= sc.nextInt();
		int ele =arr[i];
		sum = sum+ele ;
	}
	System.out.println("sum of all elements "+sum);
}
}

