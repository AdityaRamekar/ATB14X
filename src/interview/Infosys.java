package interview;

public class Infosys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int a = 14;

boolean flag = true;

if(a <= 1){
System.out.print("Not prime");
}

for(int i = 2;i < a ;i++){

if(a % i != 0){
//skip
}
else{
flag = false;
}
}

if(!flag){
System.out.print("Not prime");
}
else {
	System.out.println("Prime");
}
}
	}


