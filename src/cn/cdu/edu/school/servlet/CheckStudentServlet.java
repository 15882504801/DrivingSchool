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
 * Servlet implementation class CheckStudentServlet
 */
@WebServlet("/CheckStudentServlet")
public class CheckStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CheckStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int currPage = 1;
		if (request.getParameter("page") != null) {
			currPage = Integer.parseInt(request.getParameter("page"));
		}
		StudentService studentService=new StudentServiceImpl();
		List<Student> list = studentService.findByPage(currPage);
		System.out.println(list);
		request.setAttribute("list", list);
		int pages;
		int count = studentService.getCount();
		if (count % Student.PAGE_SIZE == 0) {
			pages = count / Student.PAGE_SIZE;
		} else {
			pages = count / Student.PAGE_SIZE + 1;
		}
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 1; i <= pages; i++) {
			if (i == currPage) {
				sBuffer.append("[" + i + "]");
			} else {
				sBuffer.append("<a href='CheckStudentServlet?page=" + i + "'>" + i + "</a>");
			}
			sBuffer.append("");
		}
		request.setAttribute("bar", sBuffer.toString());
		request.getRequestDispatcher("/CoachManager/CheckStudent.jsp").forward(request, response);	
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
