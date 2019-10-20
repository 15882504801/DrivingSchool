package cn.cdu.edu.school.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.cdu.edu.school.model.Student;
import cn.cdu.edu.school.service.StudentService;
import cn.cdu.edu.school.service.impl.StudentServiceImpl;


/**
 * Servlet implementation class UpdataStudentServlet
 */
@WebServlet("/UpdataStudentServlet")
public class UpdataStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdataStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session=request.getSession();
		Student stu= (Student) session.getAttribute("user");
		String passwords = stu.getPassword();
		String password = request.getParameter("password");
		String Npassword = request.getParameter("Npassword");
		String repassword = request.getParameter("repassword");
		Student student = new Student();
		if(password.equals(passwords)&&Npassword.equals(repassword)){
			student.setId(stu.getId());
			student.setPassword(request.getParameter("Npassword"));
			StudentService  studentService = new StudentServiceImpl();
			int i = studentService.updatastudent(student);
			System.out.println(i);
			if (i!=0) {
				response.getWriter().write("注册成功。1秒后跳转");	
				stu.setPassword(Npassword);
				request.getSession().setAttribute("user",stu);
				request.getRequestDispatcher("/StudentManager/studentmanager.jsp").forward(request, response);
			}else {
				response.getWriter().write("注册失败。1秒后跳转");
				request.getRequestDispatcher("/StudentManager/studentmanager.jsp").forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
