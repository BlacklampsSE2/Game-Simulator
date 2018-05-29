package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock_simulator.dao.CompanyRepository;
import stock_simulator.models.Company;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	public Collection<Company>findAllCompanies(){
		List<Company>companies=new ArrayList<Company>();
		for(Company company:companyRepository.findAll()) {
			companies.add(company);
		}
		return companies;
	}
	
	public void delete(int id)
	{
		companyRepository.delete(id);
	}
	
	public Company findOne(int id)
	{
		return companyRepository.findOne(id);
	}
	
	public void save(Company company)
	{
		companyRepository.save(company);
	}
}
