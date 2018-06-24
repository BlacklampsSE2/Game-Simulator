package stock_simulator.controllers;

import java.util.Collection;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import stock_simulator.models.Transactions;
import stock_simulator.services.TransactionsService;

@Controller
public class TransactionsController {
	@Autowired
	private TransactionsService transactionsService;

	@GetMapping("/findalltrans")
	public String findAllTrans(HttpServletRequest req) {
		req.setAttribute("trans", transactionsService.findAll());
		req.setAttribute("mode", "PORTFOLIO_VIEW");
		return "index";
	}

	@RequestMapping(value = "/savetrans", method = RequestMethod.POST)
	public String save(@ModelAttribute Transactions transactions, HttpServletRequest req) {
		transactionsService.save(transactions);
		return "index";
	}
	
	@GetMapping("/findtrans")
	public Collection<Transactions> getAllTrans(){
		return transactionsService.findAll();
	}
}
