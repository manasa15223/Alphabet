package interview;

public class LamdaExpress {

	public static void main(String[] args) {
	

		int[] array = {1,2,7,5,8,6,4,3};
		int targetSum=8;
		findPairsWithSum(array,targetSum);
	}
	public static void findPairsWithSum(int[]array,int targetSum) {
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++) {
				if(array[i]+array[j]==targetSum) {
					System.out.println("Pairs found:("+array[i]+","+array[j]+")");
				}
			}
		}

	}





	}


