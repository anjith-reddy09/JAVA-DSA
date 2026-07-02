package restart;
import java.util.*;
public class Arrays_01 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	int leng = sc.nextInt();
	String str[]= new String[leng];
	for(int i=0;i<=str.length-1;i++) {
		str[i]=sc.next();
	}
	System.out.println(Arrays.toString(str));

}}
