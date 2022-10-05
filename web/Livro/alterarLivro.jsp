<%-- 
    Document   : alterarLivro
    Created on : 3 de out. de 2022, 22:02:14
    Author     : Ramon
--%>

<%@page import="br.com.DAO.LivroDAO"%>
<%@page import="br.com.DTO.LivroDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            try {
                LivroDTO objLivroDTO = new LivroDTO();
                objLivroDTO.setId_livro
                (Integer.parseInt(request.getParameter("id")));
                objLivroDTO.setNome_livro(request.getParameter("nome"));
                System.out.println(objLivroDTO.getNome_livro());
            
                LivroDAO objLivroDAO = new LivroDAO();
                objLivroDAO.AlterarLivro(objLivroDTO);
                out.print("<a href='listarLivro.jsp'> </a>");
                
            } catch (Exception e) {
                System.out.println("Erro no inserir");
            }
            
            
        %>
    </body>
</html>
