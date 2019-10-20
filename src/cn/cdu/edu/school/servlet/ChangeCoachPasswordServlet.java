package cn.cdu.edu.school.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cdu.edu.school.model.Coach;
import cn.cdu.edu.school.service.CoachService;
import cn.cdu.edu.school.service.impl.CoachServiceImpl;

/**
 * Servlet implementation class ChangeCoachPasswordServlet
 */
@WebServlet("/ChangeCoachPasswordServlet")
public class ChangeCoachPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ChangeCoachPasswordServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String newpassword=request.getParameter("newpassword");
		String oldpassword=request.getParameter("oldpassword");
		Coach coach=(Coach) request.getSession().getAttribute("user");
		int id=coach.getId();
		CoachService coachService=new CoachServiceImpl();
		if(coachService.changepassword(newpassword,oldpassword,id)) {

			request.getRequestDispatcher("CoachManager/CoachManager.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "密码错误");
			request.getRequestDispatcher("CoachManager/ChangeCoachPassword.jsp").forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
