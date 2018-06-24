package stock_simulator.dao;

import org.springframework.data.repository.CrudRepository;

import stock_simulator.models.Transactions;

public interface TransactionsRepository extends CrudRepository<Transactions, Integer> {

}
