<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Student Name</title>
<style>
    /* Reset default margin and padding */
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: Arial, sans-serif;
    }

    /* Center content in the body */
    body {
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
        background-color: #f4f4f9;
    }

    /* Style for the headings */
    h1 {
        color: #333;
        font-size: 2em;
        margin: 10px 0;
        text-align: center;
    }

    /* Styling for the different student name outputs */
    h1:first-of-type {
        color: #4CAF50;
    }

    h1:last-of-type {
        color: #008CBA;
    }
</style>
</head>
<body>
<h1>Student name is : ${param.studentname}</h1>
<h1>Student name is : ${mname}</h1>
</body>
</html>
