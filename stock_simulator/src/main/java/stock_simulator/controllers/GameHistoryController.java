package stock_simulator.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import stock_simulator.services.BankService;
import stock_simulator.services.GameHistoryService;

@Controller
public class GameHistoryController {
	
	@Autowired
	private GameHistoryService gamehistoryservice;

	@GetMapping("/gamehistory")
	public String findAllBanks(HttpServletRequest req)
	{
		req.setAttribute("gamehist", gamehistoryservice.findAllBanks());
		req.setAttribute("mode", "GAMEHISTORY_VIEW");
		return "index";
	}
}
