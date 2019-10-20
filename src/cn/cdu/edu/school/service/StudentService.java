package cn.cdu.edu.school.service;

import java.util.List;

import cn.cdu.edu.school.model.Student;

public interface StudentService {

	Student login(String tel, String password);

	int getCount();

	List<Student> findByPage(int currPage);

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
