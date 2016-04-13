package com.mostafa.context;

import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.mostafa.model.Database;

public class MyContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
				
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		ServletContext sc= event.getServletContext();
		
		String url = sc.getInitParameter("url");
		String user_name = sc.getInitParameter("user_name");
		String password = sc.getInitParameter("password");
		String database = sc.getInitParameter("database");
		// now call database class object
		Database db = new Database(url+database, user_name, password);		
				
			sc.setAttribute("db", db);	

	}

}
