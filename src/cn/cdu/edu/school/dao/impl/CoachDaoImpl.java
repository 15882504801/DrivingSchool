package cn.cdu.edu.school.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.cdu.edu.school.dao.CoachDao;
import cn.cdu.edu.school.model.Coach;
import cn.cdu.edu.school.utils.DBUtils;

public class CoachDaoImpl implements CoachDao{

	@Override
	public Coach login(String tel, String password) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Coach coach=null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("select * from coach where tel=? and password=?");
			ps.setString(1, tel);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next()) {
				coach=new Coach();
				coach.setAddress(rs.getString("address"));
				coach.setAge(rs.getInt("age"));
				coach.setId(rs.getInt("id"));
				coach.setName(rs.getString("name"));
				coach.setPassword(rs.getString("password"));
				coach.setSex(rs.getString("sex"));
				coach.setTel(rs.getString("tel"));
				coach.setType(rs.getString("type"));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return coach;
	}

	@Override
	public boolean changepassword(String newpassword, String oldpassword, int id) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("update coach set password=? where id=? and password=?");
			ps.setString(1, newpassword);
			ps.setString(3, oldpassword);
			ps.setInt(2, id);
			int i=ps.executeUpdate();
			if(i!=0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return false;
	}
	
	
	public List<Coach> findAll() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Coach> list = new ArrayList<Coach>();
		try {
			conn = DBUtils.getConnection();
			String sql = "select * from coach";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Coach c = new Coach();
			    c.setId(rs.getInt("id"));
			    c.setName(rs.getString("name"));
			    c.setSex(rs.getString("sex"));
			    c.setAge(rs.getInt("age"));
			    c.setTel(rs.getString("tel"));
			    c.setAddress(rs.getString("address"));
			    c.setPassword(rs.getString("password"));
			    c.setType(rs.getString("type"));
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return list;
	}

	@Override
	public boolean delcoach(String id) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int coachid=Integer.parseInt(id);
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("delete from coach where id=?");
			ps.setInt(1, coachid);
			int i=ps.executeUpdate();
			if(i!=0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return false;
	}

	@Override
	public boolean addCoach(Coach coach) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("insert into coach(name,sex,age,tel,address,type,password) values(?,?,?,?,?,?,?)");
			ps.setString(1, coach.getName());
			ps.setString(2, coach.getSex());
			ps.setInt(3, coach.getAge());
			ps.setString(4, coach.getTel());
			ps.setString(5, coach.getAddress());
			ps.setString(6, coach.getType());
			ps.setString(7, coach.getPassword());
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			DBUtils.closeAll(null, ps, conn);
		}
		return false;
	}

}
