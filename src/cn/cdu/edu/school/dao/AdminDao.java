package cn.cdu.edu.school.dao;

import cn.cdu.edu.school.model.Admin;

public interface AdminDao {

	Admin login(String name, String password);

	public  void deletecoach(int id);
}
