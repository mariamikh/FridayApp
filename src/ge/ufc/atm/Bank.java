package ge.ufc.atm;

public enum Bank {
	TBC("TBC Bank"), VTB("VTB Bank"), CNS("Constanta Bank"), HBG("Halyk Bank");

	private String bank;

	private Bank(String s) {
		bank = s;
	}

	public String getBank() {
		return bank;
	}
}
