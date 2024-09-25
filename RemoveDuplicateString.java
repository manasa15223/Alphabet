package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String[] array1 = {"manasa","thamas","ramesh"};
		String[] array2 = {"amar","thamas","sunitha"};
		
		List<String>resultlist = Stream.concat(Arrays.stream(array1),Arrays.stream(array2))
				.distinct()
				.collect (Collectors.toList());
		
		System.out.println(resultlist);
		
				
			
				
		
				
				
		
	

	}

}
