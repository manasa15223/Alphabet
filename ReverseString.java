package interview;

public class ReverseString {

	public static void main(String[] args) {
		String [] array = {"manu","chinni","hamu"};
		int i=0;
		for(i=0;i< array.length;i++)
		{
			array[i]= reveseArray(array[i]);
			
		}
		for(String str:array) {
			System.out.println(str);
		}
		
}

	private static String reveseArray(String string) {
		
		return new StringBuilder(string).reverse().toString();
	}
}
