package task5Oct25;

public class RevAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sram = "sram",mars;
		char[] c = sram.toCharArray();
		char[] crev = new char[c.length];
		for(int i = 0;i<c.length;i++){
//			System.out.print(c[i]);
			crev[i] = c[c.length-i-1];
		}
		mars = new String(crev);
		
		System.out.println("reversed string is:"+mars);
	}

}
