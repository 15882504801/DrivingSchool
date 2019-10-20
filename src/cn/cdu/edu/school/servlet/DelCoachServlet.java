package cn.cdu.edu.school.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cdu.edu.school.service.CoachService;
import cn.cdu.edu.school.service.impl.CoachServiceImpl;

/**
 * Servlet implementation class DelCoachServlet
 */
@WebServlet("/DelCoachServlet")
public class DelCoachServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public DelCoachServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String id=request.getParameter("id");
		CoachService coachService=new CoachServiceImpl();
		if(coachService.delcoach(id)) {
			request.getRequestDispatcher("CoachManagerServlet").forward(request, response);
		} else {
		request.getRequestDispatcher("AdminManager/CoachManager.jsp").forward(request, response);
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
