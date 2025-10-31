package task5Oct25;

public class SecondMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};// O/P → 34 ,don’t use sorting function.
		int max = numbers[0],secMax = 0;
		for(int i=0;i< numbers.length;i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
			
		}
		System.out.println("max is: "+ max);
		
		for(int i=0;i <numbers.length;i++) {
			if((secMax < numbers[i]) && (numbers[i] != max)) {
				secMax = numbers[i];
			}
		}
		
		System.out.println("2nd max is: "+ secMax);
	}

}
