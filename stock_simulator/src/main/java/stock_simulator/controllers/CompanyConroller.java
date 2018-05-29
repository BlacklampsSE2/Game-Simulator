package stock_simulator.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import stock_simulator.services.CompanyService;

@Controller
public class CompanyConroller {

	@Autowired
	private CompanyService companyService;
	@GetMapping("/findallcmp")
	public String findAllBanks(HttpServletRequest req)
	{
		req.setAttribute("banks", companyService.findAllCompanies());
		req.setAttribute("mode", "COMPANY_VIEW");
		return "index";
	}
}
