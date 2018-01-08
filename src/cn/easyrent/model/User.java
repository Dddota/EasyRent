package cn.easyrent.model;

public class User {
	private int id;
	private String userName;
	private String loginName;
	private String password;
	private String email;
	private String telephone;
	private String idcard;
	private int qid;
	private String picpath;
	private String answer;
	private int sex;
	public User(String userName, String loginName, String password,
			String email, String telephone, String idcard, int qid,
			String picpath, String answer, int sex) {
		super();
		this.userName = userName;
		this.loginName = loginName;
		this.password = password;
		this.email = email;
		this.telephone = telephone;
		this.idcard = idcard;
		this.qid = qid;
		this.picpath = picpath;
		this.answer = answer;
		this.sex = sex;
	}
	public User() {
		super();
	}
	public User(String loginName, String password) {
		super();
		this.loginName = loginName;
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getPicpath() {
		return picpath;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}
}
