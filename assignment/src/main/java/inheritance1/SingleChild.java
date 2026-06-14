package inheritance1;

public class SingleChild extends SingleParent{
	
    public void show(String name,int age)
    {
    	System.out.println(name);
    	System.out.println(age);
    }
	public static void main(String[] args) {
		SingleChild ch1= new SingleChild();
		ch1.show("Thara",34);
		ch1.display();
		System.out.println(ch1.name);

	}

}
