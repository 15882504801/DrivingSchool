package cn.cdu.edu.school.model;

public class Coach {
	private int id;
	private String name;
	private String sex;
	private int age;
	private String tel;
	private String address;
	private String password;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", tel=" + tel + ", address="
				+ address + ", password=" + password + ", type=" + type + "]";
	}
	public Coach(int id, String name, String sex, int age, String tel, String address, String password, String type) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.address = address;
		this.password = password;
		this.type = type;
	}
	public Coach() {
		super();
	}

	
}
