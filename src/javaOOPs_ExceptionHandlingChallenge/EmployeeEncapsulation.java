package javaOOPs_ExceptionHandlingChallenge;

class Employee{
	private String id,name,salary;
	
	void setId(String id) {
		this.id = id;
	}
	void setName(String name) {
		this.name = name;
	}
	void setSalary(String salary) {
		this.salary = salary;
	}
	
	String getId() {
	 return id ;
	}
	String getName() {
		return name ;
	}
	String getSalary() {
		return salary ;
	}
}
public class EmployeeEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee johnDoe = new Employee();
		
		johnDoe.setId("1");
		johnDoe.setName("John Doe");
		johnDoe.setSalary("50000.0");
		
		System.out.println("Employee ID: "+johnDoe.getId() + " Employee Name: " +johnDoe.getName()+ " Employee Salary: "+ johnDoe.getSalary());
	}

}
