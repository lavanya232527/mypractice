package utilities;

import java.util.UUID;

public class CommonFunctions 
{
	public static String generataRandomEmail()
	{
	    

		String email = "tom" + java.util.UUID.randomUUID().toString().replace("-", "").substring(0,8) + "@gmail.com";
		return email;
			
	}

}
