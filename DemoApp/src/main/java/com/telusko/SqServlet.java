package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
	
		String k="";
		int pass=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("k")) {
				k+=c.getValue();
			}
			else if(c.getName().equals("j")) {
				pass+=Integer.parseInt(c.getValue());
			}
		}
		PrintWriter out =res.getWriter();
		if(k.equals("selva170303@gmail.com") && pass==170303) {
			out.println("Yes ur logged in");
		}
		else {
			out.println("ur email or password is wrong");
		}
		
		
		 
	}
 	

}

