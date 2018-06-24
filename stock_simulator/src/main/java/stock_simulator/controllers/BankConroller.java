package stock_simulator.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import stock_simulator.models.Bank;
import stock_simulator.services.BankService;

@Controller
public class BankConroller {

	@Autowired
	private BankService bankService;

	@GetMapping("/hesllo")
	public String findAllBanks(HttpServletRequest req) {
		req.setAttribute("banks", bankService.findAllBanks());
		req.setAttribute("mode", "BANK_VIEW");
		return "NewFile";
	}

	@GetMapping("/updateBank")
	public String updateBank(@RequestParam int id, HttpServletRequest req) {
		req.setAttribute("bank", bankService.findOne(id));
		req.setAttribute("mode", "BANK_EDIT");
		return "index";
	}

	@RequestMapping(value = "/bankSave", method = RequestMethod.POST)
	public String save(@ModelAttribute Bank bank, HttpServletRequest req) {
		System.out.println("Save");
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbb" + bank.getName());
		bankService.save(bank);
		req.setAttribute("banks", bankService.findAllBanks());
		req.setAttribute("mode", "BANK_VIEW");
		return "index";
	}

	/*public void save(String name) {
		Bank bank = new Bank();
		bank.setName(name);
		bank.setAcc_Bal(new BigDecimal("0.01"));
		System.out.println(bank.getAcc_Bal());
		bankService.save(bank);
	}*/

	/*
	 * public void save(String Name, String Sector, BigDecimal Acc_Bal) {
	 * bankService.save(Name, Sector, Acc_Bal);
	 * 
	 * }
	 */

}
