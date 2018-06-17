package stock_simulator.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stock_simulator.models.MarketHistory;

@Repository
public interface MarketHistoryRepository extends CrudRepository<MarketHistory, Integer> {

}