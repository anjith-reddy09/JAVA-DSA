package restart;

public class Methods_02 {
public static void main(String[]args) {
	swap(10,30);
	String message = randoll("juliee");
	System.out.println(message);
}
static String randoll(String name) {
	String message ="randoll loves :"+name;
	return message;
}
static void swap(int a , int b)
{
	int temp=a;
	a=b;
	b=temp;
	
}
}
