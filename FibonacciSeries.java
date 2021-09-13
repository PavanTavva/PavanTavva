package calculator;

// A series of numbers in which each number is the sum of the two preceding numbers.

public class FibonacciSeries {
	public static void main(String[] args) {
		int k,a=1,b=1;
		k=0;
		System.out.println("1");
		while(k<15)
		{
			k=a+b;
			System.out.println(k+" ");
			a=b;
			b=k;
		}
	}
}
