package br.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public Connection conexaoDB() throws ClassNotFoundException {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sistemabiblioteca?user=root&password=";
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Erro na conexao");
        }
        
        return con;
    }
}
