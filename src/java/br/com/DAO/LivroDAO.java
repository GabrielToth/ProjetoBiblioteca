package br.com.DAO;

import br.com.DTO.LivroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class LivroDAO {
    Connection con;
    PreparedStatement pstm;
    
    public void CadastrarLivro(LivroDTO objLivroDTO) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO livro (nome_livro) VALUES (?)";
        //String sql = "insert into livro {nome_livro, qnt_pag, sla} values {?,?,?}"; etc..
        con = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getNome_livro());
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            System.out.println("Erro no DAO");
        }
    }
    
    public ArrayList<LivroDTO> PesquisarLivro() {}
    
    
}
