package tools;

import java.math.BigInteger;
import java.security.SecureRandom;

public abstract class Functions {

	private static SecureRandom random = new SecureRandom();
	
	public static String generateString()
	{
		return new BigInteger(130, random).toString(32);
	}

}
