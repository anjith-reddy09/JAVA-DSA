package restart;
import java.util.*;
import java.util.ArrayList;
public class ArrayList_04 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> list = new ArrayList<>();
	System.out.println("Enter the no.of elements you want to enroll");
	int n = sc.nextInt();
	for(int i=0; i<n;i++) {
		list.add(sc.next());
	}
	System.out.println(list.get(0) +" loves "+list.get(list.size()-1));
}
}
