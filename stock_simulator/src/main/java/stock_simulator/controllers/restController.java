package stock_simulator.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import stock_simulator.models.Player;
import stock_simulator.services.PlayerService;

@RestController
public class restController {

	@Autowired
	private PlayerService GameService;
	private int client_count=0;
//	private CompanyService
	
	@GetMapping(value="/")
	public String hello()
	{
		client_count++;
		System.out.println(client_count);
		return "Hello";
	}
	
	@GetMapping("/findall")
	public Collection<Player> getAll(){
		return GameService.findAllPlayers();
	}
	
	
}
