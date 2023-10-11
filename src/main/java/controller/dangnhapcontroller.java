package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class dangnhapcontroller
 */
@WebServlet("/dangnhapcontroller")
public class dangnhapcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangnhapcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String  un= request.getParameter("acc");
		String pass = request.getParameter("pw");
		if(un!=null&&pass!=null) {
			if(un.equals("admin") && pass.equals("1")){
				HttpSession ss= request.getSession();
				ss.setAttribute("dn", un);
				RequestDispatcher rd = request.getRequestDispatcher("sachcontroller1");
				rd.forward(request, response);
				
			}else {
				request.setAttribute("kt", "dng nhap sai");
				RequestDispatcher rd = request.getRequestDispatcher("log.jsp");
				rd.forward(request, response);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("log.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
