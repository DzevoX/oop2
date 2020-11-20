import java.util.Random;
public abstract class Tocak implements Comparable <Tocak>
{
	protected boolean ispravnost;
	protected boolean pguma = false;
	protected int sgume;
	public abstract boolean ispravan();
	public Tocak(int sgume)
	{
		this.sgume = sgume;
		Pucanje();
    }
	public boolean getPguma()
	{
		return pguma;
	}
	public int getSgume()
	{
		return sgume;
	}
	public void setSgume(int sgume)
	{
		this.sgume = sgume;
	}
	public void setPguma(boolean pguma)
	{
		this.pguma = pguma;
	}
	@Override
	public String toString() 
	{
		return "Starost gume; " + sgume + " ispravnost: " + pguma;
	}
	public void Pucanje()
	{
		Random r = new Random();
		if(r.nextInt(100) == 1)
		{
			pguma=true;
		}
	}
	@Override
	public int compareTo(Tocak that) 
	{
		return Boolean.compare(this.ispravnost, that.ispravnost);	
	}
}
