<%--
    Document   : inserirLivro
    Created on : 03/10/2022 13:10
    Author     : toth
--%>

<%@page import="br.com.DAO.LivroDAO"%>
<%@page import="br.com.DTO.LivroDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            try {
                LivroDTO objLivroDTO = new LivroDTO();
                objLivroDTO.setNome_livro(request.getParameter("nome"));
                System.out.println(objLivroDTO.getNome_livro());
            
                LivroDAO objLivroDAO = new LivroDAO();
                objLivroDAO.CadastrarLivro(objLivroDTO);
            } catch (Exception e) {
                System.out.println("Erro no inserir");
            }
            
            
        %>
        
    </body>
</html>