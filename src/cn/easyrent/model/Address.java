package cn.easyrent.model;

public class Address {
	private int id;
	private int cid;
	private int sid;
	private String details;
	
	private StreetAddress street;
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
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public StreetAddress getStreet() {
		return street;
	}
	public void setStreet(StreetAddress street) {
		this.street = street;
	}
}
