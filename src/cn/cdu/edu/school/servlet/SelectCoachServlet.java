package cn.cdu.edu.school.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cdu.edu.school.model.Student;
import cn.cdu.edu.school.service.StudentService;
import cn.cdu.edu.school.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class SelectCoachServlet
 */
@WebServlet("/SelectCoachServlet")
public class SelectCoachServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectCoachServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    StudentService st = new StudentServiceImpl();
		int cid = Integer.parseInt(request.getParameter("Cid"));
		Student s = (Student) request.getSession().getAttribute("user");
		int sid=s.getId();
		
			st.SelectCoach(cid,sid);
			response.sendRedirect("/DrivingSchool/StudentManager/studentmanager.jsp");
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
