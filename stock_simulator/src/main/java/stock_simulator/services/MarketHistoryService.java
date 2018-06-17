package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock_simulator.dao.MarketHistoryRepository;
import stock_simulator.models.MarketHistory;

@Service
public class MarketHistoryService {
	@Autowired
	private MarketHistoryRepository marketHistoryRepository;

	public Collection<MarketHistory> findAllMarkets() {
		List<MarketHistory> markets = new ArrayList<MarketHistory>();
		for (MarketHistory market : marketHistoryRepository.findAll()) {
			markets.add(market);
		}
		return markets;
	}

}
