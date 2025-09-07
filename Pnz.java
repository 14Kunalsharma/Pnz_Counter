//Write a program to enter the numbers till the the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.*;
class Pnz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of inputs: ");
		int n = sc.nextInt();
		int a;
		int positive=0;
		int negative=0;
		int zeros=0;
		for(int i=1; i<=n; i++){
			a = sc.nextInt();
		if(a>0){
		positive++;
		}
		else if(a<0){
		negative++;
		}
		else{
		zeros++;
		}
		}
		System.out.println("Positive nos. entered= " +positive);
		System.out.println("Negative nos. entered= " +negative);
		System.out.println("Zeros entered= " +zeros);
		sc.close();
	}
}