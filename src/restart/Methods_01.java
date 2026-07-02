package restart;

public class Methods_01 {
public static void main(String[]args) {
	hello();
	System.out.println(isEven(7));
	System.out.println(reverse(2345));
	System.out.println(countDigits(7648));
	Methods_01 s = new Methods_01();
	System.out.println(s.oddDigits(21));
}
public static void hello() {
	System.out.println("welcome to java");
}
public static boolean isEven(int n) {
	if (n%2==0)
		return true;
	else
		return false;
}
public static int reverse(int n) {
	int rev=0;
	while(n>0) {
		int ld = n%10;
		rev=rev*10+ld;
		n=n/10;
	}
	return rev;
}
public static int countDigits(int n) {
	int count=0;
	while(n>0) {
		n=n/10;
		count++;
	}
	return count;
}
public boolean oddDigits(int n) {
	if(n%2!=0)
		return true;
	else 
		return false;
}
}


