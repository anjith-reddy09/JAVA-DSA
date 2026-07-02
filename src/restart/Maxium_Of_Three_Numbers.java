package restart;
import java.util.Scanner;
public class Maxium_Of_Three_Numbers {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
//	int max=a;
//	if(b>max)
//		max = b;
//	if(c>max)
//		max=c;
	int max =  Math.max(a, b,c);
	System.out.println("the largest number amoung the numbers :"+max);
}
}
