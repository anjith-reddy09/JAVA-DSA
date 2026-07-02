package strings;
import java.util.*;
public class Search_In_Strings {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String name = sc.next();
	char target = sc.next().charAt(0);
	 System.out.println(search(name,target));
	
}
public static boolean search(String name,char target) {
	if(name.length()==0) {
		return false;
	}
	for(char ch : name.toCharArray()) {
		if(ch==target) {
			return true;
		}
		
	}
	return false;
}
}
