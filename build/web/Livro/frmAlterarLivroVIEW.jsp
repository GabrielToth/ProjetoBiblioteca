<%-- 
    Document   : frmAlterarLivroVIEW
    Created on : 3 de out. de 2022, 22:00:51
    Author     : Ramon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="alterarLivro.jsp" method="POST">
           
           <label>Id do Livro</label> <br>
           <input type="text" name="id" value="<%=request.getParameter("id")%>">
           <br>
           <label>Nome do Livro</label> <br>
           <input type="text" name="nome" value="<%=request.getParameter("nome")%>">
           <br>
           <button type="submit">Alterar</button>
       </form>
    </body>
</html>
