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
 * Servlet implementation class AddCoachServlet
 */
@WebServlet("/AddCoachServlet")
public class AddCoachServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCoachServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("textml);charset=UTF-8");
		CoachService coachService = new CoachServiceImpl();
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		int age=Integer.parseInt(request.getParameter("age"));
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		String type = request.getParameter("type");
		String password=request.getParameter("password");
		Coach coach=new Coach();
		coach.setName(name);
		coach.setSex(sex);
		coach.setAge(age);
		coach.setTel(tel);
		coach.setAddress(address);
		coach.setType(type);
		coach.setPassword(password);
		try {
			if (coachService.addCoach(coach)){
				request.getRequestDispatcher("CoachManagerServlet").forward(request, response);
			} else {
				request.getRequestDispatcher("/AdminManager/addcoach.jsp").forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
