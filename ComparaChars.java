class ComparaChars
{
	public static void main(String args[])
	{
		char[] letras = new char[3];

		if (letras[0] == '\u0000')
		{
			System.out.println("O primeiro elemento é vazio");
		}else{
			System.out.println("O primeiro elemento não é vazio");
		}
		if (letras[0] == '\0')
		{
			System.out.println("O primeiro elemento é vazio");
		}else{
			System.out.println("O primeiro elemento não é vazio");
		}
		if (letras[0] == 0)
		{
			System.out.println("O primeiro elemento é vazio");
		}else{
			System.out.println("O primeiro elemento não é vazio");
		}				
	}
}
