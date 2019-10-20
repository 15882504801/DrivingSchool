package cn.cdu.edu.school.dao;

import java.util.List;

import cn.cdu.edu.school.model.Sel;
import cn.cdu.edu.school.model.Student;

public interface StudentDao {

	Student login(String tel, String password);
	public List<Student> findByPage(int page);
	public int getCount();
	Sel findbyid(int studentid);
	boolean selectstudent(int studentid);
	boolean delstudent(int studentid);
public  void addStudent(Student student);
	
	public  void deleteStudent(int id);               
	
	public List<Student> findAll();
	
	public int updatastudent(Student student); 
	public void SelectCoach(int cid, int sid);

	public void money(int id);
	
	public String SelCoach(String sid);

}
