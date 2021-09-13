package calculator;

// A palindrome number is a number that remains the same when its digits are reversed.

public class Palindrome {
	public static void main(String[] args) {
		int n=151,r,s=0;
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
	if(t==s)
		System.out.println("Given Number Is Palindrome");
	else
		System.out.println("Not a Palindrome");
	}
		
}
