package br.com.bank.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bank.model.Client;
import br.com.bank.service.ClientServiceImpl;

@WebServlet("/clientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ClientServiceImpl service;
	private List<Client> clientes;
	
	
	public ClientServlet() {
		this.service = new ClientServiceImpl();
		this.clientes = new ArrayList<Client>();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Response to client").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//PEGA OS DADOS DO REQUEST
		String name  = request.getParameter("name"); 
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		//MONTEI O MEU OBJETO CLIENT
		Client client = new Client();
		client.setName(name);
		client.setEmail(email);
		client.setPhone(phone);
		
		//SALVAR O MEU CLIENT
		this.service.save(client);

		
		RequestDispatcher rd = request.getRequestDispatcher("successuser.jsp");
		request.setAttribute("user",email);
		rd.forward(request, response);
		
		
	}

}
