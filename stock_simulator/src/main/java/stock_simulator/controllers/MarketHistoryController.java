package stock_simulator.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import stock_simulator.services.BankService;
import stock_simulator.services.MarketHistoryService;

@Controller
public class MarketHistoryController {

	@Autowired
	private MarketHistoryService marketHistoryService;

	@GetMapping("/hello")
	public String findAllMarkets(HttpServletRequest req) {
		req.setAttribute("markets", marketHistoryService.findAllMarkets());
		req.setAttribute("mode", "MARKET_VIEW");
		return "index";
	}

}
