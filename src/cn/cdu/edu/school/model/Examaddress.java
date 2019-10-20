package cn.cdu.edu.school.model;



public class Examaddress {

	private int id;
	private String address;
	private String project;
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
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Examaddress [id=" + id + ", address=" + address + ", project=" + project + ", time=" + time + "]";
	}
	public Examaddress(int id, String address, String project, String time) {
		super();
		this.id = id;
		this.address = address;
		this.project = project;
		this.time = time;
	}
	public Examaddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
