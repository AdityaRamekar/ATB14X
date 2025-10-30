package task26thOct25;

public class EvenNumbers {

	public static void main(String[] args) {
		
		int j = 1;
		for(int i = 1;i<21;i++) {
			if(i%2 == 0) {
				System.out.println("Even no " + j + " = " + i);
				j++;
			}
		}
	}
}
