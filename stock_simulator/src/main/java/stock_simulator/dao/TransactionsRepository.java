package stock_simulator.dao;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stock_simulator.models.Transactions;

@Repository
public interface TransactionsRepository extends CrudRepository<Transactions, Integer> {
	
	public Collection<Transactions> findByCompanyAndPlayer(String company,String player);

}
