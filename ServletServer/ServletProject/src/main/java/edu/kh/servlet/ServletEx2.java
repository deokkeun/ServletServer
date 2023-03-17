package edu.kh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String coffee = req.getParameter("coffee");
		String drink = req.getParameter("drink");
		String[] opt = req.getParameterValues("opt");
		String takeInTakeOut = req.getParameter("takeInTakeOut");
		
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		out.print(coffee + drink + takeInTakeOut);
		
		if(opt != null) {
			
			String temp = "";
			for(String o : opt) {
				switch(o) {
				case "shot1" : temp = "1shot 추가"; break;
				case "shot2" :  temp = "2shot 추가"; break;
				case "softly" :  temp = "softly 하게"; break;
				}
				out.print(temp + "를 추가합니다");
			}
			
		}
	}
}
