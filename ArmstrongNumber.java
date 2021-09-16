package calculator;

 

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n = 153; // input
		int temp = n; 
		int r,sum=0;
		while(n>0) {
		r = n%10;
		n = n/10;
		sum = sum + r*r*r; //27 +125=152+1=153
		}
		if(temp == sum)
			System.out.println("Its an Armstrong Number");
		else
			System.out.println("Its Not a Armstrong Number");
	}
}
