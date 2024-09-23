package interview;

public class FabonacciSeries {

	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		for( a=0;a<n;a++)
		{
			int next =a+b;
			System.out.println(" "+next);
			a=b;
			b=next;
			
		}
		
		

	}

}
