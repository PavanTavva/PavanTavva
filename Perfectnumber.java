package calculator;

public class Perfectnumber {
	
	//Perfect number, a positive integer that is equal to the sum of its proper divisors.
	public static void main(String[] args) {
	
		int n=6;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum += i;
		}
		if(n==sum)
			System.out.println("Its a  Perfect Number");
		else
			System.out.println(" Its not a Perfect Number");
	}
}
