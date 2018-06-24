package stock_simulator.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Transactions")
public class Transactions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String Player_Name;
	private int Game_ID;
	private int Buy_Sell;
	private String Company_Name;
	private	int Stock_Value;
	private	double Stock_Price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlayer_Name() {
		return Player_Name;
	}
	public void setPlayer_Name(String player_Name) {
		Player_Name = player_Name;
	}
	public int getGame_ID() {
		return Game_ID;
	}
	public void setGame_ID(int game_ID) {
		Game_ID = game_ID;
	}
	public int getBuy_Sell() {
		return Buy_Sell;
	}
	public void setBuy_Sell(int buy_Sell) {
		Buy_Sell = buy_Sell;
	}
	public String getCompany_Name() {
		return Company_Name;
	}
	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}
	public int getStock_Value() {
		return Stock_Value;
	}
	public void setStock_Value(int stock_Value) {
		Stock_Value = stock_Value;
	}
	public double getStock_Price() {
		return Stock_Price;
	}
	public void setStock_Price(double stock_Price) {
		Stock_Price = stock_Price;
	}
	
	
}
