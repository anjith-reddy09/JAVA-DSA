package restart;

public class Armstrong {
public static void main(String []args) {
	expo(153);
}
public static int countDigits(int n) {
	int count=0;
	while(n>0) {
		count++;
		n=n/10;
	}
	return count;
}
public static void expo(int n)
{
	int temp=n;
	int original=n;
	int pow=countDigits(n);
	int sum=0;
	int expo =1;
	for(int i=1;i<=pow;i++)
	{
		while(temp>0) {
			int ld=n%10;
			expo=expo*ld;
			n=n/10;
		}
		sum=sum+expo;
	}
	if(original==sum)
		System.out.println("Armstrong number");
	else
		System.out.println("Not Armstrong number");
}
}
