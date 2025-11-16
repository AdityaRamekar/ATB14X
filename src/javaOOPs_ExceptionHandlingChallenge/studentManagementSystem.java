package javaOOPs_ExceptionHandlingChallenge;


class Student{
	String name, rollNo, section;
	
	Student(String name,String rollNo,String section){
		this.name= name;
		this.rollNo = rollNo;
		this.section = section;
	}
	
	void print(){
		System.out.print("Student: "+this.name + ", ");
		System.out.print("Roll No: "+this.rollNo + ", ");
		System.out.println("Section: "+this.section);
	}
}
public class studentManagementSystem {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student bob = new Student("Bob","101","A");
		bob.print();
	}

}
