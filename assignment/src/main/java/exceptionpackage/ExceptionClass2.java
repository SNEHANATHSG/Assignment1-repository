package exceptionpackage;

public class ExceptionClass2 {

	public static void main(String[] args) throws VoteEligibilityException {
		int age=12;
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			throw new VoteEligibilityException("not eligible");
		}


	}

}
