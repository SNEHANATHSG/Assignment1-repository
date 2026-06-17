package school;

public class Student extends Person{
	int rollno;
	char grade;
    public Student(int rollno,char grade)
    {
    	super("Thara",12);
    	this.rollno=rollno;
    	this.grade=grade;
    	
    }
    public void displayDetails()
    {
    	System.out.println(rollno+" "+grade);
    	
    }
    public void show()
    {
    	displayDetails();
    	super.displayDetails();
    }
	public static void main(String[] args) {
		Student s1 =new Student(34,'A');
		s1.show();
		
		
	}

}
