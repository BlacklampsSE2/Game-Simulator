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
import stock_simulator.services.BankService;


@RestController
public class restController {

	@Autowired
	private BankService GameService;
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
	public Collection<Bank> getAll(){
		
		return GameService.findAllBanks();
	}
	
	@GetMapping("/findall2")
	public String save() {
	System.out.println("Save");
	GameService.test();
	return "index";
	}
	
	
	
	
}
