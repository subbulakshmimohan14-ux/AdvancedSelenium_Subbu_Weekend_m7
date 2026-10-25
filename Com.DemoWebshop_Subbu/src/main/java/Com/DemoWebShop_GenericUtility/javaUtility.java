package Com.DemoWebShop_GenericUtility;

import java.time.LocalDateTime;

public class javaUtility
{
	
	public String localDateAndTime() 
	{
		
		String value = LocalDateTime.now().toString().replace(":", "").replace("-", "").replace(".", "");
		return value;
	}
}
