package com.jurimik.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jurimik.constant.RequestParams;
import com.jurimik.model.person.Client;
import com.jurimik.model.person.Employee;
import com.jurimik.model.person.Person;
import com.jurimik.service.PersonService;
import com.jurimik.util.Parser;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@WebServlet(name = "ListPersonServlet", urlPatterns = "/listPerson")
public class ListPersonServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		try {
			boolean showClients = Parser.parseBoolean(RequestParams.CLIENTS);
			boolean showEmployees = Parser.parseBoolean(RequestParams.EMPLOYEES);
			
			for (Person person : PersonService.getAll()) {
				if (person instanceof Client && showClients) 
					writer.println(person.toString());
				if (person instanceof Employee && showEmployees) {
					writer.println(person.toString());
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

}
