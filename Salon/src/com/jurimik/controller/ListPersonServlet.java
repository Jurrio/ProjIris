package com.jurimik.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jurimik.model.person.Person;
import com.jurimik.service.PersonService;

@WebServlet(name = "ListPersonServlet", urlPatterns = "/listPerson")
public class ListPersonServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		try {
			 for (Person person : PersonService.getAll()) {
				 writer.println(person.toString());
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

}
