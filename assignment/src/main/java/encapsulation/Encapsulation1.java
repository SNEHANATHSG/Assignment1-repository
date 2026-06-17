package encapsulation;

public class Encapsulation1 {
	private String name;
	private int age;
	public void getter()
	{
		System.out.println(name);
		System.out.println(age);
	}
    public void setter(String name, int age)
    {
    	this.name=name;
    	this.age=age;
    }
}
