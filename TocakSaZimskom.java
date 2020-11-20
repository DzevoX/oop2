public class TocakSaZimskom extends Tocak
{
	public TocakSaZimskom(int sgume)
	{
		super(sgume);
		Pucanje();
		ispravnost = ispravan();
	}
	@Override
	public boolean ispravan() 
	{
		if(pguma || sgume > 5)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
