package cn.cdu.edu.school.service.impl;

import java.util.List;

import cn.cdu.edu.school.dao.StudentDao;
import cn.cdu.edu.school.dao.impl.StudentDaoImpl;
import cn.cdu.edu.school.model.Student;
import cn.cdu.edu.school.service.StudentService;

public class StudentServiceImpl implements StudentService {

	Student student=new Student();
	StudentDao sd = new StudentDaoImpl();
	StudentDao StudentDao=new StudentDaoImpl();
	@Override
	public Student login(String tel, String password) {
		student=StudentDao.login(tel,password);
		return student;
		
	}
	@Override
	public int getCount() {
		int count=1;
		count=StudentDao.getCount();
		return count;
	}
	@Override
	public List<Student> findByPage(int currPage) {
		List<Student> list=StudentDao.findByPage(currPage);
		return list;
	}
	@Override
	public boolean selectstudent(int studentid) {
		if(StudentDao.selectstudent(studentid)) {
			return true;
		}
		return false;
	}
	@Override
	public boolean delstudent(int studentid) {
		if(StudentDao.delstudent(studentid)) {
			return true;
		}
		return false;
	}
	@Override
	public void addStudent(Student student) {
		sd.addStudent(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		
		sd.deleteStudent(id);
		
	}

	@Override
	public List<Student> findAll() {
			
			List<Student> students = sd.findAll();
			if (!students.isEmpty()&&students.size()>0) {
				return students;	
			}
			throw new RuntimeException("û��ѧԱ");
	}

	@Override
	public int updatastudent(Student student) {
		
		return sd.updatastudent(student);
	}
	@Override
	public void SelectCoach(int cid, int sid) {
		sd.SelectCoach(cid, sid);
		
	}

	@Override
	public void money(int id) {
		// TODO 自动生成的方法存根
		sd.money(id);
	}

	@Override
	public String SelCoach(String sid) {
		// TODO 自动生成的方法存根
		return sd.SelCoach(sid);
	}

}
