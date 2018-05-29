package stock_simulator.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stock_simulator.models.Bank;
import stock_simulator.services.BankService;

@RestController
public class restController {

	@Autowired
	private BankService bankService;
	private int client_count=0;
	
	@GetMapping(value="/")
	public String hello()
	{
		client_count++;
		System.out.println(client_count);
		return "Hello";
	}
	
	@GetMapping("/findallbanks")
	public Collection<Bank>getAllBanks(){
		return bankService.findAllBanks();
	}
	
	@GetMapping("/del")
	public void delete(@RequestParam int id) {
		bankService.delete(id);
	}
}
