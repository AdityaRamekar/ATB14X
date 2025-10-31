package task5Oct25;

public class FirstLetterOfEachWordInAString {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String HK = "hare krishna hare krishna";
		String hk[] = HK.split(" ");
		for(String s : hk){
		System.out.println(s.charAt(0));
	}
	}

}
