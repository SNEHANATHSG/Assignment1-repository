package interfacepackage;

public class InterfaceClass implements Interface1{
	public void print()
	{
		System.out.println("The output from print method");
	}

	public static void main(String[] args) {
		Interface1 i = new InterfaceClass();
		i.department();
		i.employee();//reference creation-for displaying only the interface output
		InterfaceClass obj = new InterfaceClass();
		obj.print();//for displaying output of the class 
	}

	@Override
	public void employee(){
		String name="Thara";
		System.out.println(name);
		
	}

	@Override
	public void department() {
		String deptname="Mechanical";
		System.out.println(deptname);
		
	}

}
