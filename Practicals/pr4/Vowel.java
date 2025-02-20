class Vowel
{
	public static void main(String args[])
	{
		char alpha = 'b';
		String tyAlpha = "";
		switch(alpha)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
						tyAlpha = "Vowel";
						break;
			default : 
						tyAlpha = "Consonant";
						break;
		}
		System.out.println(tyAlpha);
	}
}