package cn.cdu.edu.school.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cdu.edu.school.model.Coach;
import cn.cdu.edu.school.service.CoachService;
import cn.cdu.edu.school.service.impl.CoachServiceImpl;

/**
 * Servlet implementation class CoachManagerServlet
 */
@WebServlet("/CoachManagerServlet")
public class CoachManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoachManagerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CoachService cs = new CoachServiceImpl();
		List<Coach> list = null;
		try {
			list= cs.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getSession().setAttribute("Clist", list);
		if (list!=null) {
			response.sendRedirect(request.getContextPath()+"/AdminManager/CoachManana.jsp");
		}else {
			System.out.println("null");
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
