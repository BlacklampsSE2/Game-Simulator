package stock_simulator.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stock_simulator.models.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Integer>{

}
