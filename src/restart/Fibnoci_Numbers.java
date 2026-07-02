package restart;
import java.util.Scanner;
public class Fibnoci_Numbers {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	int n =sc.nextInt();
	int a =0,b = 1;
	for(int k=2;k<=n;k++) {
		int temp =b;
		b+=a;
		a=temp;
		
	}
	System.out.println(b);
	
}
}
