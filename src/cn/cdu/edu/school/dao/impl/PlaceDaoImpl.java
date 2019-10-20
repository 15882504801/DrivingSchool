package cn.cdu.edu.school.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.cdu.edu.school.dao.PlaceDao;
import cn.cdu.edu.school.model.Eaddress;
import cn.cdu.edu.school.model.Examaddress;
import cn.cdu.edu.school.model.Paddress;
import cn.cdu.edu.school.model.Practiceaddress;
import cn.cdu.edu.school.utils.DBUtils;

public class PlaceDaoImpl implements PlaceDao {

	@Override
	public List<Paddress> findpracticeplace() {
		List<Paddress> list = new ArrayList<Paddress>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Paddress paddress=null;
		String sql = "select * from paddress ";

		try {
			conn = DBUtils.getConnection();
		   ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
			paddress=new Paddress();
			paddress.setAddress(rs.getString("address"));
			paddress.setTime(rs.getString("time"));
				list.add(paddress);
				
			}
			ps.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return list;
	}

	@Override
	public Practiceaddress get(int id) {
		Practiceaddress practiceaddress=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql = "select * from practiceaddress where id=?";

		try {
			conn = DBUtils.getConnection();
		   ps = conn.prepareStatement(sql);
		   ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
			practiceaddress=new Practiceaddress();
			practiceaddress.setAddress(rs.getString("address"));
			practiceaddress.setId(rs.getInt("id"));
			practiceaddress.setTime(rs.getString("time"));
			}
			ps.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return practiceaddress;
	}

	@Override
	public boolean selectpracticeplace(int studentid, String address, String time) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql = "insert into practiceaddress(id,address,time) values(?,?,?)";
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, studentid);
			ps.setString(2, address);
			ps.setString(3, time);
			
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return false;

	}

	@Override
	public List<Eaddress> findexamplace() {
		List<Eaddress> list = new ArrayList<Eaddress>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
			Eaddress eaddress=null;
		String sql = "select * from eaddress ";

		try {
			conn = DBUtils.getConnection();
		   ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
			eaddress=new Eaddress();
			eaddress.setAddress(rs.getString("address"));
			eaddress.setTime(rs.getString("time"));
			eaddress.setType(rs.getString("type"));
				list.add(eaddress);
				
			}
			ps.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return list;
	}

	@Override
	public Examaddress getexam(int id) {
		Examaddress examaddress=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql = "select * from examaddress where id=?";

		try {
			conn = DBUtils.getConnection();
		   ps = conn.prepareStatement(sql);
		   ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
			examaddress=new Examaddress();
			examaddress.setAddress(rs.getString("address"));
			examaddress.setId(rs.getInt("id"));
			examaddress.setTime(rs.getString("time"));
			examaddress.setProject(rs.getString("project"));
			}
			ps.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return examaddress;
	}

	@Override
	public boolean selectexamplace(int studentid, String address, String time, String type) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql = "insert into  examaddress(id,address,time,project) values(?,?,?,?)";
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, studentid);
			ps.setString(2, address);
			ps.setString(3, time);
			ps.setString(4, type);
			
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return false;

	}

	@Override
	public boolean delpracticeplace(String address, String time) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql = "delete from paddress where address=? and time=?";
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, address);
			ps.setString(2, time);
	
			
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return false;
	}

	@Override
	public boolean delexamplace(String address, String time, String type) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql = "delete from eaddress where address=? and time=? and type=?";
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, address);
			ps.setString(2, time);
			ps.setString(3, type);
			
	
			
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return false;
	}

	@Override
	public boolean addEaddress(Eaddress eaddress) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("insert into eaddress(address,time,type) values(?,?,?)");
			ps.setString(1, eaddress.getAddress());
			ps.setString(2, eaddress.getTime());
			ps.setString(3, eaddress.getType());
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

	@Override
	public boolean addPaddress(Paddress paddress) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("insert into paddress(address,time) values(?,?)");
			ps.setString(1, paddress.getAddress());
			ps.setString(2, paddress.getTime());
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
