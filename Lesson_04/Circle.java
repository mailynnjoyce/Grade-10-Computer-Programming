import java.util.Scanner;

public class Circle
{
	static double one;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius:");
		one = kb.nextDouble();
		
		calcArea();
		print();

	}
	
	public static double calcArea()
	{
		return (one*one)*3.14159265;
	}

	public static void print()
	{
		System.out.printf("The area of the circle is %7.2f\n", calcArea());
	}
}