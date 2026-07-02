package restart;
import java.util.*;
public class Even_Odd_Elements_In_Array {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]= new int[size];
		int evenCount =0,oddCount =0;
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
			int ele = arr[i];
			if (ele%2==0)
				evenCount++;
			else
				oddCount++;
			
		}
		System.out.println("Even count = "+evenCount);
		System.out.println("Odd count = "+oddCount);
}
}
