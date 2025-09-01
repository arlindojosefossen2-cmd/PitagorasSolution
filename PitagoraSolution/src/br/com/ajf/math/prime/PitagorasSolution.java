package br.com.ajf.math.prime;

/**
 * The Class PitagorasSolution.
 */
public final class PitagorasSolution
{
	
	/**
	 * Instantiates a new PitagorasSulution solution.
	 */
	private PitagorasSolution()
	{
		
	}
	
	/**
	 * Prime.
	 *
	 * @param xValue the x value
	 * @return the long
	 */
	public static final long prime(int xValue)
	{
		if(xValue < 0 || xValue >= (Short.MAX_VALUE/2 + 1))
			return -1l;
		return counterFlag(xValue) + xValue + 2;
	}

	/**
	 * Counter flag.
	 *
	 * @param xValue the x value
	 * @return the long
	 */
	private static final long counterFlag(int xValue)
	{
		long flag = 0l;	
		long flagCounter = 0l;
		long c = (long)(xValue + 1);
		long i = 1l;
		long p = 2l;
		
		while(i <= c)
		{
			flag = 1l;
			//two conditions are possible  p-1 or p/2
			for(long d = 2l;d <= p/2;d++)
				if(p % d == 0)
				{
					flagCounter++;
					flag = 0l;
					break;
				}
				if(flag == 1)
					i++;
			p++;
				
		}	
		return flagCounter;
	}
}