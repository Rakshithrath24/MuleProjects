package com.eai;

import javax.jws.WebService;
@WebService(endpointInterface="com.eai.AdditionInterface",serviceName="Addition")
public class AdditionInterfaceImpl implements AdditionInterface
{
	@Override
	public int addTwoNum(int a, int b) 
	{
		return a+b;
	}
}
