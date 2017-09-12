package control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.*;


@WebServlet({ "/sis/gravar", "/sis/atualizar", "/sis/buscar" })
public class ServletAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String PREFIX_URL = "/sis/";
       


    public ServletAluno() {
        super();
        // TODO Auto-generated constructor stub
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getServletPath().equals(PREFIX_URL + "gravar")) {
			gravar(response);
		} else if (request.getServletPath().equals(PREFIX_URL + "atualizar")) {
			atualizar(response);
		} else if (request.getServletPath().equals(PREFIX_URL + "buscar")) {
			buscar(response);
		}
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	protected void gravar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Request via listar");
		
		
	}
	
	
	protected void atualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
	}
	

	
	protected void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
	}
	
}
