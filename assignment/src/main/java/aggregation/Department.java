package aggregation;

public class Department {
	String deptname;
	Employee emp_ref;
	public Department(String deptname, Employee emp_ref)
	{
		this.deptname=deptname;
	    this.emp_ref=emp_ref;
	}
	public void display()
	{
		System.out.println("The name of employee is: "+emp_ref.empname);
		System.out.println("The department of the employee is: "+deptname);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Thara");
		Department a1 = new Department("IT",e1);
        a1.display();
	}

}
