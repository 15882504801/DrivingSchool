package cn.cdu.edu.school.model;

public class Student {
	private int id;

	public static final int PAGE_SIZE = 5;
	private String name;
	private String sex;
	private int age;
	private String tel;
	private String address;
	private String password;
	private String type;
	private int vip;
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
	public int getVip() {
		return vip;
	}
	public void setVip(int vip) {
		this.vip = vip;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", tel=" + tel + ", address="
				+ address + ", password=" + password + ", type=" + type + ", vip=" + vip + "]";
	}
	public Student(int id, String name, String sex, int age, String tel, String address, String password, String type,
			int vip) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.address = address;
		this.password = password;
		this.type = type;
		this.vip = vip;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
