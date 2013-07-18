package com.fsipro.flex.services;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

@Service("ctrlSerivice")
@RemotingDestination(channels = { "my-amf" })
public class ctrlService {
	
}
