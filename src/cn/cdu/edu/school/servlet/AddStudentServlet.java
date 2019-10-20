package cn.cdu.edu.school.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import cn.cdu.edu.school.model.Student;
import cn.cdu.edu.school.service.StudentService;
import cn.cdu.edu.school.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		StudentService st = new  StudentServiceImpl();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		Student student = new Student();
		String phone = request.getParameter("phoneCode");
		String phoneCode = (String) request.getSession().getAttribute("phoneCode");

		try {
			
			ConvertUtils.register(new DateLocaleConverter(), Date.class);
			BeanUtils.populate(student, request.getParameterMap());

			st.addStudent(student);
		}catch (Exception e) {
			request.setAttribute("error", "注册失败");
			request.getRequestDispatcher("studentregister.jsp").forward(request, response);
		}

		if(!phone.equals(phoneCode)){
			request.setAttribute("phoneCodeMsg", "手机验证码有误");
			request.getRequestDispatcher("studentregister.jsp").forward(request, response);
			return;
		}
		response.getWriter().write("注册成功。1秒后跳转");
		response.setHeader("refresh", "1;url="+request.getContextPath()+"/index.jsp");

		
		//
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
