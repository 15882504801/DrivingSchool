package cn.cdu.edu.school.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cdu.edu.school.model.Admin;
import cn.cdu.edu.school.model.Coach;
import cn.cdu.edu.school.model.Student;
import cn.cdu.edu.school.service.AdminService;
import cn.cdu.edu.school.service.CoachService;
import cn.cdu.edu.school.service.StudentService;
import cn.cdu.edu.school.service.impl.AdminServiceImpl;
import cn.cdu.edu.school.service.impl.CoachServiceImpl;
import cn.cdu.edu.school.service.impl.StudentServiceImpl;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String tel = request.getParameter("tel");
		String password = request.getParameter("password");
		String role=request.getParameter("role");
		String rmb = request.getParameter("remeberme");
		String checkCode=request.getParameter("checkCode");
		String code = (String)request.getSession().getAttribute("checkCode");
		System.out.println("1"+code);
		System.out.println("2"+checkCode);
		if(!checkCode.equals(code)) {
			request.setAttribute("yzm", "验证码错误");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		
		
		
		
		Cookie cookie=null;
		Student student=new Student();
		CoachService cs =new CoachServiceImpl();
		Coach coach=new Coach();
		StudentService studentService=new StudentServiceImpl();
		Admin admin=new Admin();
		AdminService adminService=new AdminServiceImpl();
		if(role.equals("student")) {
			student=studentService.login(tel,password);
			if(student!=null) {
				if(rmb!=null) {
					cookie = new Cookie("user", tel + "-" + password);
					cookie.setPath("/");
					cookie.setMaxAge(600);
					response.addCookie(cookie);
				}else {
					cookie = new Cookie("user", tel + "-" + password);
					cookie.setPath("/");
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
				request.getSession().setAttribute("user",student);
				if (student.getVip()==1) {
					response.sendRedirect("/DrivingSchool/StudentManager/studentmanager.jsp");
				}else {
					PrintWriter out = response.getWriter();
					out.println("请先到财务处缴费再进行登录！！！！！！！");
				}
				return;
			} else {
				request.setAttribute("msg", "用户名或密码错误");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}

		} 
		if(role.equals("coach")) {
			coach=cs.login(tel,password);
			if(coach!=null) {
				if(rmb!=null) {
					cookie = new Cookie("user", tel + "-" + password);
					cookie.setPath("/");
					cookie.setMaxAge(600);
					response.addCookie(cookie);
				}else {
					cookie = new Cookie("user", tel + "-" + password);
					cookie.setPath("/");
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
				request.getSession().setAttribute("user", coach);
				response.sendRedirect("/DrivingSchool/CoachManager/CoachManager.jsp");
			} else {
				request.setAttribute("msg", "用户名或密码错误");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} 
		if(role.equals("admin")) {
			System.out.println("das");
			admin=adminService.login(tel,password);
			if(admin!=null) {
				System.out.println("as");
				if(rmb!=null) {
					cookie = new Cookie("user", tel + "-" + password);
					cookie.setPath("/");
					cookie.setMaxAge(600);
					response.addCookie(cookie);
				}else {
					cookie = new Cookie("user", tel + "-" + password);
					cookie.setPath("/");
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
				request.getSession().setAttribute("user", admin);
				System.out.println("ds");
				response.sendRedirect("/DrivingSchool/AdminManager/AdminManager.jsp");
			
			} else {
				
				request.setAttribute("msg", "用户名或密码错误");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} 
		
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
