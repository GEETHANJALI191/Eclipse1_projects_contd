package com.soap;

import javax.jws.WebService;

@WebService(targetNamespace = "http://soap.com/", portName = "SoapClassPort", serviceName = "SoapClassService")
public class SoapClass {
public String message(){
	return "hello";
}
}
