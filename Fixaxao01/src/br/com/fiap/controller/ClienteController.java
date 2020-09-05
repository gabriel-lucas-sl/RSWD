package br.com.fiap.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Cliente;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet(
		description = "Controle de acesso e fluxo de informações.", 
		urlPatterns = { 
				"/cliente", 
				"/listar"
		})
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<Cliente> lista = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();   
        
        if (lista == null) {
        	// Implemta a lista com um ArrayList do tipo Cliente
        	lista = new ArrayList<Cliente>();
        	
        	// Criando uma instância de Cliente
        	Cliente cli = new Cliente();
        	cli.setNome("Gabriel");
        	cli.setSobrenome("Lucas");
        	cli.setDataNasc("2001-12-20");
        	cli.setGenero('m');
        	cli.setTelefone("(11) 91234-3456");
        	lista.add(cli);
        	
        	// Adicionando um novo registro 
        	// Criando uma instância de Cliente
        	cli = new Cliente();
        	cli.setNome("Arthur");
        	cli.setSobrenome("Lucas");
        	cli.setDataNasc("2017-03-12");
        	cli.setGenero('m');
        	cli.setTelefone("(11) 91234-3456");
        	lista.add(cli);
        	
        	// Adicionando um novo registro 
        	// Criando uma instância de Cliente
        	cli = new Cliente();
        	cli.setNome("Alex");
        	cli.setSobrenome("Lucas");
        	cli.setDataNasc("2017-03-12");
        	cli.setGenero('f');
        	cli.setTelefone("(11) 91234-3456");
        	lista.add(cli);
        	
		}
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recepção do dados do REQUEST - Início
		// 1° Criar uma instância de cliente
		Cliente cli = new Cliente();
		
		
		// 2° Popular o cliente com os dados
		// getParameter(NomeDoCampo)
		cli.setNome(request.getParameter("txtNm"));
		cli.setSobrenome(request.getParameter("txtSnm"));
		cli.setDataNasc(request.getParameter("txtDtNasc"));
		cli.setGenero(request.getParameter("txtGen").charAt(0));
		cli.setTelefone(request.getParameter("txtTel"));
		
		// 3° Adicionando na lista
		lista.add(cli);
		
		// Recepção do dados do REQUEST - Fim
		/* 4° Adicionando a lista em um atributo no request
		 * utilizando o método setAttribute(nomeAtributo, Objeto)*/
		request.setAttribute("listaCliente", lista);
		
		// 5° Encaminhamento do REQUEST/RESPONSE - Início
		/* 5.1 Criar o Dispacher através da interface RequestDispacher,
		 * passando a URI/URL de destino*/
		RequestDispatcher rd = request.getRequestDispatcher("lista.jsp");
		
		// 5.2 Agora, utilizando o método forward, passamos o request e o response
		rd.forward(request, response);
		
	}

}
