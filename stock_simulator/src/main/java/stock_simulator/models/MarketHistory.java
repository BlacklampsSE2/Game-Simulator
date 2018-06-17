package stock_simulator.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "comp_stock_details")
public class MarketHistory {

	private Company company;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int compId;

	private String compName;
	private String sectName;
	private double stockSTPrice;
	private double stockFNPrice;
	private int gameId;
	private Timestamp timeStamp;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getSectName() {
		return sectName;
	}

	public void setSectName(String sectName) {
		this.sectName = sectName;
	}

	public double getStockSTPrice() {
		return stockSTPrice;
	}

	public void setStockSTPrice(int stockSTPrice) {
		this.stockSTPrice = stockSTPrice;
	}

}
