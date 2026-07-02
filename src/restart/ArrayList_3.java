package restart;
import java.util.*;
import java.util.ArrayList;
public class ArrayList_3 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<>();
	System.out.println("Enter the no.of elements");
	int n = sc.nextInt();
	for(int i=0; i<=n-1; i++) {
		list.add(sc.nextInt());
	}
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i) + " , ");
	}
}
}
