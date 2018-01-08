package cn.easyrent.model;

public class StreetAddress {
	private int id;
	private int cid;
	private String housestreet;
	
	private CityAddress cityAddress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getHousestreet() {
		return housestreet;
	}
	public void setHousestreet(String housestreet) {
		this.housestreet = housestreet;
	}
	public CityAddress getCityAddress() {
		return cityAddress;
	}
	public void setCityAddress(CityAddress cityAddress) {
		this.cityAddress = cityAddress;
	}

}
