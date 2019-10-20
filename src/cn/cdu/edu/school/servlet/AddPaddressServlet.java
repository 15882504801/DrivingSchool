package cn.cdu.edu.school.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cdu.edu.school.model.Paddress;
import cn.cdu.edu.school.service.PlaceService;
import cn.cdu.edu.school.service.impl.PlaceServiceImpl;

/**
 * Servlet implementation class AddPaddressServlet
 */
@WebServlet("/AddPaddressServlet")
public class AddPaddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AddPaddressServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("textml);charset=UTF-8");
		PlaceService placeService=new PlaceServiceImpl();
		String address=request.getParameter("address");
		String time=request.getParameter("time");
		Paddress paddress=new Paddress();
		paddress.setAddress(address);
		paddress.setTime(time);
		try {
			if (placeService.addPaddress(paddress)){
				request.getRequestDispatcher("/AdminManager/PracticeManager.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/AdminManager/PracticeManager.jsp").forward(request, response);
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
