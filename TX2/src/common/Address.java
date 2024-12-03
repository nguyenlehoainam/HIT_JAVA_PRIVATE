package common;

public class Address {
	private String street;
	private String city;
	/**
	 * 
	 */
	public Address() {
		super();
	}
	/**
	 * @param street
	 * @param city
	 */
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "street = " + street 
				+ ", city = " + city;
	}
	
	
	

}