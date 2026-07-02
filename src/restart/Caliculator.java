package restart;
import java.util.Scanner;
public class Caliculator {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int res=0;
			System.out.println("enter any two numbers ");
			int n1 =sc.nextInt(),n2 = sc.nextInt();
			char ch = sc.next().trim().charAt(0);
			if(ch=='+' ||ch=='-' || ch=='*' || ch=='/' || ch=='%') {
				if(ch=='+')
					res=n1+n2;
					if(ch=='-')
						res=n1 - n2;
					if (ch=='*')
						res=n1*n2;
					if (ch=='%')
						res=n1%n2;
					if(ch=='/')
						res=n1/n2;
						
			}
			else {
				System.out.println("INVALID OPREATION");
			
		}
			System.out.println(res);
		
	}}}


