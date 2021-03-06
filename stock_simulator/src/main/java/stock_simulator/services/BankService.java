package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock_simulator.dao.BankRepository;
import stock_simulator.models.Bank;

@Service
@Transactional
public class BankService {
	@Autowired
	private BankRepository bankRepository;
	
	public Collection<Bank>findAllBanks(){
		List<Bank>banks=new ArrayList<Bank>();
		for(Bank bank:bankRepository.findAll()) {
			banks.add(bank);
		}
		return banks;
	}
	
	public void delete(int id)
	{
		bankRepository.delete(id);
	}
	
	public Bank findOne(int id)
	{
		return bankRepository.findOne(id);
	}
	
	public void save(Bank bank)
	{
		bankRepository.save(bank);
	}
	
	public void test()
	{
		System.out.println("OK");
	}
	
	public Collection<Bank> findByName(String name)
	{
		return bankRepository.findByName(name);
	}
}
