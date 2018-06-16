package stock_simulator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock_simulator.dao.PlayerRepository;
import stock_simulator.models.Player;

@Service
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
	public static boolean validateUser(String name,String password) 
	{
		String query="Select * from Player where Player_Name=name, Password=password";
		
		return true;
	}
}
