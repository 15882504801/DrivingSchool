package cn.cdu.edu.school.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cdu.edu.school.service.PlaceService;
import cn.cdu.edu.school.service.impl.PlaceServiceImpl;

/**
 * Servlet implementation class SelectExamPlaceServlet
 */
@WebServlet("/SelectExamPlaceServlet")
public class SelectExamPlaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectExamPlaceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int studentid=Integer.parseInt(request.getParameter("studentid"));
		String address=request.getParameter("address");
		String time=request.getParameter("time");
		String type=request.getParameter("type");
		PlaceService placeService=new PlaceServiceImpl();
		if(placeService.selectexamplace(studentid,address,time,type)) {
			request.getRequestDispatcher("CoachManager/CoachManager.jsp").forward(request, response);
		} else {
		request.getRequestDispatcher("CoachManager/MakeExamPlace.jsp").forward(request, response);
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
