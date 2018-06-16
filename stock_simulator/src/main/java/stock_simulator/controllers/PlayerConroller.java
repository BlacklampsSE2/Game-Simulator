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
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request)
	{
		request.setAttribute("mode","MODE_LOGING");
		return "login";
	}
	
	@RequestMapping("/login-user")
	public String loginUser(@ModelAttribute Player player,HttpServletRequest request)
	{
		if(playerService.findByPlayer_NameAndPassword(player.getPlayer_Name(),player.getPassword())!=null) {
		//	System.out.println("OK");
		return "index";	
			
		}
		
		else
		{
			request.setAttribute("error", "Invalid U_Name");
			request.setAttribute("MODE", "MODE_LOGING");
			return "login";
		}
			
	}
	
}
