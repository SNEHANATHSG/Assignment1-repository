package inheritance1;

public class HiChild1 extends HiParent {
	 int age=12;
	 public void show()
	 {
		 System.out.println("I am HiChild1");
	 }

	public static void main(String[] args) {
		HiChild1 obj = new HiChild1();
		System.out.println(obj.name);
		System.out.println(obj.display(12, 34));
		System.out.println(obj.age);
		obj.show();
		

	}

}
