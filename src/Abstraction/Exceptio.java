package Abstraction;

public class Exceptio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			registerUser("shiva","India");
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void registerUser(String name,String country) throws InvalidCountryException {
		if(country.equals("India")){
			System.out.println("Welcome user!");
		}
		else {
			throw new InvalidCountryException(country, 0);
		}
	}
}


class InvalidCountryException extends Exception{
	private int errorCode;
	public InvalidCountryException(String message,int errorCode) {
		super(message);
		this.errorCode=errorCode;
	}
	public int getErrorCode() {
		return errorCode;
	}
	
}