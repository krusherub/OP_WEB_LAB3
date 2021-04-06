<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06.04.2021
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lab5</title>
    <style>
        table {
            table-layout: fixed; /* Фиксированная ширина ячеек */
            width: 35%; /* Ширина таблицы */
            text-align: center;
        }
    </style>
</head>
<body>

<form action="CalculateServlet" method="post">
    <p>
        <input name="equation" type="radio" value="1">
        <image src = "images/Screenshot_1.png"/>

        <input name="equation" type="radio" value="2">
        <image src = "images/Screenshot_2.png"/>

        <input name="equation" type="radio" value="3">
        <image src = "images/Screenshot_3.png"/>
    </p>
    a: from <input type="text" name="from_a" value=""/> to <input type="text" name="to_a" value=""/> step <input type="text" name="step_a" value=""/> <br>
    b: from <input type="text" name="from_b" value=""/> to <input type="text" name="to_b" value=""/> step <input type="text" name="step_b" value=""/> <br>
    c: from <input type="text" name="from_c" value=""/> to <input type="text" name="to_c" value=""/> step <input type="text" name="step_c" value=""/> <br>
    d: from <input type="text" name="from_d" value=""/> to <input type="text" name="to_d" value=""/> step <input type="text" name="step_d" value=""/> <br>
    <input type="submit" value="Calculate"/><br>
</form>


${res}


</body>
</html>
