<%--
  Created by IntelliJ IDEA.
  User: junwon
  Date: 2023/11/20
  Time: 9:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@page import="com.example.dao.BoardDAO, com.example.bean.BoardVO"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    BoardDAO boardDAO = new BoardDAO();
    String id=request.getParameter("id");
    BoardVO u=boardDAO.getBoard(Integer.parseInt(id));
%>

<h1>가수: <%=u.getWriter()%> </br>
    노래 제목: <%=u.getTitle()%> </br>
노래 길이: <%=u.getContent()%></br>
    분류: <%=u.getCategory()%>
</h1>
</body>
</html>
