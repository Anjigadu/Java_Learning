package com.prakash.web;

import javax.jws.WebService;


@WebService(endpointInterface = "com.prakash.web.HelloWorld",
serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld{
	
	public String SayHello(String name){
		return "Hello world from " + name;
	}

}
