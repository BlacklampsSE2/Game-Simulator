package stock_simulator.models;

import java.util.Random;

import stock_simulator.services.CompanyService;

public class CompanyStocks {

private int Comapany_Id;
	
	private String Company_Name;
	private String Sector_Name;
	private double[] Stock_price=new double[20];
	
	private int[] RT = new int[20];
	private int[] MT = new int[20];
	private int[] ST = new int[20];
	private int[] ET = new int[20];
	private String []Evenets=new String[20]; 
	private int[] Final = new int[20];
	public double[]FinalPrice=new double[20];


	public void setFinalPrice(double[] finalPrice) {
		FinalPrice = finalPrice;
	}

	double Sector_length = 0.33;
	double Stock_length = 0.67;
	
	
	
	public int getComapany_Id() {
		return Comapany_Id;
	}
	public void setComapany_Id(int comapany_Id) {
		Comapany_Id = comapany_Id;
	}
	public String getCompany_Name() {
		return Company_Name;
	}
	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}
	public String getSector_Name() {
		return Sector_Name;
	}
	public void setSector_Name(String sector_Name) {
		Sector_Name = sector_Name;
	}

	public double[] getStock_price() {
		return Stock_price;
	}
	public void setStock_price(double[] stock_price) {
		Stock_price = stock_price;
	}
	
	public int[] getRT() {
		return RT;
	}
	public int[] getMT() {
		return MT;
	}
	public int[] getST() {
		return ST;
	}
	public int[] getET() {
		return ET;
	}
	public String[] getEvenets() {
		return Evenets;
	}
	public int[] getFinal() {
		return Final;
	}
	public double[] getFinalPrice() {
		return FinalPrice;
	}
	
	
	private void RandomTrend() {
		Random rand = new Random();
		for (int i = 0; i < RT.length; i++) {
			RT[i] = rand.nextInt(2 + 1 + 2) - 2;
			 System.out.println(RT[i]);
		}

	}
	
	private void SectorTrend() {
		Random prob = new Random();
		Random rand = new Random();

		ST[0] = rand.nextInt(3 + 1 + 3) - 3;

		for (int i = 1; i < (ST.length); i++) {
			for (int r = 1; r <= 100; r++) {
				double z = prob.nextDouble();

				if (0 < z && z < 0.25) {
					// Increases
					if ((ST[i - 1] + 1) >= 3) {
						ST[i] = ST[i - 1];
					} else {
						ST[i] = ST[i - 1] + 1;
					}
				} else if (0.25 < z && z < 0.50) {
					// Decreases
					if ((ST[i - 1] - 1) < -3) {
						ST[i] = ST[i - 1];
					} else {
						ST[i] = ST[i - 1] - 1;
					}
				} else if (0.50 < z && z < 1.0) {
					ST[i] = ST[i - 1];
				}
			}

		}
//		for (int j = 0; j <ST.length; j++) {
//			System.out.println(j+" : "+ST[j]); test
//			
//			
			
//		}
	}
	
	private void MarketTrend() {
		Random prob = new Random();
		Random rand = new Random();

		MT[0] = rand.nextInt(3 + 1 + 3) - 3;

		for (int i = 1; i < (MT.length); i++) {
			for (int r = 1; r <= 100; r++) {
				double z = prob.nextDouble();

				if (0 < z && z < 0.25) {
					// Increases
					if ((MT[i - 1] + 1) >= 3) {
						MT[i] = MT[i - 1];
					} else {
						MT[i] = MT[i - 1] + 1;
					}
				} else if (0.25 < z && z < 0.50) {
					// Decreases
					if ((MT[i - 1] - 1) < -3) {
						MT[i] = MT[i - 1];
					} else {
						MT[i] = MT[i - 1] - 1;
					}
				} else if (0.50 < z && z < 1.0) {
					MT[i] = MT[i - 1];
				}
			}

		}
	}
	
	private void EventTrend() {
		Random rand = new Random();
		for (int i = 0; i < ET.length; i++) {
			;
			int a = rand.nextInt(1 + 1 + 0) + 0;// Number 0-1
			if (a == 1) {
				for (int k = 1; k <= 100; k++) {
					double z = rand.nextDouble();
					if (0 < z && z < Sector_length) {
						// Sector Event

						int turns = rand.nextInt(4) + 2; // 2-5 turns done
						if ((i + turns) < ET.length) {

							int valu = rand.nextInt(1 + 1 + 0) + 0;// setlect BOOM or BUST
							int val2 = 0;
							String Eve;
							if (valu == 0)// BOOM
							{
								val2 = rand.nextInt(5) + 1; // 1-5 val corrected
								Eve = "BOOM";
							} else// BUST
							{
								val2 = rand.nextInt(5) + 1; // 1-5 val corrected
								Eve = "BUST";
							}

							for (int count = 0; count < turns; count++) {
								if (i < ET.length) {
									ET[i] = val2;
									Evenets[i] = Eve;
									i++;
								}
							}

						}
						Sector_length = Sector_length - 1.0; // Sector prob down
					} else if (Sector_length < z && z < 1.0) {
						// Stock Event
						int turns = rand.nextInt(7) + 1;// Number 1-7 corrected
						if ((i + turns) < ET.length) {
							int valu1 = rand.nextInt(1 + 1 + 0) + 0;
							int valu2;
							String Eve;
							if (valu1 == 1) {
								valu2 = rand.nextInt(2) + 2;// Number 2-3 corrected
								Eve = "PROFIT_WARNING";
							} else {
								int value = rand.nextInt(1 + 1 + 0) + 0;
								if (value == 1)// TAKE_OVER
								{
									valu2 = rand.nextInt(-1 + 1 + 5) - 5; // -1 to -5 done
									Eve = "TAKE_OVER";
								} else// SCANDAL
								{
									valu2 = rand.nextInt(-3 + 1 + 6) - 6; // -3 to -6 done
									Eve = "SCANDAL";
								}
							}
							for (int count = 0; count < turns; count++) {
								if (i < ET.length) {
									ET[i] = valu2;
									Evenets[i] = Eve;
									i++;
								}
							}

						}
						Sector_length = Sector_length + 1.0; // Sector prob up (Stock prob down)
					}
				}

			} else {

			}
			// System.out.println(a);
			//trsd
		}

	}
	
	private void CalculateTrends()
	{
		for(int r=0;r<Final.length;r++)
		{
			Final[r]=RT[r]+MT[r]+ST[r]+ET[r];
		}
	}
	
	public void calStkc(Company company)
	{
    	System.out.println("****"+company.getComapany_Id()+"****");
		
		double price;
		RandomTrend();
		MarketTrend();
		SectorTrend();
		EventTrend();
		CalculateTrends();
		
		price=company.getStock_Starting_Price();
		FinalPrice[0]=price+((price*Final[0])/100);
		
		for(int i=1;i<Final.length;i++)
			{
			 FinalPrice[i]=FinalPrice[i-1]+((FinalPrice[i-1]*Final[i])/100);
			 FinalPrice[i] = Math.round(FinalPrice[i] * 100.0) / 100.0;
			
			}
		
	
		
	}

	
}
