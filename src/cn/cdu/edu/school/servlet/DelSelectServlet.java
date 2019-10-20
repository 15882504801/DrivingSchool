package cn.cdu.edu.school.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cdu.edu.school.service.StudentService;
import cn.cdu.edu.school.service.impl.StudentServiceImpl;

@WebServlet("/DelSelectServlet")
public class DelSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DelSelectServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int studentid=Integer.parseInt(request.getParameter("studentid"));
		StudentService studentService=new StudentServiceImpl();
		if(studentService.delstudent(studentid)) {
			request.getRequestDispatcher("CoachManager/CoachManager.jsp").forward(request, response);
		} else {
		request.getRequestDispatcher("CoachManager/ChangeCoachPassword.jsp").forward(request, response);
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
