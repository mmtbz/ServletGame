<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>The Number Quiz</h1>

<h3> Your current score is ${score }</h3>

<h3>Guess the next number in the sequence</h3>

<h3> ${question }</h3>

<input type="text" name="ans">
<input type="hidden" name="realAns" value="${realAns }">
<input type="submit" value="Submit">
</body>
</html>