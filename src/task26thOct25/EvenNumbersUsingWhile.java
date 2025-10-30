package task26thOct25;

public class EvenNumbersUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1;
		int i = 1;
		while(i <= 20 ){
		
			if(i%2 == 0) {
				System.out.println("Even no " + j + " = " + i);
				j++;
			}
			i++;
			
		}
	}

}
