package stock_simulator.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

	int count=0;

	@Autowired
	private PlayerService playerService;

	@GetMapping("/getallplayers")
	public String findAllPlayers(HttpServletRequest req) {
		req.setAttribute("banks", playerService.findAllPlayers());
		req.setAttribute("mode", "PLAYER_VIEW");
		return "index";
	}

	@GetMapping("/updatePlayer")
	public String updatePlayer(@RequestParam int id, HttpServletRequest req) {
		req.setAttribute("bank", playerService.findOne(id));
		req.setAttribute("mode", "PLAYER_EDIT");
		return "index";
	}

	@RequestMapping(value = "/saveplayer", method = RequestMethod.POST)
	public String save(@ModelAttribute Player player, HttpServletRequest req) {
		System.out.println("Save");
		playerService.save(player);
		req.setAttribute("players", playerService.findAllPlayers());
		req.setAttribute("mode", "PLAYER_VIEW");
		return "index";
	}

	@GetMapping("/login")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGING");
		return "login";
	}

	@RequestMapping(value = "/login-user")
	public String loginuser(@ModelAttribute Player player, HttpServletRequest req, HttpSession httpSession) {
		System.out.println(player.getUsername());
		System.out.println(player.getPassword());
		if (playerService.findByUsernameAndPassword(player.getUsername(), player.getPassword()) != null) {
			System.out.println("Yes");
			String caller = player.getUsername();
			httpSession.setAttribute("invocationCount",
					1 + Optional.ofNullable((Integer) httpSession.getAttribute("invocationCount")).orElse(0));
			httpSession.setAttribute("latestGreetingArgument", caller);
			System.out.println("S_ID" + httpSession.getId());
			count=count+1;

			return "index";
		} else {
			System.out.println("No");
			return "login";
		}
	}

	@RequestMapping(value = "/playgame")
	public String loginuser() {
		if (count != 0) {
			System.out.println("gameboards");
			return "gameboard";
		}
		else {
			
			System.out.println("Need more players");
		}
		return "index";
	}

}