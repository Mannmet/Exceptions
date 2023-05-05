package java_exception;

import java.util.Scanner;

public class CarSpeedExceptionTest {
	private static int speed = 0;
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the car speed: ");
			speed = scanner.nextInt();
			if (speed > 100) {
				throw new VeryFastException();
			} 
			
			else if (speed < 30) {
				throw new VerySlowException();
			} 
			
			else {
				System.out.println("The Car is running at a speed of " + speed);
			}
			scanner.close();
		} catch (VeryFastException e) {
			System.out.println(e);
		} catch (VerySlowException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} 
	}
}