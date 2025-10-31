package task5Oct25;

public class CountNoOfWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String HK = "hare krishna hare krishna";
		String hk[] = HK.split(" ");
		for(int i = 0;i< hk.length;i++) {
		System.out.println(i+") "+hk[i]);
	}
	}

}
