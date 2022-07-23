package org.testing.Assertions;

public class Assert1 {
public static void Assertion1(String exp,String act)
{
	if(exp.equals(act))
	{
		System.out.println("Assertion is passed");
	}
	else
	{
		System.out.println("Assertion is failed");
	}
}
}
