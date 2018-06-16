package stock_simulator.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stock_simulator.models.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player,Integer>{

	public Player findByPlayer_NameAndPassword(String player_Name,String password);
	
}
