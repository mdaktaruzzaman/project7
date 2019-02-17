package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int num1, num2;
		num1 = 10;
		try {
		int result = num1/0;
				System.out.println(result);
		}catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("you should not devide the number by zero");
		}
		
		System.out.println("we are here because the programe did not quit on you");

	}

}
