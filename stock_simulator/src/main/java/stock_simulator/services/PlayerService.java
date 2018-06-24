package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock_simulator.dao.PlayerRepository;
import stock_simulator.models.Player;

@Service
@Transactional

public class PlayerService {
	@Autowired
	private PlayerRepository playerRepository;
	
	public Collection<Player>findAllPlayers(){
		List<Player>players=new ArrayList<Player>();
		for(Player player:playerRepository.findAll()) {
			players.add(player);
		}
		return players;
	}
	
	public void delete(int id)
	{
		playerRepository.delete(id);
	}
	
	public Player findOne(int id)
	{
		return playerRepository.findOne(id);
	}
	
	public void save(Player player)
	{
		playerRepository.save(player);
	}
	
	public Player findByUsernameAndPassword(String username,String password)
	{	
		System.out.println(playerRepository.findByUsernameAndPassword(username, password));
		return playerRepository.findByUsernameAndPassword(username, password);
	}
}
