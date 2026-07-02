package linearsearch;
import java.util.*;
public class Finding_EvennumberOF_Digits {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size = sc.nextInt();
	int arr[]= new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("no.of even elements ="+evenDigitsCount(arr));
}
public static int evenDigitsCount(int arr[]) {
	int count =0;
	for(int i=0;i<arr.length;i++) {
		int ele = arr[i];
		if(count(ele)) {
			count++;
		}
	}
	return count;
}
public static boolean count(int ele) {
	int count =0;
	while(ele>0) {
		count++;
		ele = ele/10;
	}
	return count%2==0;
}
}
