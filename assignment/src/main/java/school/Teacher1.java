package school;

public class Teacher1 {
	String name;
    Department1 dept_ref;
    public Teacher1(String name,Department1 dept_ref)
    {
    	this.name=name;
    	this.dept_ref=dept_ref;
    }
    public void show()
    {
    	System.out.println(name);
    }
    
	public static void main(String[] args) {
		Department1 d1 = new Department1("IT");
		Teacher1 t1= new Teacher1("jyothi",d1);
		t1.show();
		d1.displayDepartment();

	}

}
