package stock_simulator.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import stock_simulator.models.Bank;
import stock_simulator.models.CompanyStocks;
import stock_simulator.models.Transactions;
import stock_simulator.services.BankService;
import stock_simulator.services.CompanyService;
import stock_simulator.services.GameService;
import stock_simulator.services.TransactionsService;



@RestController
public class restController {

	@Autowired
	 CompanyService companyService=new CompanyService();
	private BankService bankss;
//	private CompanyService
	
	@GetMapping(value="/")
	public String hello()
	{
		return "index";
	}

	
	@GetMapping("/findall2")
	public String save() {
	System.out.println("Save");
	//GameService.test();
	return "index";
	}

	
	
	@GetMapping("/getMarketPricesTest")
	 public Collection<CompanyStocks> getStokMarketSharsPricesTest() {
	  return companyService.findstocks();
	  
	 }

	@GetMapping("/findalllbnk")
	public Collection<Bank> getAllStocks(){
		return bankss.findAllBanks();
	}
	
	
	
	
}
