package br.com.fiap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet( urlPatterns = {"/validacao","/index.php"})
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Teste de Request
		System.out.println("Olá Mundo!");
		
		/*
		 * Bloco de Processamento
		 */
		
			String nomeUsuario = "";
			String senhaUsuario = "";
			
			// Receive the forms attributes that are in the request and store in the variables
			nomeUsuario = request.getParameter("txt-user");
			senhaUsuario = request.getParameter("txt-pass");
			
			// Print the data that arrived from the request
			System.out.println("Nome de usuário: " + nomeUsuario);
			System.out.println("Senha do usuário: " + senhaUsuario);
		
		/*
		 * Bloco de Processamento
		 */
			
			// Criando um redirecionamento utilizando o response
			// Utilize o método sendRedirect (caminho ou URI de destino)
			response.sendRedirect("login.html");
		
	
	}

}
