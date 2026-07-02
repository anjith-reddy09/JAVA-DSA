package restart;
import java.util.Scanner;
public class Switch_Cases {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String fruit = sc.next();
	switch(fruit) {
	case "mango":
		System.out.println("yellove");
		break;
	case "grapes":
		System.out.println("Green");
	    break;
	case "apple":
		System.out.println("red");
	    break;
	    default:
	    	System.out.println("Invalid fruit");
	    
	}
}
}
