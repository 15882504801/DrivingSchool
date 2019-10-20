package cn.cdu.edu.school.service;

import java.util.List;

import cn.cdu.edu.school.model.Eaddress;
import cn.cdu.edu.school.model.Examaddress;
import cn.cdu.edu.school.model.Paddress;
import cn.cdu.edu.school.model.Practiceaddress;

public interface PlaceService {
	public List<Paddress> findpracticeplace();
	public Practiceaddress get(int id);
	public boolean selectpracticeplace(int studentid, String address, String time);
	public List<Eaddress> findexamplace();
	public Examaddress getexam(int id);
	public boolean selectexamplace(int studentid, String address, String time,String type);
	public boolean delpracticeplace(String address, String time);
	public boolean delexamplace(String address, String time, String type);
	public boolean addEaddress(Eaddress eaddress);
	public boolean addPaddress(Paddress paddress);
}
