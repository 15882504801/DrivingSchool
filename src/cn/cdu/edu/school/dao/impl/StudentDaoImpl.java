package cn.cdu.edu.school.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import cn.cdu.edu.school.dao.StudentDao;
import cn.cdu.edu.school.model.Sel;
import cn.cdu.edu.school.model.Student;
import cn.cdu.edu.school.utils.DBUtils;


public class StudentDaoImpl implements StudentDao{

	@Override
	public Student login(String tel, String password) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Student student=null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("select * from student where tel=? and password=?");
			ps.setString(1, tel);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next()) {
				student=new Student();
				student.setAddress(rs.getString("address"));
				student.setAge(rs.getInt("age"));
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setPassword(rs.getString("password"));
				student.setSex(rs.getString("sex"));
				student.setTel(rs.getString("tel"));
				student.setType(rs.getString("type"));
				student.setVip(rs.getInt("vip"));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return student;
	}

	@Override
	public List<Student> findByPage(int page) {
		List<Student> list = new ArrayList<Student>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Student student=null;
		String sql = "select * from student limit ?,?";

		try {
			conn = DBUtils.getConnection();
		   ps = conn.prepareStatement(sql);
			ps.setInt(1, (page - 1) * Student.PAGE_SIZE);
			ps.setInt(2, Student.PAGE_SIZE);
			rs = ps.executeQuery();
			while (rs.next()) {
				student=new Student();
				student.setAddress(rs.getString("address"));
				student.setAge(rs.getInt("age"));
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setPassword(rs.getString("password"));
				student.setSex(rs.getString("sex"));
				student.setTel(rs.getString("tel"));
				student.setType(rs.getString("type"));
				student.setVip(rs.getInt("vip"));
				list.add(student);
				
			}
			ps.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return list;
	}

	
	
	@Override
	public int getCount() {
		int count = 0;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql = "select count(*) from student ";
		try {
			conn=DBUtils.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return count;
	}

	@Override
	public Sel findbyid(int studentid) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Sel sel=null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("select * from sel where studentid=?");
			ps.setInt(1, studentid);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				sel=new Sel();
				sel.setCoachid(rs.getInt("coachid"));
				sel.setStudentid(rs.getInt("studentid"));
				sel.setSeldate(rs.getDate("seldate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return sel;
	}

	@Override
	public boolean selectstudent(int studentid) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		System.out.println("da"+studentid);
		Date date=new Date(System.currentTimeMillis());
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("update sel set seldate=? where studentid=?");
			ps.setDate(1,date);
			ps.setInt(2, studentid);
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
	public boolean delstudent(int studentid) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("delete from coach where studentid=?");
			ps.setInt(1, studentid);
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
	public void addStudent(Student student) {
		Connection conn= null;
		   PreparedStatement ps=null;
		   try {	
			conn = DBUtils.getConnection();
			String sql= "insert into student(name,sex,age,tel,address,password,type,vip) values(?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setString(2, student.getSex());
			ps.setInt(3, student.getAge());
			ps.setString(4, student.getTel());
			ps.setString(5, student.getAddress());
			ps.setString(6, student.getPassword());
			ps.setString(7, student.getType());
			ps.setInt(8, 0);
	        int i = ps.executeUpdate();
	        if (i>0) {
	        	System.out.println("加入成功!");
	        }else {
				throw new RuntimeException("插入失败！");
			}
	        } catch (Exception e) {
				e.printStackTrace();
			}finally {
				DBUtils.closeAll(null, ps, conn);
			}
		
	}

	@Override
	public void deleteStudent(int id) {
		System.out.println(id);
		Connection conn = null;
		try {
			conn = DBUtils.getConnection();
	     	String sql = "delete from student where id=?";
			PreparedStatement pt = conn.prepareStatement(sql);
			pt.setInt(1, id);
			int i = pt.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally {
			DBUtils.closeAll(null, null, conn);
		}
	}

	@Override
	public List<Student> findAll() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Student> list = new ArrayList<Student>();
		try {
			conn = DBUtils.getConnection();
			String sql = "select * from student";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Student s = new Student();
			    s.setId(rs.getInt("id"));
			    s.setName(rs.getString("name"));
			    s.setSex(rs.getString("sex"));
			    s.setAge(rs.getInt("age"));
			    s.setTel(rs.getString("tel"));
			    s.setAddress(rs.getString("address"));
			    s.setPassword(rs.getString("password"));
			    s.setType(rs.getString("type"));
			    s.setVip(rs.getInt("vip"));
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return list;
	}

	@Override
	public int updatastudent(Student student) {
		int i = 0;
		PreparedStatement pt= null;
		Connection conn = null;
		String sql = "update student set password=? where id=?";
		try {
			conn = DBUtils.getConnection();
			pt = conn.prepareStatement(sql);
			pt.setString(1, student.getPassword());
			pt.setInt(2,student.getId());
			i = pt.executeUpdate();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		DBUtils.closeAll(null, pt, conn);
		
		return i;
	}
public void SelectCoach(int cid, int sid) {
		
		Connection conn= null;
		   PreparedStatement ps=null;
		   try {	
			conn = DBUtils.getConnection();
			String sql= "insert into sel(studentid,coachid) values(?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, sid);
			ps.setInt(2, cid);
	        int i = ps.executeUpdate();
	        if (i>0) {
	        	System.out.println("加入成功!");
	        }else {
				throw new RuntimeException("插入失败！");
			}
	        } catch (Exception e) {
				e.printStackTrace();
			}finally {
				DBUtils.closeAll(null, ps, conn);
			}
		
		
	}

	@Override
	public void money(int id) {
		Connection conn= null;
		   PreparedStatement ps=null;
		   try {	
			conn = DBUtils.getConnection();
			String sql= "update student set vip=? where id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.setInt(2, id);
	        int i = ps.executeUpdate();
	        if (i>0) {
	        	System.out.println("缴费成功");
	        }else {
				throw new RuntimeException("缴费失败！");
			}
	        } catch (Exception e) {
				e.printStackTrace();
			}finally {
				DBUtils.closeAll(null, ps, conn);
			}
		
	}

	@Override
	public String SelCoach(String sid) {
		Connection conn=null;
		PreparedStatement ps=null;
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		ResultSet resultSet = null;
		int id = Integer.parseUnsignedInt(sid); 
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("select * from sel where studentid=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
				int cid = rs.getInt("coachid");
				preparedStatement = conn.prepareStatement("select * from coach where id=?");
				preparedStatement.setInt(1, cid);
				resultSet=preparedStatement.executeQuery();
				if(resultSet.next()) {
				String name = resultSet.getString("name");
				return name;
			}}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtils.closeAll(rs, ps, conn);
		}
		return null;
		
		
	}

}
