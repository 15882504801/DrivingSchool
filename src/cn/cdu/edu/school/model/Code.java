package cn.cdu.edu.school.model;

public class Code {

	private String tel;
	private String code;
	public Code() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Code(String tel, String code) {
		super();
		this.tel = tel;
		this.code = code;
	}
	@Override
	public String toString() {
		return "Code [tel=" + tel + ", code=" + code + "]";
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
