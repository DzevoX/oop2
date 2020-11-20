import java.util.Random;
public class TocakSaUni extends Tocak
{
	public TocakSaUni(int sgume)
	{
		super(sgume);
		Pucanje();
		ispravnost = ispravan();
	}
	@Override
	public boolean ispravan()
	{
		if(pguma || sgume > 7)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	@Override
	public void Pucanje()
	{
		Random r = new Random();
		if(r.nextInt(33) == 1)
		{
			pguma=true;
		}
	}
}
