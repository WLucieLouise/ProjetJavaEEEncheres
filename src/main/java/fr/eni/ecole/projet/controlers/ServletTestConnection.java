package fr.eni.ecole.projet.controlers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projet.modele.dal.ConnectionProvider;

/**
 * Servlet implementation class ServletTestConnexion
 */
@WebServlet("/ServletTestConnection")
public class ServletTestConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		Connection connection =  ConnectionProvider.getConnection();
		System.out.println(connection.isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
	}	

}
