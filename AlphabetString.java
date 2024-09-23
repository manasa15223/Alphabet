package interview;

import java.util.Arrays;


public class AlphabetString {

	public static void main(String[] args) {
		String [] arrays = {"bhanu","amar","dhanu","mokshi","manasa","bhavi","gani"};
		
		String[] names = Arrays.stream(arrays)
		
		.sorted()
		.toArray(String[]::new);
		
		System.out.println(Arrays.toString(names));
		
		
		
		
		


	}

	
	

}
