package test.cfbo.springboot.beans;

import org.springframework.stereotype.Component;

@Component
public class TcpMessageHolder {

	private String receivedMsg;

	public String getReceivedMsg() {
		return receivedMsg;
	}

	public void setReceivedMsg(String receivedMsg) {
		this.receivedMsg = receivedMsg;
	}
	
}
