package cn.cdu.edu.school.model;

public class Eaddress {

	private String address;
	private String time;
	private String type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Eaddress(String address, String time, String type) {
		super();
		this.address = address;
		this.time = time;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Eaddress [address=" + address + ", time=" + time + ", type=" + type + "]";
	}
	public Eaddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
