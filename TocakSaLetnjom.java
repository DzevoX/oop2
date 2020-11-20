import java.util.Random;
public class TocakSaLetnjom extends Tocak
{
	public TocakSaLetnjom(int sgume)
	{
		super(sgume);
		Pucanje();
		ispravnost = ispravan();
	}
	@Override
	public boolean ispravan() 
	{
		if(pguma || sgume > 10)
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
		if(r.nextInt(20) == 1)
		{
			pguma=true;
		}
	}
}
