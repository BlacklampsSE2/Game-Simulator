package stock_simulator.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "bank")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String Name;
	private int Acc_Bal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAcc_Bal() {
		return Acc_Bal;
	}

	public void setAcc_Bal(int acc_Bal) {
		Acc_Bal = acc_Bal;
	}

}
