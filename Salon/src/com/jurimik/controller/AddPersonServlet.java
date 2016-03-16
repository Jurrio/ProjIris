package com.jurimik.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jurimik.builder.PersonBuilder;
import com.jurimik.constant.RequestParams;
import com.jurimik.constant.ServletMessage;
import com.jurimik.model.person.Person;
import com.jurimik.service.PersonService;
import com.jurimik.util.Parser;

@WebServlet(name = "AddPersonServlet", urlPatterns = "/addPerson")
public class AddPersonServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
	//	try {
			String role = req.getParameter(RequestParams.TYPE);
			String firstName = req.getParameter(RequestParams.FIRST_NAME);
			String lastName = req.getParameter(RequestParams.LAST_NAME);
			String phone = req.getParameter(RequestParams.PHONE);
			boolean haveCard = Parser.parseBoolean(RequestParams.IS_HAVE_CARD);
			String cardNumber = req.getParameter(RequestParams.AVAILABILITY_CARD);
			Person person = new PersonBuilder(role, firstName, lastName).phone(phone).card(cardNumber).build();
			if (PersonService.add(person)) 
				writer.println(ServletMessage.AddSuccess);
			else
				writer.println(ServletMessage.AddCrush);
//		} catch (Exception ex) {
	//		writer.println(ex.getStackTrace().toString());
		//}
		
	}
	
	
}
