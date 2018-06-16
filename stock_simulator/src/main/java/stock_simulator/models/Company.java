package stock_simulator.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Comapany_Id;
	
	private String Company_Name;
	private String Sector_Name;
	private double Stock_Starting_Price;
	
	
	
	
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
	public double getStock_Starting_Price() {
		return Stock_Starting_Price;
	}
	public void setStock_Starting_Price(double stock_Starting_Price) {
		Stock_Starting_Price = stock_Starting_Price;
	}

}
