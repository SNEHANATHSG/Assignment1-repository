package abstractionpackage;

public abstract class AbstractClass1 {
	public abstract void employee();//abstract method
	public abstract void department();
    public void show()//instance method
    {
    	System.out.println("output of non abstract method");
    }
    public AbstractClass1()//constructor
    {
    	System.out.println("output of constructor");
    }
    public static void showCase()//static method
    {
    	System.out.println("output of static method");
    }
    
    
}
