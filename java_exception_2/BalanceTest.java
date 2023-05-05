package java_exception_2;
import java.util.Scanner;

public class BalanceTest {
	public static void main(String[] args) {
		Balance balance = new Balance();
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter the Balance: ");
			balance.setBal(scanner.nextInt());
			System.out.println("Available balance: " + balance.getBal());
			
			System.out.print("Enter the amount to withdraw: ");
			int withdrawAmt = scanner.nextInt();
			balance.withdraw(withdrawAmt);
			
			System.out.println("Amount withdrawn: " + withdrawAmt);
			System.out.println("Available balance: " + balance.getBal());			
		}
		catch(NoSufficientFundException e) {
			System.out.println(e);
		}
		
		scanner.close();
	}
}
