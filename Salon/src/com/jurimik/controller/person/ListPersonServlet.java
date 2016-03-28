package com.jurimik.controller.person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jurimik.constant.RequestParams;
import com.jurimik.model.person.Person;
import com.jurimik.service.PersonService;
import com.jurimik.util.Checker;
import com.jurimik.util.Parser;


@WebServlet(name = "ListPersonServlet", urlPatterns = "/listPerson")
public class ListPersonServlet extends HttpServlet {

	private static final long serialVersionUID = -3630001863098885288L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		try {
			boolean showClients = Parser.parseBoolean(RequestParams.CLIENTS);
			boolean showEmployees = Parser.parseBoolean(RequestParams.EMPLOYEES);
			
			for (Person person : PersonService.getAll()) {
				if (Checker.isPrint(person, showClients, showEmployees))
					writer.println(person.toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

	
}
