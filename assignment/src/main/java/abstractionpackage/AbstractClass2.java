package abstractionpackage;

public class AbstractClass2 extends AbstractClass1{

	public static void main(String[] args) {
		AbstractClass2 ab = new AbstractClass2();
		ab.show();
		ab.department();
		ab.employee();
        AbstractClass1.showCase();
        
        
	}

	@Override
	public void employee() {
		String name="sneha";
		System.out.println(name);
		
	}

	@Override
	public void department() {
		String deptname="IT";
		System.out.println(deptname);
		
	}

}
