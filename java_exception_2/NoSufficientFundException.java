package java_exception_2;

public class NoSufficientFundException extends Exception {
	private String strValue;
	
	public NoSufficientFundException(String strValue) {
		this.strValue = strValue;
	}
	
	@Override
	public String toString() {
		return "NoSufficientFundException: " + strValue;
	}
}
