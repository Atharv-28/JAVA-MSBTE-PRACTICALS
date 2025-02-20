class expli2
{
	public static void main(String args[])
	{
		double d = 34.5765355;
		float f = (float)d;
		long l = (long)f;
		int i = (int)l;
		short s = (short)i;
		byte b = (byte)s;
		System.out.println("Value in double : "+d);
		System.out.println("Value in float : "+f);
		System.out.println("Value in long : "+l);
		System.out.println("Value in int : "+i);
		System.out.println("Value in short : "+s);
		System.out.println("Value in byte : "+b);
	}
}