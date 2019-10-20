package cn.cdu.edu.school.model;

public class Paddress {

	private String address;
	private String time;
	public Paddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paddress(String address, String time) {
		super();
		this.address = address;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Paddress [address=" + address + ", time=" + time + "]";
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
}
