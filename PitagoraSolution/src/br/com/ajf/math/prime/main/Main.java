package br.com.ajf.math.prime.main;

import br.com.ajf.math.prime.PitagorasSolution;

public final class Main
{

	public static void main(String[] args)
	{
		for (int i = 0; i < 255; i++)
		{
			System.out.println(PitagorasSolution.prime(i));
		}
	}

}
