import java.io.BufferedReader;
import java.util.Arrays;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
public class Kamion {
	Tocak[] tockovi;
	public Kamion(String input) throws IOException
	{
		String fajl = "res/" + input + ".txt";
		BufferedReader br = new BufferedReader(new FileReader(fajl));
		tockovi = new Tocak[Integer.parseInt(br.readLine().trim())];
		for(int i = 0; i < tockovi.length; i++)
		{
			String[] tokens = br.readLine().split(",");
			int star= Integer.parseInt(tokens[0].trim());
			if(tokens.length > 1)
			{
				if(tokens[1].trim().equals("letnja"))
				{
					tockovi[i] = new TocakSaLetnjom(star);
					continue;
				}
				if(tokens[1].trim().equals("zimska"))
				{
					tockovi[i] = new TocakSaZimskom(star);
					continue;
				}
			}
			tockovi[i] = new TocakSaUni(star);
		}
		postaviNajboljeTockove();
		br.close();
	}
	private void postaviNajboljeTockove()
	{
		Arrays.sort(tockovi);
	}
	private int brojPuklih=0;
	public boolean vozi()
	{
		Random r = new Random();
		if(r.nextInt(200) == 1)
		{
			int guma = r.nextInt(10);
			while (tockovi[guma].getPguma() == true)
			{
				guma = r.nextInt(10);
			}
			tockovi[guma].setPguma(true);
			brojPuklih++;
		}
		if(brojPuklih < 6 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
