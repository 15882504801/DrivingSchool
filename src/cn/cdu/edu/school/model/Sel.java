package cn.cdu.edu.school.model;

import java.util.Date;

public class Sel {
 
	private int studentid;
	private int coachid;
	private Date seldate;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getCoachid() {
		return coachid;
	}
	public void setCoachid(int coachid) {
		this.coachid = coachid;
	}
	public Date getSeldate() {
		return seldate;
	}
	public void setSeldate(Date seldate) {
		this.seldate = seldate;
	}
	@Override
	public String toString() {
		return "Sel [studentid=" + studentid + ", coachid=" + coachid + ", seldate=" + seldate + "]";
	}
	public Sel(int studentid, int coachid, Date seldate) {
		super();
		this.studentid = studentid;
		this.coachid = coachid;
		this.seldate = seldate;
	}
	public Sel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
