import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		int a[] = new int[3];
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter 2 Number: ");
			a[0] = Integer.parseInt(sc.nextLine());
			a[1] = Integer.parseInt(sc.nextLine());
			a[2] = a[0] / a[1];
			System.out.println(a[2]);
		} catch (ArithmeticException e) {
			System.out.println("Error 1 :" + e);
		} catch (NumberFormatException e) {
			System.out.println("Error 2 :" + e);

		} catch (Exception e) {
			System.out.println("Error 3 :" + e);

		} finally {
			System.out.println("Finally.....");
		}

	}

}
