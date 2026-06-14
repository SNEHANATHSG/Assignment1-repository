package accessspecifier;


public class Access1 {
 public void display()
 {
	 System.out.println("The public access specifier");
 }
 protected void display1()
 {
	 System.out.println("The protected access specifier");
 }
 private void display2()
 {
	 System.out.println("The private access specifier");
 }
 void display3()
 {
	 System.out.println("The default access specifier");
 }
 public static void main(String args[])
 {
	 Access1 a1 = new Access1();
	 a1.display();
	 a1.display1();
	 a1.display2();
	 a1.display3();
 }
}
