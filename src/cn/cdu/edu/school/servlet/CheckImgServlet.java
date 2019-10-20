package cn.cdu.edu.school.servlet;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckImgServlet
 */
@WebServlet("/CheckImgServlet")
public class CheckImgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckImgServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		StringBuffer sb = new StringBuffer();
		int width=110;
		int height=20;
		BufferedImage img=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g=img.getGraphics();
		g.setColor(Color.PINK);
		g.drawRect(1, 1, width, height);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("楷体", Font.BOLD|Font.ITALIC, 20));
		Random random=new Random();
		int position=20;
		for(int i=0;i<4;i++) {
			int c=random.nextInt(10);
			String str=String.valueOf(c);
			sb.append(str);
			g.drawString(str, position, 20);
			position+=20;
		}
		g.setColor(Color.RED);
		for(int i=0;i<6;i++) {
			g.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
		}
		request.getSession().setAttribute("checkCode", sb.toString());
		System.out.println(sb);
		ImageIO.write(img, "jpg", response.getOutputStream());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
