package stock_simulator.controllers;

import java.awt.color.CMMException;
import java.util.Collection;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import stock_simulator.models.Company;
import stock_simulator.services.CompanyService;

@Controller
public class CompanyConroller {

	@Autowired
	private CompanyService companyService;
	@GetMapping("/findallcmp")
	public String findAllCompanies(HttpServletRequest req)
	{
		req.setAttribute("companies", companyService.findAllCompanies());
		req.setAttribute("mode", "COMPANY_VIEW");
		return "index";
	}
	
	@GetMapping("/updateComapany")
	public String updateGame(@RequestParam int id,HttpServletRequest req)
	{
		req.setAttribute("companies", companyService.findOne(id));
		req.setAttribute("mode", "COMPANY_EDIT");
		return "index";
	}
	
	@RequestMapping(value="/saveComapny",method= RequestMethod.POST)
	public String save(@ModelAttribute Company company,HttpServletRequest req) {
	System.out.println("Save");
	companyService.save(company);
	req.setAttribute("companies", companyService.findAllCompanies());
	req.setAttribute("mode", "COMPANY_VIEW");
	return "index";
	}
	
	@GetMapping("/test")
	public Collection<Company>getall()
	{
		return companyService.findAllCompanies();
	}
	
	@GetMapping("/game")
	public String findAllBanks(HttpServletRequest req)
	{
		req.setAttribute("companyStocks", companyService.findstocks());
		req.setAttribute("mode", "STOCK_VIEW");
		return "NewFile";
	}
	
	@GetMapping("/ga")
	public String f()
	{
		
		return "NewFile";
	}
	
}
