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
import com.mostafa.model.Database;

/**
 * Servlet implementation class CustomerServlet
 */
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Database db= (Database) getServletContext().getAttribute("db");
		
		
		String sql = "select * from customer";
		
		
		ResultSet rs;
		List<Actor> actors = new ArrayList<>();
		try{
			
			
			rs = db.runSql(sql);
			
			while(rs.next()){
				actors.add(new Actor(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getDate("last_update")));
					
			}
			
		} catch(SQLException e){
			
			e.printStackTrace();
			
		}	
	
		request.setAttribute("actors", actors);
		RequestDispatcher view= request.getRequestDispatcher("result.jsp");
		
		view.forward(request, response);
		
	
		
	}

	
}
