package ex_16_Arrays;

public class righthalfpyramid_rightaligned {

/*
 __*
 _**
 ***
 */

	public static void main(String[] args) {
	    for(int i = 2 ;i>=0;i--){
	        for(int j =0;j<=2;j++){
	            
	            if(j<i)
	        		System.out.print("_");
	        	else if(j>=i)
	        	System.out.print("*");

	    }
	    System.out.println();
	}
	}

}
