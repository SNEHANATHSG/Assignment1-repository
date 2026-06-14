package inheritance1;

public class HiChild2 extends HiParent{
	String course="java";
	public HiChild2()
	{
		System.out.println("I am HiChild2");
	}

	public static void main(String[] args) {
		HiChild2 ch2= new HiChild2();
		System.out.println(ch2.course);
		System.out.println(ch2.name);
		System.out.println(ch2.display(45, 35));

	}

}
