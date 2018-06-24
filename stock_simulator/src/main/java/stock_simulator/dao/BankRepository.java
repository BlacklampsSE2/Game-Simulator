package stock_simulator.dao;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stock_simulator.models.Bank;

@Repository
public interface BankRepository extends CrudRepository<Bank, Integer> {

	
}
