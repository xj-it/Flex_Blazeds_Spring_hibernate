package com.fsipro.flex.services;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

@Service("testSerivice")
@RemotingDestination(channels = { "my-amf" })
public class TestSerivice implements ITestService{

	 @RemotingInclude
	public String sayHello(String msg){
		System.out.print("++++++++++++++"+msg+"+++++++++++++++++=");
		return "ÐÜ½¡";
	}
}
