package restart;
import java.util.Scanner;
public class Looping_Statements_02 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int i=1;
	while(i<=10) {
		System.out.println(num+" * "+i+" = "+num*i);
		i++;
	}
	}

}
