package stock_simulator.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import stock_simulator.models.Game;
import stock_simulator.services.GameService;

@Controller
public class GameConroller {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping("/findallgames")
	public String findAllGames(HttpServletRequest req)
	{
		req.setAttribute("games", gameService.findAllGames());
		req.setAttribute("mode", "GAME_VIEW");
		return "index";
	}
	
	@GetMapping("/updateGame")
	public String updateGame(@RequestParam int id,HttpServletRequest req)
	{
		req.setAttribute("game", gameService.findOne(id));
		req.setAttribute("mode", "GAME_EDIT");
		return "index";
	}
	
	@RequestMapping(value="/saveGame",method= RequestMethod.POST)
	public String save(@ModelAttribute Game game,HttpServletRequest req) {
	System.out.println("Save");
	gameService.save(game);
	req.setAttribute("games", gameService.findAllGames());
	req.setAttribute("mode", "GAME_VIEW");
	return "index";
	}
}
