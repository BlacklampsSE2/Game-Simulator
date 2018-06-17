package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock_simulator.dao.GameHistoryRepository;
import stock_simulator.models.GameHistory;



@Service
public class GameHistoryService {

	@Autowired
	private GameHistoryRepository gamehistoryRepository;
	
	public Collection<GameHistory>findAllBanks(){
		List<GameHistory>gamehist=new ArrayList<GameHistory>();
		for(GameHistory game:gamehistoryRepository.findAll()) {
			gamehist.add(game);
		}
		return gamehist;
	}
	
	public void delete(int id)
	{
		gamehistoryRepository.delete(id);
	}
	
	public GameHistory findOne(int id)
	{
		return gamehistoryRepository.findOne(id);
	}
}
