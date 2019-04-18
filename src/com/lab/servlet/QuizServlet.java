package com.lab.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lab.business.QuizBusiness;

@WebServlet("/quiz")
public class QuizServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int n = QuizBusiness.getRandom();

		String question = QuizBusiness.getQuestion(n);
		// System.out.println("Random+ " + n);
		int realAns = QuizBusiness.getAnswer(n);

		req.setAttribute("question", question);
		//req.setAttribute("score", 0);
		req.setAttribute("realAns", realAns);

		req.getRequestDispatcher("WEB-INF/jsp/quiz.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ans = req.getParameter("ans");
		
		int score = Integer.parseInt((req.getParameter("score")));
		int realAns = Integer.parseInt((req.getParameter("realAns")));
		if("".equals(ans)) {
			int userAns = Integer.parseInt(ans);
			System.out.println("real ans = "+ realAns + "userAns = "+ userAns);
			if(realAns == userAns) {
				score += 1;
			}
		}
		
		req.setAttribute("score", score);
		
		req.getRequestDispatcher("WEB-INF/jsp/quiz.jsp").forward(req, resp);
	}

}
