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
	int length = 200;
	
	
	
//
//	public AnalystController(CompanyService companyService) {
//		System.out.println("companyService creatted");
//		this.companyService = companyService;
//	}

	public void getArrays() {
		this.RT = companyService.getRT();
		this.MT = companyService.getMT();
		this.ST = companyService.getST();
		this.ET = companyService.getET();
		this.events = companyService.getEvenets();
		this.Final = companyService.getFinal();
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

						emitter.send("Sometimes in the next turn sector trend might not increase for " + ST[turn] + " "
								+ turn);
					}
					if (MT[turn] == MT[turn + 1]) {

						emitter.send("Sometimes in the next turn Market trend might not increase for " + MT[turn] + " "
								+ turn);
					}
					if (RT[turn] == RT[turn + 1]) {

						emitter.send("Sometimes in the next turn Random trend might not increase for " + RT[turn] + " "
								+ turn);
					}

					if (ST[turn] < ST[turn + 1]) {

						emitter.send("In the next turn sector trend might go down for" + ST[turn] + " " + turn);

					}
					if (MT[turn] < MT[turn + 1]) {

						emitter.send("In the next turn Market trend might go down for" + MT[turn] + " " + turn);

					}
					if (RT[turn] < RT[turn + 1]) {

						emitter.send("In the next turn Random trend might go down for" + RT[turn] + " " + turn);
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

					Thread.sleep(200);
				} catch (IOException | InterruptedException  e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				    emitter.completeWithError(e);
				    break;
				//	return;
				}
				System.out.println("----" + turn + "----");

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
	public SseEmitter handlenewsfeeds()  {
		int time=2000;
		final SseEmitter emitter = new SseEmitter();
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(() -> {
			for (int turn = 0; turn < this.length; turn++) {
				try {						
					       if (turn == 0)
									{
										Thread.sleep(time);
										continue;
								
									}
							
								if (ST[turn] > ST[turn - 1])
									{
										emitter.send("Sector trend has increased");
									
										if (MT[turn] > MT[turn - 1]) 
											{
												emitter.send("Market trend has increased");	
												if (RT[turn] > RT[turn - 1])
													{
														emitter.send("Random trend has increased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												if (RT[turn] < RT[turn - 1]) 
													{
														emitter.send("Random trend has decreased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
													
												if (RT[turn] == RT[turn - 1])
													{
														emitter.send("Random trend has not changed");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
											} 

										if (MT[turn] < MT[turn - 1]) 
											{
												emitter.send("Market trend has decreased");
												if (RT[turn] > RT[turn - 1])
													{
														emitter.send("Random trend has increased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												if (RT[turn] < RT[turn - 1]) 
													{
														emitter.send("Random trend has decreased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
													
												if (RT[turn] == RT[turn - 1])
													{
														emitter.send("Random trend has not changed");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
											}
								
										if (MT[turn] == MT[turn - 1])
											{
												emitter.send("Market trend has not changed");
												if (RT[turn] > RT[turn - 1])
													{
														emitter.send("Random trend has increased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												if (RT[turn] < RT[turn - 1]) 
													{
														emitter.send("Random trend has decreased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
													
												if (RT[turn] == RT[turn - 1])
													{
														emitter.send("Random trend has not changed");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												
											}
								}
							  
								
								if (ST[turn] < ST[turn - 1])
									{
										emitter.send("Sector trend has increased");
									
										if (MT[turn] > MT[turn - 1]) 
											{
												emitter.send("Market trend has increased");	
												if (RT[turn] > RT[turn - 1])
													{
														emitter.send("Random trend has increased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												if (RT[turn] < RT[turn - 1]) 
													{
														emitter.send("Random trend has decreased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
													
												if (RT[turn] == RT[turn - 1])
													{
														emitter.send("Random trend has not changed");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
											} 

										if (MT[turn] < MT[turn - 1]) 
											{
												emitter.send("Market trend has decreased");
												if (RT[turn] > RT[turn - 1])
													{
														emitter.send("Random trend has increased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												if (RT[turn] < RT[turn - 1]) 
													{
														emitter.send("Random trend has decreased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
													
												if (RT[turn] == RT[turn - 1])
													{
														emitter.send("Random trend has not changed");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
											}
								
										if (MT[turn] == MT[turn - 1])
											{
												emitter.send("Market trend has not changed");
												if (RT[turn] > RT[turn - 1])
													{
														emitter.send("Random trend has increased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												if (RT[turn] < RT[turn - 1]) 
													{
														emitter.send("Random trend has decreased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
													
												if (RT[turn] == RT[turn - 1])
													{
														emitter.send("Random trend has not changed");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												
											}
								}if (ST[turn] == ST[turn - 1])
									{
										emitter.send("Sector trend has increased");
									
										if (MT[turn] > MT[turn - 1]) 
											{
												emitter.send("Market trend has increased");	
												if (RT[turn] > RT[turn - 1])
													{
														emitter.send("Random trend has increased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												if (RT[turn] < RT[turn - 1]) 
													{
														emitter.send("Random trend has decreased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
													
												if (RT[turn] == RT[turn - 1])
													{
														emitter.send("Random trend has not changed");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
											} 

										if (MT[turn] < MT[turn - 1]) 
											{
												emitter.send("Market trend has decreased");
												if (RT[turn] > RT[turn - 1])
													{
														emitter.send("Random trend has increased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												if (RT[turn] < RT[turn - 1]) 
													{
														emitter.send("Random trend has decreased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
													
												if (RT[turn] == RT[turn - 1])
													{
														emitter.send("Random trend has not changed");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
											}
								
										if (MT[turn] == MT[turn - 1])
											{
												emitter.send("Market trend has not changed");
												if (RT[turn] > RT[turn - 1])
													{
														emitter.send("Random trend has increased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												if (RT[turn] < RT[turn - 1]) 
													{
														emitter.send("Random trend has decreased ");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
													
												if (RT[turn] == RT[turn - 1])
													{
														emitter.send("Random trend has not changed");
														if(Final[turn]>Final[turn-1])
															{
																emitter.send("Stock price has increased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
															
														if(Final[turn]<Final[turn-1])
															{
																emitter.send("Stock price has decreased ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}	
														if(Final[turn]==Final[turn-1])
															{
																emitter.send("Stock price has no change ");
																if (ET[turn] == 0) 
																	{
																		Thread.sleep(time);
																	}

																else  
																	{
																		if (events[turn].equals("BOOM")) 
																			{
																				emitter.send("BOOM event is occuring");
																				Thread.sleep(time);					
																			}
																		else if (events[turn].equals("BURST")) 
																			{
																				emitter.send("BURST event is occuring");
																				Thread.sleep(time);
																			}
																		else if (events[turn].equals("PROFIT_WARNING")) 
																			{
																				emitter.send("PROFIT_WARNING event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("TAKE_OVER")) 
																			{
																				emitter.send("TAKE_OVER event is occuring");
																				Thread.sleep(time);
																			} 
																		else if (events[turn].equals("SCANDAL"))
																			{
																				emitter.send("SCANDAL event is occuring");
																				Thread.sleep(time);
																			}
																	}
															}
													}
												
											}
								}
					
				}
				catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					emitter.completeWithError(e);
					return;
				}
			}	
			
		});
		
		
	
		return emitter;
	}

   
	@RequestMapping("/trtest")
	public void test()
    {
		getArrays();
		for(int i=0;i<RT.length;i++)
		{
			System.out.println(RT[i]);
		}
		System.out.println("---------------------");
    }


}


