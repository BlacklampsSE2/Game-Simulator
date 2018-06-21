package stock_simulator.models;

public class CompanyStocks {

private int Comapany_Id;
	
	private String Company_Name;
	private String Sector_Name;
	private double[] Stock_price=new double[20];
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
	
}
