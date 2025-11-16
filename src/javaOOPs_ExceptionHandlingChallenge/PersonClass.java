package javaOOPs_ExceptionHandlingChallenge;

class Person{
	String name;
	int age;
}
public class PersonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person john = new Person();
		Person alice = new Person();
		john.name = "John";
		john.age = 25;
		
		alice.name = "Alice";
		john.age = 30;
		
		System.out.print("Name: "+john.name+", Age: "+john.age + " ");

		System.out.println("Name: "+alice.name+", Age: "+alice.age);}

}
