package stock_simulator.controllers;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import stock_simulator.models.CompanyStocks;
import stock_simulator.services.CompanyService;

@Controller
public class AnalystController {

	@Autowired
	CompanyService companyService = new CompanyService();

	int turn = 20;

	private double[] Final0;
	private double[] Final1;
	private double[] Final2;
	private double[] Final3;
	private double[] Final4;
	private double[] Final5;
	private double[] Final6;
	private double[] Final7;
	private double[] Final8;
	private double[] Final9;

	public void getArrays() {

		Collection<CompanyStocks> stocks = companyService.findstocks();
		
		for (CompanyStocks companyStocks : stocks) {
			if (companyStocks.getCompany_Name().equals("HNB")) {
				Final0 = companyStocks.getFinalPrice();
			}
			if (companyStocks.getCompany_Name().equals("IBM")) {
				Final1 = companyStocks.getFinalPrice();
			}
			if (companyStocks.getCompany_Name().equals("Google")) {
				Final2 = companyStocks.getFinalPrice();
			}
			if (companyStocks.getCompany_Name().equals("Amazon")) {
				Final3 = companyStocks.getFinalPrice();
			}
			if (companyStocks.getCompany_Name().equals("Toyota")) {
				Final4 = companyStocks.getFinalPrice();
			}
			if (companyStocks.getCompany_Name().equals("ebay")) {
				Final5 = companyStocks.getFinalPrice();
			}
			if (companyStocks.getCompany_Name().equals("Nissan")) {
				Final6 = companyStocks.getFinalPrice();
			}
			if (companyStocks.getCompany_Name().equals("Twitter")) {
				Final7 = companyStocks.getFinalPrice();
			}
			if (companyStocks.getCompany_Name().equals("Mitsubishi")) {
				Final8 = companyStocks.getFinalPrice();
			}
			if (companyStocks.getCompany_Name().equals("Facebook")) {
				Final9 = companyStocks.getFinalPrice();
			}
		}
		
		
	}

	@RequestMapping("/Rumours")
	public SseEmitter handlerumours() {

		getArrays();
		final SseEmitter emitter = new SseEmitter();
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(() -> {
			for (int i = 0; i <= 19; i++) {
				try {
					if (i == 19) {
						break;
					}
					// Company HNB
					if (Final0[i] < Final0[i + 1]) {
						emitter.send("Stock price of HNB can increased ");
					} else if (Final0[i] > Final0[i + 1]) {
						emitter.send("Stock price of HNB can increased ");
					} else if (Final0[i] == Final0[i + 1]) {
						emitter.send("Stock price of HNB can increased ");
					}

					// Company IBM
					if (Final1[i] < Final1[i + 1]) {
						emitter.send("Stock price of IBM can increased ");
					} else if (Final1[i] > Final1[i + 1]) {
						emitter.send("Stock price of IBM can increased ");
					} else if (Final1[i] == Final1[i + 1]) {
						emitter.send("Stock price of IBM can increased ");
					}

					// Company Google
					if (Final2[i] < Final2[i + 1]) {
						emitter.send("Stock price of Google can increased ");
					} else if (Final2[i] > Final2[i + 1]) {
						emitter.send("Stock price of Google can increased ");
					} else if (Final2[i] == Final2[i + 1]) {
						emitter.send("Stock price of Google can increased ");
					}

					// Company amazon
					if (Final3[i] < Final3[i + 1]) {
						emitter.send("Stock price of amazon can increased ");
					} else if (Final3[i] > Final3[i + 1]) {
						emitter.send("Stock price of amazon can increased ");
					} else if (Final3[i] == Final3[i + 1]) {
						emitter.send("Stock price of amazon can increased ");
					}

					// Company toyota
					if (Final4[i] < Final4[i + 1]) {
						emitter.send("Stock price of toyota can increased ");
					} else if (Final4[i] > Final4[i + 1]) {
						emitter.send("Stock price of toyota can increased ");
					} else if (Final4[i] == Final4[i + 1]) {
						emitter.send("Stock price of toyota can increased ");
					}

					// Company ebay
					if (Final5[i] < Final5[i + 1]) {
						emitter.send("Stock price of ebay can increased ");
					} else if (Final5[i] > Final5[i + 1]) {
						emitter.send("Stock price of ebay can increased ");
					} else if (Final5[i] == Final5[i + 1]) {
						emitter.send("Stock price of ebay can increased ");
					}

					// Company nissan
					if (Final6[i] < Final6[i + 1]) {
						emitter.send("Stock price of nissan can increased ");
					} else if (Final6[i] > Final6[i + 1]) {
						emitter.send("Stock price of nissan can increased ");
					} else if (Final6[i] == Final6[i + 1]) {
						emitter.send("Stock price of nissan can increased ");
					}

					// Company twitter
					if (Final7[i] < Final7[i + 1]) {
						emitter.send("Stock price of twitter can increased ");
					} else if (Final7[i] > Final7[i + 1]) {
						emitter.send("Stock price of twitter can increased ");
					} else if (Final7[i] == Final7[i + 1]) {
						emitter.send("Stock price of twitter can increased ");
					}

					// Company mitsubishi
					if (Final8[i] < Final8[i + 1]) {
						emitter.send("Stock price of mitsubishi can increased ");
					} else if (Final8[i] > Final8[i + 1]) {
						emitter.send("Stock price of mitsubishi can increased ");
					} else if (Final8[i] == Final8[i + 1]) {
						emitter.send("Stock price of mitsubishi can increased ");
					}

					// Company facebook
					if (Final9[i] < Final9[i + 1]) {
						emitter.send("Stock price of facebook can increased ");
					} else if (Final9[i] > Final9[i + 1]) {
						emitter.send("Stock price of facebook can increased ");
					} else if (Final9[i] == Final9[i + 1]) {
						emitter.send("Stock price of facebook can increased ");
					}

					Thread.sleep(20000);
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					emitter.completeWithError(e);
					break;
					// return;
				}
			}

			emitter.complete();
		});

		return emitter;
	}

	@GetMapping("/all")
	public String Test() {

		return "gameboard";
	}

	@RequestMapping("/Newsfeed")
	public SseEmitter handlenewsfeeds() {
		int time = 20000;
		final SseEmitter emitter = new SseEmitter();
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(() -> {
			for (int i = 0; i <= 19; i++) {
				try {
					if (i == 19) {
						break;
					}
					// Company HNB
					if (Final0[i] < Final0[i + 1]) {
						emitter.send("Stock price of HNB has increased ");
					} else if (Final0[i] > Final0[i + 1]) {
						emitter.send("Stock price of HNB has increased ");
					} else if (Final0[i] == Final0[i + 1]) {
						emitter.send("Stock price of HNB has increased ");
					}

					// Company IBM
					if (Final1[i] < Final1[i + 1]) {
						emitter.send("Stock price of IBM has increased ");
					} else if (Final1[i] > Final1[i + 1]) {
						emitter.send("Stock price of IBM has increased ");
					} else if (Final1[i] == Final1[i + 1]) {
						emitter.send("Stock price of IBM has increased ");
					}

					// Company Google
					if (Final2[i] < Final2[i + 1]) {
						emitter.send("Stock price of Google has increased ");
					} else if (Final2[i] > Final2[i + 1]) {
						emitter.send("Stock price of Google has increased ");
					} else if (Final2[i] == Final2[i + 1]) {
						emitter.send("Stock price of Google has increased ");
					}

					// Company amazon
					if (Final3[i] < Final3[i + 1]) {
						emitter.send("Stock price of amazon has increased ");
					} else if (Final3[i] > Final3[i + 1]) {
						emitter.send("Stock price of amazon has increased ");
					} else if (Final3[i] == Final3[i + 1]) {
						emitter.send("Stock price of amazon has increased ");
					}

					// Company toyota
					if (Final4[i] < Final4[i + 1]) {
						emitter.send("Stock price of toyota has increased ");
					} else if (Final4[i] > Final4[i + 1]) {
						emitter.send("Stock price of toyota has increased ");
					} else if (Final4[i] == Final4[i + 1]) {
						emitter.send("Stock price of toyota has increased ");
					}

					// Company ebay
					if (Final5[i] < Final5[i + 1]) {
						emitter.send("Stock price of ebay has increased ");
					} else if (Final5[i] > Final5[i + 1]) {
						emitter.send("Stock price of ebay has increased ");
					} else if (Final5[i] == Final5[i + 1]) {
						emitter.send("Stock price of ebay has increased ");
					}

					// Company nissan
					if (Final6[i] < Final6[i + 1]) {
						emitter.send("Stock price of nissan has increased ");
					} else if (Final6[i] > Final6[i + 1]) {
						emitter.send("Stock price of nissan has increased ");
					} else if (Final6[i] == Final6[i + 1]) {
						emitter.send("Stock price of nissan has increased ");
					}

					// Company twitter
					if (Final7[i] < Final7[i + 1]) {
						emitter.send("Stock price of twitter has increased ");
					} else if (Final7[i] > Final7[i + 1]) {
						emitter.send("Stock price of twitter has increased ");
					} else if (Final7[i] == Final7[i + 1]) {
						emitter.send("Stock price of twitter has increased ");
					}

					// Company mitsubishi
					if (Final8[i] < Final8[i + 1]) {
						emitter.send("Stock price of mitsubishi has increased ");
					} else if (Final8[i] > Final8[i + 1]) {
						emitter.send("Stock price of mitsubishi has increased ");
					} else if (Final8[i] == Final8[i + 1]) {
						emitter.send("Stock price of mitsubishi has increased ");
					}

					// Company facebook
					if (Final9[i] < Final9[i + 1]) {
						emitter.send("Stock price of facebook has increased ");
					} else if (Final9[i] > Final9[i + 1]) {
						emitter.send("Stock price of facebook has increased ");
					} else if (Final9[i] == Final9[i + 1]) {
						emitter.send("Stock price of facebook has increased ");
					}

					Thread.sleep(20000);
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					emitter.completeWithError(e);
					return;
				}
			}

		});

		return emitter;
	}

	/*
	 * @RequestMapping("/trtest") public void test() { getArrays(); for (int i = 0;
	 * i < RT.length; i++) { System.out.println(RT[i]); }
	 * System.out.println("---------------------"); }
	 */

}
