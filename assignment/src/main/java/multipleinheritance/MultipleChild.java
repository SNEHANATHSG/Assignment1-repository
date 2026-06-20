package multipleinheritance;

public class MultipleChild implements Interfaceparent1,Interfaceparent2 {
	

	public static void main(String[] args) {
		
		Interfaceparent1 ref1 = new MultipleChild();
		ref1.student();//reference of interface1
		Interfaceparent2 ref2 =new 	MultipleChild();
		ref2.studentDetails();//reference of interface2
		

	}

	@Override
	public void studentDetails() {
		System.out.println("abstract method from interface2");
		
	}

	@Override
	public void student() {
		System.out.println("abstract method from interface1");
		
	}

}
