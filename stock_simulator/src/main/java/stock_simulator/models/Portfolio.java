package stock_simulator.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "player_transactions")
public class Portfolio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int playerID;

	private int gameID;
	private int BuySell;
	private String companyName;
	private int stockVal;
	private float stockPrice;

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}

	public int getBuySell() {
		return BuySell;
	}

	public void setBuySell(int buySell) {
		BuySell = buySell;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getStockVal() {
		return stockVal;
	}

	public void setStockVal(int stockVal) {
		this.stockVal = stockVal;
	}

	public float getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(float stockPrice) {
		this.stockPrice = stockPrice;
	}

}
