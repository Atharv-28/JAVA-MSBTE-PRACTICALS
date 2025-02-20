import java.util.*;
class Add
{
	public static void main(String srgs[])
	{
		int a,b,c;
		System.out.println("Enter 2 numbers : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println(a+" + "+b+" = "+c);
	}
}