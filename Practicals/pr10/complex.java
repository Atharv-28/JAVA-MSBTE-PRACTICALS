class complex
{
	double real,imagine;
	complex(double r, double i)
	{
		this.real=r;
		this.imagine = i;
	}
	public static complex sum(complex c1, complex c2)
	{
		complex temp = new complex(0,0);
		temp.real = c1.real +c2.real;
		temp.imagine = c1.imagine+c2.imagine;
		return temp;
	}
	public static void main(String args[])
	{
		complex c1 = new complex(6.1,5);
 		complex c2 = new complex(3.4,2);
		complex temp = sum(c1,c2);
		System.out.println("Sum : real = "+temp.real+" imagine = "+temp.imagine);
	}
}