package stock_simulator.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import stock_simulator.models.Bank;
import stock_simulator.models.Player;
import stock_simulator.services.PlayerService;

@Controller
@SessionAttributes("name")
public class PlayerConroller {

	@Autowired
	private PlayerService playerService;
	
	@GetMapping("/getallplayers")
	public String findAllPlayers(HttpServletRequest req)
	{
		req.setAttribute("banks", playerService.findAllPlayers());
		req.setAttribute("mode", "PLAYER_VIEW");
		return "index";
	}
	
	@GetMapping("/updatePlayer")
	public String updatePlayer(@RequestParam int id,HttpServletRequest req)
	{
		req.setAttribute("bank", playerService.findOne(id));
		req.setAttribute("mode", "PLAYER_EDIT");
		return "index";
	}
	
	@RequestMapping(value="/saveplayer",method= RequestMethod.POST)
	public String save(@ModelAttribute Player player,HttpServletRequest req) {
	System.out.println("Save");
	playerService.save(player);
	req.setAttribute("players", playerService.findAllPlayers());
	req.setAttribute("mode", "PLAYER_VIEW");
	return "index";
	}
	
	@RequestMapping(value="/login",method= RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name,
			@RequestParam String password, ModelMap model) {
			if(!PlayerService.validateUser(name,password)) {
				model.put("errorMessage","Invalid Credentials");
			}
			model.put("name", name);
			model.put("pasword", password);
			return "Welcomes";
			
	}
	
}
