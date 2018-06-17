package stock_simulator.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import stock_simulator.services.PortfolioService;

@Controller
public class PortfolioController {

	@Autowired
	private PortfolioService portfolioService;

	@GetMapping("/hello")
	public String findAllPortfolios(HttpServletRequest req) {
		req.setAttribute("portfolios", portfolioService.findAllPortfolio());
		req.setAttribute("mode", "PORTFOLIO_VIEW");
		return "index";
	}

	@GetMapping("/updateBank")
	public String updatePortFolio(@RequestParam int id, HttpServletRequest req) {
		req.setAttribute("portfolio", portfolioService.findOne(id));
		req.setAttribute("mode", "PORTFOLIO_EDIT");
		return "index";
	}

}
