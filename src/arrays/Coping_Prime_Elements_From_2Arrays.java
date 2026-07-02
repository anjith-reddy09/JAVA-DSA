package arrays;
import java.util.*;
public class Coping_Prime_Elements_From_2Arrays {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of 1st array");
	int sizea = sc.nextInt();
	int arr[] = new int[sizea];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]= sc.nextInt();
	}
	System.out.println("enter the size of 2nd array");
	int sizeb =sc.nextInt();
	int brr [] =new int[sizeb];
	for(int i=0;i<=brr.length-1;i++) {
		brr[i] = sc.nextInt();
	}
	int sizec = countP(arr) + countP(brr);
	int crr[] = new int[sizec];
	int index =0;
	for(int i=0;i<=arr.length-1;i++) {
		int ele = arr[i];
		if(isPrime(ele))
			crr[index++] = ele;
	}
	for(int i=0;i<=brr.length-1;i++) {
		int ele = brr[i];
		if(isPrime(ele))
			crr[index++] = ele;
	}
	System.out.println(Arrays.toString(crr));
}
public static boolean isPrime(int ele) {
	int count =0;
	for(int i=1;i<=ele;i++) {
		if(ele%i==0)
			count++;
	}
	if(count==2)
		return true;
	else return false;
}
public static int  countP(int arr[]) {
	int count = 0;
	for(int i=0;i<=arr.length-1;i++) {
		int ele =arr[i];
		if(isPrime(ele)) {
			count++;
		}
	}
	return count;
}
}
