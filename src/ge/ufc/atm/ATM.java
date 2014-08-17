package ge.ufc.atm;

public class ATM {
	private Bank bank;
	private float latitude;
	private float longitude;
	private String address;
	private float distance;

	public ATM(Bank bank, float latitude, float longitude, String address, float distance) {
		this.bank = bank;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address = address;
		this.setDistance(distance);
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

}
