package test.cfbo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import test.cfbo.springboot.beans.TcpMessageHolder;

@Controller
public class TcpMonitorController {

	@Autowired
	private TcpMessageHolder msgHolder;

	@RequestMapping("/tcpmonitor")
	public String greeting(
			@RequestParam(value = "msg", required = false, defaultValue = "[No Message Received]") String msg,
			Model model) {
		model.addAttribute("msg", msgHolder.getReceivedMsg());
		return "tcpmonitor";
	}

}
