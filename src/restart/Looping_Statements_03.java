package restart;
import java.util.Scanner;
public class Looping_Statements_03 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int i=1;
	do {
		System.out.println(num+" * "+i+" = "+num*i);
		i++;
	}while(i<=10);
}
}
