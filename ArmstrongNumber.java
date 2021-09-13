package calculator;

// Armstrong Number

/*
 	153 --> 1 5 3
 			1*1*1* + 5*5*5 + 3*3*3
 			1	+ 125 + 27
 			153
 			Therefore, Armstrong Number is a number that is equal to the sum of cubes of its digits.
*/
 

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
