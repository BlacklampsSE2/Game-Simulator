package stock_simulator.models;

public class Analyst {

	
	private int[] RT = new int[20];
	private int[] MT = new int[20];
	private int[] ST = new int[20];
	private int[] ET = new int[20];
	private String []Evenets=new String[20]; 
	private int[] FinalArray = new int[20];
	public int[] getRT() {
		return RT;
	}
	public void setRT(int[] rT) {
		RT = rT;
	}
	public int[] getMT() {
		return MT;
	}
	public void setMT(int[] mT) {
		MT = mT;
	}
	public int[] getST() {
		return ST;
	}
	public void setST(int[] sT) {
		ST = sT;
	}
	public int[] getET() {
		return ET;
	}
	public void setET(int[] eT) {
		ET = eT;
	}
	public String[] getEvenets() {
		return Evenets;
	}
	public void setEvenets(String[] evenets) {
		Evenets = evenets;
	}
	public int[] getFinalArray() {
		return FinalArray;
	}
	public void setFinalArray(int[] finalArray) {
		FinalArray = finalArray;
	}

	
	
	
}
