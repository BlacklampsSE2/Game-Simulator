package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import stock_simulator.dao.CompanyRepository;
import stock_simulator.models.Company;
import stock_simulator.models.CompanyStocks;

@Service
public class CompanyService {

	Company company_Obj = new Company();
	public CompanyStocks CompanyStocks_obj=new CompanyStocks();
	@Autowired
	private CompanyRepository companyRepository;
	
	private List<CompanyStocks> companyStocks=new ArrayList<CompanyStocks>();

	public Collection<Company> findAllCompanies() {
		List<Company> companies = new ArrayList<Company>();
		for (Company company : companyRepository.findAll()) {
			companies.add(company);
		}
		return companies;
	}
    public Collection<CompanyStocks> findstocks()
    {
    	List<Company> companies = new ArrayList<Company>();
    	//CompanyStocks stocks = new CompanyStocks();
    	companies=(List<Company>) findAllCompanies();
    	for(Company companyStocks1 : companies)
    	{
    		CompanyStocks stocks = new CompanyStocks();
    		
    		stocks.calStkc(companyStocks1);
    		stocks.setComapany_Id(companyStocks1.getComapany_Id());
    		stocks.setCompany_Name(companyStocks1.getCompany_Name());
    		stocks.setSector_Name(companyStocks1.getSector_Name());
    		companyStocks.add(stocks);
    	}
    	//CompanyStocks_obj=(CompanyStocks) companyStocks;
    	return  companyStocks;
    }
    
    public Collection<CompanyStocks> getTheAr()
    {
    	return  companyStocks;
    }

	
	public void delete(int id) {
		companyRepository.delete(id);
	}

	public Company findOne(int id) {
		return companyRepository.findOne(id);
	}

	public void save(Company company) {
		companyRepository.save(company);
	}



//test
}
