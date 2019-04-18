package com.lab.business;

import java.util.Random;

public class QuizBusiness {

	private static String[] questions = { "3, 1, 4, 1, 5", // pi
			"1, 1, 2, 3, 5", // fibonacci
			"1, 4, 9, 16, 25", // squares
			"2, 3, 5, 7, 11", // primes
			"1, 2, 4, 8, 16" // powers of 2
	};

	private static int[] answers = { 9, 8, 36, 13, 32 };

	public static int getRandom() {
		int size = questions.length;
		Random r = new Random();

		return r.nextInt(size);
	}

	public static String getQuestion(int qn) {
		return questions[qn];
	}

	public static int getAnswer(int qn) {
		return answers[qn];
	}
}
