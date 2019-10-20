package cn.cdu.edu.school.model;

public class Practiceaddress {

	private int id;
	private String address;
	private String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Practiceaddress [id=" + id + ", address=" + address + ", time=" + time + "]";
	}
	public Practiceaddress(int id, String address, String time) {
		super();
		this.id = id;
		this.address = address;
		this.time = time;
	}
	public Practiceaddress() {
		super();
		// TODO Auto-generated constructor stub
	}

}
