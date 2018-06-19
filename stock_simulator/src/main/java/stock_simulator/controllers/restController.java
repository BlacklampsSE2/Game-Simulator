package stock_simulator.controllers;

import java.util.Collection;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stock_simulator.models.Bank;
import stock_simulator.models.Company;
import stock_simulator.services.BankService;
import stock_simulator.services.CompanyService;


@RestController
public class restController {

	@Autowired
	private CompanyService GameService;
	private AnalystController analystController;//=new AnalystController(GameService);
	private int client_count=0;
//	private CompanyService
	
	@GetMapping(value="/")
	public String hello()
	{
		client_count++;
		System.out.println(client_count);
		return "Hello";
	}
	
	@GetMapping("/findall")
	public double[] getAll(){
		
		return GameService.calStkcmp();
	}
	
	
	@GetMapping("/findRT")
	public int[] getRT(){
		
		return GameService.getRand();
	}
	
	@GetMapping("/findall2")
	public String save() {
	System.out.println("Save");
	//GameService.test();
	return "index";
	}
	
	
	
	
}
