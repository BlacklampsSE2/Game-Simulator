package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock_simulator.dao.PortFolioRepository;
import stock_simulator.models.Portfolio;

@Service
public class PortfolioService {
	@Autowired
	private PortFolioRepository portFolioRepository;

	public Collection<Portfolio> findAllPortfolio() {
		List<Portfolio> portfolios = new ArrayList<Portfolio>();
		for (Portfolio portfolio : portFolioRepository.findAll()) {
			portfolios.add(portfolio);
		}
		return portfolios;
	}

	public void delete(int id) {
		portFolioRepository.delete(id);
	}

	public Portfolio findOne(int id) {
		return portFolioRepository.findOne(id);
	}

}
