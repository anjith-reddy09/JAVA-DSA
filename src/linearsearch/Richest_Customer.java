package linearsearch;
import java.util.*;
public class Richest_Customer {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of row and column");
	int row = sc.nextInt(), col = sc.nextInt();
	int arr[][]= new int[row][col];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	maximumWealth(arr);
}
public static void maximumWealth(int arr[][]) {
	int richest =0;
	for(int i=0;i<arr.length;i++) {
		int wealth = 0;
		for(int j=0;j<arr[i].length;j++) {
		 wealth+=arr[i][j];
		}
		System.out.println((i+1)+"st customer has a wealth = "+wealth);
		if(wealth>richest)
			richest = wealth;
	}
	System.out.println("richest person has "+richest);
}
}
