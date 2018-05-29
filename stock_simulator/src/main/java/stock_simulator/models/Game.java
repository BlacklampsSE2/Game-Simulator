package stock_simulator.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "Game")
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Game_ID;
	
	private String Player_Name;
	private int Player_Rank;
	//@Temporal(TemporalType.)
	private Date Timestamp;
	
	public int getGame_ID() {
		return Game_ID;
	}
	public void setGame_ID(int game_ID) {
		Game_ID = game_ID;
	}
	public String getPlayer_Name() {
		return Player_Name;
	}
	public void setPlayer_Name(String player_Name) {
		Player_Name = player_Name;
	}
	public int getPlayer_Rank() {
		return Player_Rank;
	}
	public void setPlayer_Rank(int player_Rank) {
		Player_Rank = player_Rank;
	}
	public String  getTimestamp() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return dateFormat.format(Timestamp);
	}
	public void setTimestamp(Date timestamp) {
		Timestamp = timestamp;
	}
}
