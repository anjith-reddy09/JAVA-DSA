package arraylist;
import java.util.*;
import java.util.ArrayList;
public class Arraylist_02 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<>(10);
	int n = sc.nextInt();
	for(int i=0;i<=n;i++) {
		list.add(sc.nextInt());
	}
	System.out.println(list);
}
}
