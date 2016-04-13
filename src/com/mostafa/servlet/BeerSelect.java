package com.mostafa.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mostafa.model.Actor;
import com.mostafa.model.BeerExpert;
import com.mostafa.model.Database;

/**
 * Servlet implementation class BeerSelect
 */
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeerSelect() {
        super();
        // TODO Auto-generated constructor stub
    }





	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		System.out.println("Calling from Init Method");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String c= request.getParameter("color");
		BeerExpert coffe= new BeerExpert();
		List<String> result= coffe.getBrands(c);
	
		
		request.setAttribute("styles", result);
		
RequestDispatcher view= request.getRequestDispatcher("coffe.jsp");
		
		view.forward(request, response);
	
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		
		System.out.println("Calling destroy Method");
		
		
	}	

}
