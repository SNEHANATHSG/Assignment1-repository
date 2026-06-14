package inheritance1;

public class Child extends Parent{
        String course="java";
        public Child()
        {
        	System.out.println("I am Child");
        }
	public static void main(String[] args) {
		   Child ch= new Child();
		   System.out.println(ch.name);
		   ch.display();
		   System.out.println(ch.age);
		   ch.show();
		   System.out.println(ch.course);
		   
 
	}

}
