package superkeyword;

public class SuperChild extends SuperParent {
	String name="Shobha";
	public SuperChild()
	{
		super();//invoking constructor
		System.out.println("I am Super child");
	}
	public void display()
	{
		System.out.println("Accessing superChild");
	}
    public void show()
    {
    	System.out.println("The parent variable is: "+super.name);
    	System.out.println("The child variable is: "+name);//variable invoke
    }
    public void showCase()
    {
    	display();
    	super.display();//instance method 
    }
	public static void main(String[] args) {
		SuperChild ch1 = new SuperChild();
		ch1.show();
		ch1.showCase();
		

	}

}
