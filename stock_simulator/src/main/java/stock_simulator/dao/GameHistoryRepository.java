package stock_simulator.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import stock_simulator.models.GameHistory;

@Repository
public interface GameHistoryRepository extends CrudRepository<GameHistory,Integer>{

}
