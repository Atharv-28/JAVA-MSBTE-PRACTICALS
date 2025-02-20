class Grades
{
	public static void main(String args[])
	{
		int grades = 102;
		if(grades < 50)
		{
			System.out.println("Fail!!");
		}
		else if((grades >= 50 )&&(grades < 60))
		{
			System.out.println("D Grade !!");
		}
		else if((grades >= 60)&&(grades < 70))
		{
			System.out.println("C Grade !!");
		}
		else if((grades >= 70)&&(grades <80))
		{
			System.out.println("B Grade !!");
		}
		else if((grades >= 80)&&(grades <90))
		{
			System.out.println("A Grade !!");
		}
		else if((grades >= 90)&&(grades <=100))
		{
			System.out.println("A+ Grade !!");
		}
		else
		{
 			System.out.println("Invalid Marks !!");
		}
	}
}