package stock_simulator.controllers;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import stock_simulator.services.CompanyService;

@Controller
public class AnalystController {
	@Autowired
	private CompanyService companyService;

	int[] RT = new int[20];
	int[] MT = new int[20];
	int[] ST = new int[20];
	int[] ET = new int[20];
	String[] events = new String[20];
	int[] Final = new int[20];
	int length = 20;

	public void getArrays() {
		this.RT = companyService.RandomTrend();
		this.MT = companyService.MarketTrend();
		this.ST = companyService.SectorTrend();
		this.ET = companyService.EventTrend();
		this.events = companyService.GetEventsDetails();
		this.Final = companyService.CalculateTrends();
	}

	@RequestMapping("/sseTest")
	public SseEmitter handleRequest() {

		getArrays();
		final SseEmitter emitter = new SseEmitter();
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(() -> {
			for (int turn = 0; turn < this.length; turn++) {
				try {
					// Stock
					if (turn == 19) {
						break;
					}
					if (ST[turn] > ST[turn + 1]) {
						emitter.send("In the next turn the sector trend can rise up for :" + ST[turn] + " " + turn);

					}
					if (MT[turn] > MT[turn + 1]) {
						emitter.send("In the next turn the Market trend can rise up for :" + MT[turn] + " " + turn);

					}
					if (RT[turn] > RT[turn + 1]) {
						emitter.send("In the next turn the Random trend can rise up for :" + RT[turn] + " " + turn);

					}

					if (ST[turn] == ST[turn + 1]) {

						emitter.send("Sometimes in the next turn sector trend might not increase for " + ST[turn] + " "+ turn);
					}
					if (MT[turn] == MT[turn + 1]) {

						emitter.send("Sometimes in the next turn Market trend might not increase for " + MT[turn] + " "+ turn);
					}
					if (RT[turn] == RT[turn + 1]) {

						emitter.send("Sometimes in the next turn Random trend might not increase for " + RT[turn] + " "+ turn);
					}

					if (ST[turn] < ST[turn + 1]) {

						emitter.send("In the next turn sector trend might go down for" + ST[turn] + " "+ turn);

					}
					if (MT[turn] < MT[turn + 1]) {

						emitter.send("In the next turn Market trend might go down for" + MT[turn] + " "+ turn);

					}
					if (RT[turn] < RT[turn + 1]) {

						emitter.send("In the next turn Random trend might go down for" +  RT[turn] + " "+ turn);
					}
					
					
					if (ET[turn] == 0) {

						System.out.println("events might not occur in next turn for" + ET[turn]);

					}

					else if (ET[turn] != 0) {

						if (events[turn].equals("BOOM")) {

							emitter.send("Sometimes a BOOM event can occur for " + ET[turn]);

						} else if (events[turn].equals("BURST")) {

							emitter.send("A BURST event might occur for " + ET[turn]);

						} else if (events[turn].equals("PROFIT_WARNING")) {

							emitter.send("A PROFIT_WARNING might happen in the next to come turns for " + ET[turn]);

						} else if (events[turn].equals("TAKE_OVER")) {

							emitter.send("TAKE_OVER can happen in the next turns for " + ET[turn]);

						} else if (events[turn].equals("SCANDAL")) {

							emitter.send("A SCANDAL might occur for " + ET[turn]);
						}

					}
					

					if (Final[turn] > Final[turn + 1]) {

						emitter.send("The Stock price might rise in the future for ");

					}
					if (Final[turn] < Final[turn + 1]) {

						emitter.send("The stock price might take an dive for ");

					}
					if (Final[turn] == Final[turn + 1]) {

						emitter.send("The stock price might not change in the future for ");
					}
					
					
					

					Thread.sleep(2000);
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					emitter.completeWithError(e);
					return;
				}
				System.out.println("----" + turn + "----");

			}

			emitter.complete();
		});

		return emitter;
	}
	@GetMapping("/Test")
	public String Test() {
		
		return "index";
	}

}
