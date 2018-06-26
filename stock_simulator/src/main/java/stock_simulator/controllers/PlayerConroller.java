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

import stock_simulator.models.Bank;
import stock_simulator.models.CompanyStocks;
import stock_simulator.models.Player;
import stock_simulator.services.AIPlayerService;
import stock_simulator.services.BankService;
import stock_simulator.services.CompanyService;
import stock_simulator.services.PlayerService;

@Controller
@SessionAttributes("name")
public class PlayerConroller {

	public String[][] sesscount = new String[5][2];
	String counts;
	int count;

	@Autowired
	private PlayerService playerService;
	List<String> httpSessionList;

	@Autowired
	private BankService bankService;

	@Autowired
	BankConroller bankController;

	@Autowired
	CompanyService companyService = new CompanyService();

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

	@RequestMapping(value = "/register-user", method = RequestMethod.POST)
	public String save(@ModelAttribute Player player, HttpServletRequest req) {
		System.out.println("Save");
		if (playerService.findByUsernameAndPassword(player.getUsername(), player.getPassword()) != null) {
			System.out.println("Yes");

			return "login";
		} else {
			System.out.println(player.getUsername());
			Bank bank = new Bank();

			bank.setName(player.getUsername());
			bank.setAccbal(1000);
			bankService.save(bank);
			playerService.save(player);

			return "login";
		}
	}

	@GetMapping("/login")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGING");
		return "login";
	}

	/*
	 * @GetMapping("/register") public String register(HttpServletRequest request) {
	 * request.setAttribute("mode", "MODE_REGISTER"); return "register"; }
	 */

	@RequestMapping(value = "/login-user")
	public String loginuser(@ModelAttribute Player player, HttpServletRequest req) {

		System.out.println(player.getUsername());
		System.out.println(player.getPassword());
		if (playerService.findByUsernameAndPassword(player.getUsername(), player.getPassword()) != null) {
			System.out.println("Yes");

			for (int i = 0; i <= 4; i++) {
				for (int j = 0; j <= 1; j++) {
					if (sesscount[i][j] == null && sesscount[i][j + 1] == null) {
						System.out.println(req.getRequestedSessionId());
						sesscount[i][j] = req.getRequestedSessionId();
						sesscount[i][j + 1] = player.getUsername();
						System.out.println(player.getUsername());
						counts = "added";
						count++;
						break;
					}

				}
				if (counts == "added") {
					counts = "not";
					break;

				}
			}

			return "index";
		} else {
			System.out.println("No");
			return "login";
		}
	}

	@RequestMapping(value = "/playgame")
	public String loginuser(HttpServletRequest req) {

		List<CompanyStocks> stkList = (List<CompanyStocks>) companyService.findstocks();

		if (count == 3 || count > 3) {
			System.out.println("gameboards");
			return "gameboard";
		}

		else if (count == 1) {
			AIPlayerService bobby = new AIPlayerService();
			AIPlayerService alice = new AIPlayerService();

			bobby.setName("bobby");
			alice.setName("alice");

			try {
				// bobby.setCompanyStockList(stkList);
				bobby.AICAL(stkList);
				// alice.setCompanyStockList(stkList);
				alice.AICAL(stkList);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			return "gameboard";
		} else if (count == 2) {
			// create 1 AI
			return "gameboard";
		}

		return "index";
	}
}
