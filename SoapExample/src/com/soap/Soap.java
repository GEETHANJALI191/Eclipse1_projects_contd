package com.soap;

import javax.jws.WebService;

@WebService(targetNamespace = "http://soap.com/", portName = "SoapPort", serviceName = "SoapService")
public class Soap {
	public String message(){
		return "hello";
	}
}
