package stock_simulator.controllers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stock_simulator.models.Bank;
import stock_simulator.models.CompanyStocks;
import stock_simulator.models.Transactions;
import stock_simulator.services.BankService;
//import stock_simulator.models.Transactions;
import stock_simulator.services.CompanyService;
//import stock_simulator.services.TransactionService;
import stock_simulator.services.TransactionService;


@RestController
public class restController {
	@Autowired
	CompanyService companyService=new CompanyService();
	
	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private BankService bankService;
	private AnalystController analystController;//=new AnalystController(GameService);
	private int client_count=0;
//	private CompanyService
	
	@GetMapping(value="/")
	public String hello()
	{
		client_count++;
		System.out.println(client_count);
		return "gameboard";
	}
	
//	@GetMapping("/findall")
//	public double[] getAll(){
//		
//		//return GameService.calStkcmp(2);
//	}
//	
//	
//	@GetMapping("/findRT")
//	public int[] getRT(){
//		
//		return GameService.getRand();
//	}
//	
	@GetMapping("/findall2")
	public String save() {
	System.out.println("Save");
	//GameService.test();
	return "gameboard";
	}
	
//	@GetMapping("/findalltest")
//	public Collection<Company>getAllBanks(){
//		return GameService.findAllCompanies();
//	}
	
//	@GetMapping("/findalll")
//	public Collection<CompanyStocks>getAllStocks(){
//		return GameService.findstocks();
//	}

	
	@GetMapping("/getMarketPricesTest")
	 public Collection<CompanyStocks>getaa()
	 {
		//return companyService.findstocks();
		return companyService.getTheAr();
	 }
	  
	@RequestMapping(value = "/tanSave", method = RequestMethod.POST)
	public Transactions save(@RequestBody  Transactions trans) {
		
		transactionService.savetran(trans);
		System.out.println("Save");
		return trans;
		
	}
	
	
	@RequestMapping(value = "/getAblStk", method = RequestMethod.POST)
	public int getAblStk(@RequestBody Transactions company)
	{
		int Buy=0;
		int Sold=0;
		int Qty=0;
		List<Transactions> trans_list= (List<Transactions>) transactionService.findByCompanyAndPlayer(company.getCompany(), company.getPlayer());
		for(Transactions tran:trans_list)
		{
			if(tran.getBuy()==1)
			{
				Buy=Buy+tran.getQty();
			}
			if(tran.getBuy()==0)
			{
				Sold=Sold+tran.getQty();
			}
		}
		Qty=Buy-Sold;
		System.out.println(company);
		//return transactionService.findByCompanyAndPlayer(company, "Snookie");
		return Qty;
	}

	@RequestMapping(value = "/getCash", method = RequestMethod.POST)
	public Collection<Bank> getAblStk(@RequestBody Bank bank)
	{
	  List<Bank>cash_bal_list=(List<Bank>) bankService.findByName(bank.getName());
	  return cash_bal_list;
	}
	
	@RequestMapping(value = "/setCash", method = RequestMethod.POST)
	public void updateCashbal(@RequestBody Bank bank)
	{
		System.out.println(bank.getAccbal());
	  bankService.save(bank);
	  
	  
	}
	
	
	
	
}
