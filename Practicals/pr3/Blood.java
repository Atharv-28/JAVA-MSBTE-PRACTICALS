import java.util.*;
class Blood
{
	public static void main(String args[])
	{
		int age, weight;
		System.out.println("Enter Age & Weight Respectively : ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		weight = sc.nextInt();
		if(age > 18)
		{
			if(weight < 50)
			{
				System.out.println("You are Eligible for blood Donation");
			}
			else
			{
				System.out.println("You are not Eligible for Blood Donation");
			}
		}
		else
		{
			System.out.println("You are not Eligible for Blood Donation");
		}
	}
}