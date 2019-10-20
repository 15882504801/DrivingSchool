package cn.cdu.edu.school.dao;

import java.util.List;

import cn.cdu.edu.school.model.Coach;

public interface CoachDao {

	Coach login(String tel, String password);

	boolean changepassword(String newpassword, String oldpassword, int id);

	public List<Coach> findAll();

	boolean delcoach(String id);

	boolean addCoach(Coach coach);
}
