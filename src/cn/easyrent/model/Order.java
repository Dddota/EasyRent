package cn.easyrent.model;

import java.io.Serializable;

public class Order implements Serializable {

	private static final long serialVersionUID = -9175468253712945271L;
	private int id;//订单id
	private int hid;//房屋id
	private int uid;//预订人id
	private int status;//订单状态 0为未预订 1为已预订 2为已完成
	public Order() {
		super();
	}
	public Order(int hid, int uid, int status) {
		super();
		this.hid = hid;
		this.uid = uid;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}	
}
