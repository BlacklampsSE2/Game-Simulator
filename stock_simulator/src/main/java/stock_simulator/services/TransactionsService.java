package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock_simulator.dao.TransactionsRepository;
import stock_simulator.models.Transactions;

@Service
public class TransactionsService {
	@Autowired
	private TransactionsRepository transactionsRepository;

	public Collection<Transactions> findAll() {
		List<Transactions> transactions = new ArrayList<Transactions>();
		for (Transactions player_transaction : transactionsRepository.findAll()) {
			transactions.add(player_transaction);
		}
		return transactions;
	}

	public void delete(int id) {
		transactionsRepository.delete(id);

	}

	public Transactions findOne(int id) {
		return transactionsRepository.findOne(id);
	}

	public void save(Transactions transactions) {
		transactionsRepository.save(transactions);
	}

}
