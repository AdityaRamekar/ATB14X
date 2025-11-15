package interview;

public class Altera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input = "Aditya Ramekar"
		//output = "aytidA rakemaR"
		
		String input = "Aditya Ramekar";

		//split the word

		String[] word = input.split(" ");

//		System.out.println(word[0]);
//		System.out.println(word[1]);

		//reverse the word[0]
		int len = word.length;//2
		String firstName = word[0];//Aditya
		//System.out.println(firstName);
	
//		for(int i = len-1;i>=0;i--){
//
//		System.out.print(firstName.charAt(i));//a y t i d a
//		}
//		System.out.print(" ");
//		//second name
//
//		len = word[1].length();
//		String SecondName = word[1];
//		//System.out.println(SecondName);
//		for(int i = len-1;i>=0;i--){
//
//		System.out.print(SecondName.charAt(i));
		
		for(int i = 0;i<=len-1;i++) {
			for(int j = word[i].length()-1;j >= 0;j--) {
				
				System.out.print(word[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
