package restart;
import java.util.*;
public class Finding_Minvalue {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i = 0;i<=arr.length-1;i++) {
		arr[i]= sc.nextInt();
	}
	int ans =arr[0];
	for(int i=1;i<=arr.length-1;i++) {
		if (arr[i]>ans)
			ans = arr[i];
	}
	System.out.println(ans);
}
}
