package cn.easyrent.model;

public class House {
	private int id;
	private int uid;//房东id
	private int aid;//地址
	private int tid;//type  两室一厅
	private int mid;//model  日付
	private int sid;//status 整租合租
	private String area;//面积
	private String rent;//租金
	private String directionfloor;//朝向
	private String title;//标题
	private String info;//简介
	private String picpath;//文件夹
	
	private User user;
	private Address address;
	private HouseType type;
	private Model model;
	private HouseStatus status;
	
	public House() {
	}

	public House(int id, int uid, int aid, int tid, int mid, int sid,
			String area, String rent, String directionfloor, String title,
			String info, String picpath) {
		this.id = id;
		this.uid = uid;
		this.aid = aid;
		this.tid = tid;
		this.mid = mid;
		this.sid = sid;
		this.area = area;
		this.rent = rent;
		this.directionfloor = directionfloor;
		this.title = title;
		this.info = info;
		this.picpath = picpath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRent() {
		return rent;
	}

	public void setRent(String rent) {
		this.rent = rent;
	}

	public String getDirectionfloor() {
		return directionfloor;
	}

	public void setDirectionfloor(String directionfloor) {
		this.directionfloor = directionfloor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getPicpath() {
		return picpath;
	}

	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public HouseType getType() {
		return type;
	}

	public void setType(HouseType type) {
		this.type = type;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public HouseStatus getStatus() {
		return status;
	}

	public void setStatus(HouseStatus status) {
		this.status = status;
	}
	
}
