package polymorphism;

public class PolyChild extends PolyParent {
          String name="Polychild";
          public PolyChild()
          {   
        	  super();
        	  System.out.println("I am polychild");
          }
          public void display()
          {
        	  System.out.println("Hey Polychild");
          }
          public void show()
          {
        	  super.display();
        	  display();
          }
	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.show();
		
	}

}
