package interview;

public class LeargestString {

	public static void main(String[] args) {
		
		int maxlength=0;
		
		String [] array = {"aajdlkdalededaewdfsfgsgsdfasas","bbbbb","ccccc","ddddd","eeeeeeeeeee"};
		
		
		for(String word: array)
		{
		
			
			if(word.length()>maxlength)
			{
				maxlength=word.length();
			}
		}
				System.out.println("the length of the longest number:"+maxlength);
			}
			
		
		
		

	}











