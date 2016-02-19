package test.cfbo.springboot.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DummyStringLogger {
	
	private Logger logger = LoggerFactory.getLogger(DummyStringLogger.class);
	
	@Autowired
	private TcpMessageHolder holder;
	
	public void logMessage(String msg) { 
		
		logger.info("Message Received: " + msg);
		logger.info("That's it!");
		
		holder.setReceivedMsg(msg);
	}
	

}
