package cn.cdu.edu.school.service.impl;

import cn.cdu.edu.school.dao.AdminDao;
import cn.cdu.edu.school.dao.impl.AdminDaoImpl;
import cn.cdu.edu.school.model.Admin;
import cn.cdu.edu.school.service.AdminService;

public class AdminServiceImpl implements AdminService {

	AdminDao adminDao=new AdminDaoImpl();
	Admin admin=new Admin();
	@Override
	public Admin login(String tel, String password) {
		admin=adminDao.login(tel,password);
		return admin;
	}

}
