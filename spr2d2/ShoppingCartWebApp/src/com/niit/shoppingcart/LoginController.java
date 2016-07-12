package com.niit.shoppingcart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doget");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        System.out.println("dopost");
		String userID=request.getParameter("userID");
		String password= request.getParameter("password");
		 
		LoginDAO loginDAO=new LoginDAO();
		RequestDispatcher dispatcher;{
		if(loginDAO.isValiduser(userID,password)==true)
		{
			 dispatcher=request.getRequestDispatcher("Home.html");
			 dispatcher.forward(request, response);
			 
		}
		else
		{
			dispatcher=request.getRequestDispatcher("Login.html");
			PrintWriter w= response.getWriter();
			w.append("<h4> Invalid credeitnals....pls try again</h4>");
			dispatcher.include(request, response);		
		}
	}

}
}
