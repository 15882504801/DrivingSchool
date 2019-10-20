package cn.cdu.edu.school.service.impl;

import java.util.List;

import cn.cdu.edu.school.dao.CoachDao;
import cn.cdu.edu.school.dao.impl.CoachDaoImpl;
import cn.cdu.edu.school.model.Coach;
import cn.cdu.edu.school.service.CoachService;

public class CoachServiceImpl implements CoachService{

	Coach coach=new Coach();
	CoachDao coachDao=new CoachDaoImpl();
	@Override
	public Coach login(String tel, String password) {
		coach=coachDao.login(tel,password);
		return coach;
	}
	@Override
	public boolean changepassword(String newpassword, String oldpassword, int id) {
		if(coachDao.changepassword(newpassword,oldpassword,id)) {
			return true;
		}
		return false;
	}
	@Override
	public List<Coach> findAll() {
		List<Coach> coachs = coachDao.findAll();
		if (!coachs.isEmpty()&&coachs.size()>0) {
			return coachs;	
		}
		throw new RuntimeException("没有教练了");
	}
	@Override
	public boolean delcoach(String id) {
		if(coachDao.delcoach(id)) {
			return true;
		}
		return false;
	}
	@Override
	public boolean addCoach(Coach coach) {
		if(coachDao.addCoach(coach)) {
			return true;
		}
		return false;

	}

}
