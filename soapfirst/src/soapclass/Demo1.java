package soapclass;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Demo1 {
	
	@WebMethod
	public int add(int x,int y)
	{
		return x+y;
	}

}
