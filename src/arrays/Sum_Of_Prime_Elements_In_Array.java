package arrays;
import java.util.*;
public class Sum_Of_Prime_Elements_In_Array {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i] = sc.nextInt();
	}
	if(sumPrime(arr)<=0) {
		System.out.println("No Prime elements Found");
	}
	else
		System.out.println("Sum of Prime Elements "+sumPrime(arr));
	
}
public static boolean isPrime(int ele) {
	int count =0;
	for(int i=1;i<=ele;i++) {
		if(ele%i==0) {
			count++;
		}
	}
	if(count==2) 
		return true;
	else return false;

}
public static int sumPrime(int arr[]) {
	int sum = 0;
	for(int i=0;i<=arr.length-1;i++) {
		int ele = arr[i];
		if(isPrime(ele)) {
			sum+=ele;
		}
	}
	return sum;
}
}
