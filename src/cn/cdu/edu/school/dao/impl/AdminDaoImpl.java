package cn.cdu.edu.school.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.cdu.edu.school.dao.AdminDao;
import cn.cdu.edu.school.model.Admin;
import cn.cdu.edu.school.utils.DBUtils;

public class AdminDaoImpl implements AdminDao {

	@Override
	public Admin login(String name, String password) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Admin admin=null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("select * from drivingschool.admin where name=? and password=?");
			ps.setString(1, name);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next()) {
				admin=new Admin();
				admin.setName(rs.getString("name"));
				admin.setPassword(rs.getString("password"));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return admin;
	}
	public void deletecoach(int id) {
		// TODO 自动生成的方法存根
		
	}

}
