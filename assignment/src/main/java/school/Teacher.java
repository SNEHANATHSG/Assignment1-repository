package school;

public class Teacher extends Person {
	String subject;
	int salary;
    public Teacher(String subject,int salary)
    {
    	super("Shobha",15);
    	this.subject=subject;
    	this.salary=salary;
    }
    public void displayDetails()
    {
    	System.out.println(subject+" "+salary);
    }
    public void showCase()
    {
    	displayDetails();
    	super.displayDetails();
    }
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Maths",35000);
		t1.showCase();
	}

}
