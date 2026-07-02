package restart;
import java.util.Scanner;
public class Repeat_Of_Numbers {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int r = sc.nextInt();
	int count=0;
	while(num>0) {
		int ld = num%10;
		if(ld==r)
			count++;
		num=num/10;
	}
	System.out.println(count);
	}
}
