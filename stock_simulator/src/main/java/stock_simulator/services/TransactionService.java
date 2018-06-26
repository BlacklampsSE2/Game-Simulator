package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock_simulator.dao.TransactionsRepository;
import stock_simulator.models.Transactions;

@Service
@Transactional
public class TransactionService {
	@Autowired
	private TransactionsRepository transactionsRepository;
	
	public Collection<Transactions>findAllTrans()
	{
		List<Transactions> trans=new ArrayList<Transactions>();
		for(Transactions tran:transactionsRepository.findAll())
		{
			trans.add(tran);
		}
		return trans;
	}
	
	public void savetran(Transactions transactions)
	{
		transactionsRepository.save(transactions);
	}
	
	public Collection<Transactions> findByCompanyAndPlayer(String company,String player)
	{
		return transactionsRepository.findByCompanyAndPlayer(company, player);
	}
//trs
}
