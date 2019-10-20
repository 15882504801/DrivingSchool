package cn.cdu.edu.school.service.impl;

import java.util.List;

import cn.cdu.edu.school.dao.PlaceDao;
import cn.cdu.edu.school.dao.impl.PlaceDaoImpl;
import cn.cdu.edu.school.model.Eaddress;
import cn.cdu.edu.school.model.Examaddress;
import cn.cdu.edu.school.model.Paddress;
import cn.cdu.edu.school.model.Practiceaddress;
import cn.cdu.edu.school.service.PlaceService;

public class PlaceServiceImpl implements PlaceService {

	PlaceDao placeDao = new PlaceDaoImpl();

	@Override
	public List<Paddress> findpracticeplace() {
		List<Paddress> list = placeDao.findpracticeplace();
		return list;
	}

	@Override
	public Practiceaddress get(int id) {
		Practiceaddress practiceaddress = new Practiceaddress();

		practiceaddress = placeDao.get(id);
		return practiceaddress;
	}

	@Override
	public boolean selectpracticeplace(int studentid, String address, String time) {
		if (placeDao.selectpracticeplace(studentid, address, time)) {
			return true;
		}
		return false;
	}

	@Override
	public List<Eaddress> findexamplace() {
		List<Eaddress> list = placeDao.findexamplace();
		return list;
	}

	@Override
	public Examaddress getexam(int id) {
		Examaddress examaddress = new Examaddress();

		examaddress = placeDao.getexam(id);
		return examaddress;
	}

	@Override
	public boolean selectexamplace(int studentid, String address, String time, String type) {
		if (placeDao.selectexamplace(studentid, address, time,type)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delpracticeplace(String address, String time) {
		if (placeDao.delpracticeplace(address, time)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delexamplace(String address, String time, String type) {
		if (placeDao.delexamplace( address, time,type)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean addEaddress(Eaddress eaddress){
		
		if(placeDao.addEaddress(eaddress)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean addPaddress(Paddress paddress){
		
		if(placeDao.addPaddress(paddress)) {
			return true;
		}
		return false;
	}



}
