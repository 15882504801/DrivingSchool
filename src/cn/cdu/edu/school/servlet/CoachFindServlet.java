package cn.cdu.edu.school.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cdu.edu.school.model.Coach;
import cn.cdu.edu.school.model.Student;
import cn.cdu.edu.school.service.CoachService;
import cn.cdu.edu.school.service.StudentService;
import cn.cdu.edu.school.service.impl.CoachServiceImpl;
import cn.cdu.edu.school.service.impl.StudentServiceImpl;



/**
 * Servlet implementation class CoachFindServlet
 */
@WebServlet("/CoachFindServlet")
public class CoachFindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoachFindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CoachService cs = new CoachServiceImpl();
		StudentService st = new StudentServiceImpl();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		Student s = (Student) request.getSession().getAttribute("user");
		int sid=s.getId();
		String name = st.SelCoach(String.valueOf(sid));
		if(name!=null){
			PrintWriter out = response.getWriter();
			out.println("已经选择了教练，教练为"+name);
		}else {
		List<Coach> list = null;
		try {
			list= cs.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getSession().setAttribute("Clist", list);
		if (list!=null) {
			response.sendRedirect(request.getContextPath()+"/StudentManager/findcoach.jsp");
		}else {
			System.out.println("null");
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
