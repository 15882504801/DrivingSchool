package cn.cdu.edu.school.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cdu.edu.school.model.Student;
import cn.cdu.edu.school.service.StudentService;
import cn.cdu.edu.school.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class StudentFindServlet
 */
@WebServlet("/StudentFindServlet")
public class StudentFindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentFindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService st = new StudentServiceImpl();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		List<Student> list = null;
		try {
			list= st.findAll();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		request.getSession().setAttribute("Slist", list);
		response.sendRedirect(request.getContextPath()+"/StudentManager/findstudent.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
