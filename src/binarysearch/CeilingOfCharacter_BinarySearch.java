package binarysearch;
import java.util.*;
public class CeilingOfCharacter_BinarySearch {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n = sc.nextInt();
	char arr[]=new char[n];
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.next().charAt(0);
	}
System.out.println("Enter the target");
char target = sc.next().charAt(0);
char ans = ceilingBinary(arr,target);
if(ans =='\0') {
	System.out.println("No ceiling character found");
}
else
	System.out.println("ceiling character in the array is :"+ans);
}
public static char ceilingBinary(char arr[],char target) {
	int start =0;
	int end = arr.length-1;
	while(start <= end) {
		int mid = start +(end - start)/2;
		if(target <arr[mid]) {
			end = mid-1;
		}
		else if(target > arr[mid]) {
			start = mid+1;
		}else return arr[0];
	}
	if(start ==arr.length) {
		return '\0';
	}
	return arr[start];
}
}
