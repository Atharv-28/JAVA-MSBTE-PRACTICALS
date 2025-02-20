class student
{
	int id,age;
	String name;
	student(int i, String s)
	{
		id = i;
		name = s;
	}
	student(int i, String s, int a)
	{
		id = i;
		name = s;
		age = a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String args[])
	{
		student s1 = new student(101,"Atharv");
		student s2 = new student(102,"Sarthak",16);
		s1.display();
		s2.display();
	}
}