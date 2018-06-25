package stock_simulator.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import stock_simulator.models.CompanyStocks;


public class AIPlayerService {
	

	
	private String name;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	CompanyStocks comp0 = new CompanyStocks();
	CompanyStocks comp1 = new CompanyStocks();
	CompanyStocks comp2 = new CompanyStocks();
	CompanyStocks comp3 = new CompanyStocks();
	CompanyStocks comp4 = new CompanyStocks();
	CompanyStocks comp5 = new CompanyStocks();
	CompanyStocks comp6 = new CompanyStocks();
	CompanyStocks comp7 = new CompanyStocks();
	CompanyStocks comp8 = new CompanyStocks();
	CompanyStocks comp9 = new CompanyStocks();
	
	
	private double [] Final0 = comp0.getStock_price();  //IBM
	private double [] Final1 = comp1.getStock_price();	//google	
	private double [] Final2 = comp2.getStock_price();	//toyota
	private double [] Final3 = comp3.getStock_price();	//nissan
	private double [] Final4 = comp4.getStock_price();	//mitsubishi
	private double [] Final5 = comp5.getStock_price();	//amazon
	private double [] Final6 = comp6.getStock_price();	//ebay
	private double [] Final7 = comp7.getStock_price();	//twitter
	private double [] Final8 = comp8.getStock_price();	//facebook
	private double [] Final9 = comp9.getStock_price();	//hnb
	
	
	int temp=0;
	int sellqty=0;
	int [] company = new int [10];	
	double cashbal=0;
	int quantity;
	
		public void AICAL() throws InterruptedException {
		Random winloss = new Random();
		int wl = winloss.nextInt(1 + 1 + 0) + 0;
		int time = 200;
		
		if (wl == 1)// win AI
		{
			Random buysell = new Random();
			for (int i = 0; i <= 19; i++) {
				int bs = buysell.nextInt(1 + 1 + 0) + 0;
				if (bs == 1)// buy
				{

					// final0
					if (Final0[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[0] = company[0] + quantity;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final0[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final1
					else if (Final1[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final1[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final1[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final1[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final2
					else if (Final2[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final2[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final2[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final2[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final3
					else if (Final3[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final3[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final3[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final3[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final4
					else if (Final4[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final4[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final4[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final4[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final5
					else if (Final5[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final5[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final5[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final5[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final6
					else if (Final6[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final6[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final6[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final6[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final7
					else if (Final7[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final7[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final7[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final7[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final8
					else if (Final8[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final8[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final8[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final8[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final9
					else if (Final9[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final9[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final9[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final9[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}
				} else if (bs == 0) {

					// final0
					if (Final0[i] > Final1[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}

					} else if (Final0[i] > Final2[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final3[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final4[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final5[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final6[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final7[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final8[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final9[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}
					}
					// final1
					else if (Final1[i] > Final0[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}

					} else if (Final1[i] > Final2[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final3[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final4[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final5[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final6[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final7[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final8[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final9[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					}
					// final2
					else if (Final2[i] > Final0[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}

					} else if (Final2[i] > Final1[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final3[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final4[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final5[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final6[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final7[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final8[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final9[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					}
					// final3
					else if (Final3[i] > Final0[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}

					} else if (Final3[i] > Final1[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final2[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final4[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final5[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final6[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final7[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final8[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final9[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					}
					// final4
					else if (Final4[i] > Final0[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}

					} else if (Final4[i] > Final1[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final2[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final3[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final5[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final6[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final7[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final8[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final9[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					}
					// final5

					else if (Final5[i] > Final0[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}

					} else if (Final5[i] > Final1[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final2[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final3[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final4[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final6[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final7[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final8[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final9[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					}
					// final6
					else if (Final6[i] > Final0[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}

					} else if (Final6[i] > Final1[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final2[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final3[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final4[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final5[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final7[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final8[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final9[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					}
					// final7
					else if (Final7[i] > Final0[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}

					} else if (Final7[i] > Final1[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final2[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final3[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final4[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final5[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final6[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final8[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final9[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					}
					// final8
					else if (Final8[i] > Final0[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}

					} else if (Final8[i] > Final1[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final2[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final3[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final4[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final5[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final6[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final7[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final9[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					}
					// final9
					else if (Final9[i] > Final0[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}

					} else if (Final9[i] > Final1[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final2[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final3[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final4[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final5[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final6[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final7[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final8[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					}
				}
			}
		} else if (wl == 0)// loss AI)
		{
			

			
			

			Random buysell = new Random();
			for (int i = 0; i <= 19; i++) {
				int bs = buysell.nextInt(1 + 1 + 0) + 0;
				if (bs == 1)// buy
				{

					// final0
					if (Final0[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final0[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final1
					else if (Final1[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final1[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final1[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final1[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[1] = company[1] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final2
					else if (Final2[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final2[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final2[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final2[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[2] = company[2] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final3
					else if (Final3[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final3[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final3[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[3] = company[3] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final3[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[0] = company[0] + quantity;;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final4
					else if (Final4[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final4[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final4[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final4[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[4] = company[4] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final5
					else if (Final5[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final5[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final5[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final5[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[5] = company[5] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final6
					else if (Final6[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);			
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final6[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final6[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final6[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[6] = company[6] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final7
					else if (Final7[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final7[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final7[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final7[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[7] = company[7] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final8
					else if (Final8[i] > Final0[i]) 
					{
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal)
						{
							company[8] = company[8] + quantity;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} 
					else if (Final8[i] > Final1[i])
					{
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) 
						{
							company[8] = company[8] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} 
					else if (Final8[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final8[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final8[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final8[i] > Final9[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final9[i] <= cashbal) {
							company[8] = company[8] + quantity;
							System.out.println("BUY Final9");
							cashbal = cashbal - (Final9[i] * quantity);
							Thread.sleep(time);
						}
					}
					// final9
					else if (Final9[i] > Final0[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final0[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final0");
							cashbal = cashbal - (Final0[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final1[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final1[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final1");
							cashbal = cashbal - (Final1[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final2[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final2[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final2");
							cashbal = cashbal - (Final2[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final3[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final3[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final3");
							cashbal = cashbal - (Final3[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final4[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final4[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final4");
							cashbal = cashbal - (Final4[i] * quantity);
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final5[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final5[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final5");
							cashbal = cashbal - (Final5[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final9[i] > Final6[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final6[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final6");
							cashbal = cashbal - (Final6[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final9[i] > Final7[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final7[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final7");
							cashbal = cashbal - (Final7[i] * quantity);
							Thread.sleep(time);
						}
					}

					else if (Final9[i] > Final8[i]) {
						Random amount = new Random();
						quantity = amount.nextInt(100) + 1;
						if (quantity * Final8[i] <= cashbal) {
							company[9] = company[9] + quantity;
							System.out.println("BUY Final8");
							cashbal = cashbal - (Final8[i] * quantity);
							Thread.sleep(time);
						}
					}
				} 
				
				
				else if (bs == 0)//sell {

					// final0
					if (Final0[i] > Final1[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}

					} else if (Final0[i] > Final2[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final3[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final4[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final5[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final6[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final7[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final8[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final0[i] > Final9[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					}
					// final1
					else if (Final1[i] > Final0[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}

					} else if (Final1[i] > Final2[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final3[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final4[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final5[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final6[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final7[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final8[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final1[i] > Final9[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					}
					// final2
					else if (Final2[i] > Final0[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");						
							Thread.sleep(time);
						}

					} else if (Final2[i] > Final1[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final3[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final4[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final5[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final6[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final7[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final8[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final2[i] > Final9[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					}
					// final3
					else if (Final3[i] > Final0[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}

					} else if (Final3[i] > Final1[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final2[i]) {
						if (company[2] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final4[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final5[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final6[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final7[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final8[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final3[i] > Final9[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					}
					// final4
					else if (Final4[i] > Final0[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}

					} else if (Final4[i] > Final1[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final2[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final3[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final5[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final6[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final7[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final8[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final4[i] > Final9[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					}
					// final5

					else if (Final5[i] > Final0[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}

					} else if (Final5[i] > Final1[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final2[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final3[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final4[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final6[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final7[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final8[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final5[i] > Final9[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					}
					// final6
					else if (Final6[i] > Final0[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}

					} else if (Final6[i] > Final1[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final2[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
						
					} else if (Final6[i] > Final3[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final4[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final5[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final7[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final8[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final6[i] > Final9[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					}
					// final7
					else if (Final7[i] > Final0[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}

					} else if (Final7[i] > Final1[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final2[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final3[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final4[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final5[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final6[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final8[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					} else if (Final7[i] > Final9[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					}
					// final8
					else if (Final8[i] > Final0[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}

					} else if (Final8[i] > Final1[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final2[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final3[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final4[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final5[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final6[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final7[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final8[i] > Final9[i]) {
						if (company[9] != 0) {
							temp = company[9];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[9] = company[9] - sellqty;
							cashbal = cashbal + (Final9[i] * sellqty);
							System.out.println("SELL Final9");
							Thread.sleep(time);
						}
					}
					// final9
					else if (Final9[i] > Final0[i]) {
						if (company[0] != 0) {
							temp = company[0];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[0] = company[0] - sellqty;
							cashbal = cashbal + (Final0[i] * sellqty);
							System.out.println("SELL Final0");
							Thread.sleep(time);
						}

					} else if (Final9[i] > Final1[i]) {
						if (company[1] != 0) {
							temp = company[1];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[1] = company[1] - sellqty;
							cashbal = cashbal + (Final1[i] * sellqty);
							System.out.println("SELL Final1");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final2[i]) {
						if (company[2] != 0) {
							temp = company[2];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[2] = company[2] - sellqty;
							cashbal = cashbal + (Final2[i] * sellqty);
							System.out.println("SELL Final2");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final3[i]) {
						if (company[3] != 0) {
							temp = company[3];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[3] = company[3] - sellqty;
							cashbal = cashbal + (Final3[i] * sellqty);
							System.out.println("SELL Final3");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final4[i]) {
						if (company[4] != 0) {
							temp = company[4];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[4] = company[4] - sellqty;
							cashbal = cashbal + (Final4[i] * sellqty);
							System.out.println("SELL Final4");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final5[i]) {
						if (company[5] != 0) {
							temp = company[5];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[5] = company[5] - sellqty;
							cashbal = cashbal + (Final5[i] * sellqty);
							System.out.println("SELL Final5");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final6[i]) {
						if (company[6] != 0) {
							temp = company[6];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[6] = company[6] - sellqty;
							cashbal = cashbal + (Final6[i] * sellqty);
							System.out.println("SELL Final6");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final7[i]) {
						if (company[7] != 0) {
							temp = company[7];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[7] = company[7] - sellqty;
							cashbal = cashbal + (Final7[i] * sellqty);
							System.out.println("SELL Final7");
							Thread.sleep(time);
						}
					} else if (Final9[i] > Final8[i]) {
						if (company[8] != 0) {
							temp = company[8];
							Random selling = new Random();
							sellqty = selling.nextInt(temp) + 1;
							company[8] = company[8] - sellqty;
							cashbal = cashbal + (Final8[i] * sellqty);
							System.out.println("SELL Final8");
							Thread.sleep(time);
						}
					}

				}
			
		}

	}
	
}
		
		



