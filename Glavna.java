import java.io.IOException;
public class Glavna 
{
	public static void main(String[] args) throws IOException
	{
		Kamion k = new Kamion("tockovi");
		int km = 500;
		while (km > 0 && k.vozi())
		{
			km--;
		}
		if(km == 0)
		{
			System.out.println("Kamion je stigao do cilja!");
		}
		else
		{
			System.out.println("Kamion se pokvario na " + km + ". kilometru");
		}
	}

}
