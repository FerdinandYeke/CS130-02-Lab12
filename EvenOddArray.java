package ArrayPractice;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]numbers = {0,1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] % 2 == 0)
			{
				System.out.println("Even Value: "+numbers[i]);
			}
			
			else
			{
				System.out.println("Odd Value: "+numbers[i]);
			}
		}
		
	}

}
