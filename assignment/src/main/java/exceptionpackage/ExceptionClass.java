package exceptionpackage;

public class ExceptionClass {

	public static void main(String[] args) {
		int a=15;
		int b=0;
		try {     //exception chance code 
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception d)//how to handle the exception
		{
			b=2;
			int c=a/b;//c should be declared again since earlier it is declared inside the try block
			System.out.println(c);
		}
		finally//will be executed irrespective of exception or exception is handled
		{
			System.out.println("finally block");
		}
		

	}

}
