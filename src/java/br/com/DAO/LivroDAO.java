package br.com.DAO;

import br.com.DTO.LivroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LivroDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<LivroDTO> lista = new ArrayList<>();
    
    public void CadastrarLivro(LivroDTO objLivroDTO) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO livro (nome_livro) VALUES (?)";
        //String sql = "insert into livro (nome_livro, qnt_pag, sla) values (?,?,?)"; etc..
        con = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getNome_livro());
            //Se fosse int usaria setInt, setDouble, etc...
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            System.out.println("Erro no DAO");
        }
    }
    
    public ArrayList<LivroDTO> PesquisarLivro() throws ClassNotFoundException {
        String sql = "SELECT * FROM  livro";
        con = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            
            while (rs.next()) {
                LivroDTO objLivroDTO = new LivroDTO();
                objLivroDTO.setId_livro(rs.getInt("id_livro"));
                objLivroDTO.setNome_livro(rs.getString("nome_livro"));
                
                lista.add(objLivroDTO);
                
            }
            
        } catch (SQLException e) {
            System.out.println("Erro de listar em consulta DB");
        }
        
        return lista;
    }
    
    public void ExcluirLivro(LivroDTO objLivroDTO) throws ClassNotFoundException, SQLException {
        String sql = "delete from livro where id_livro = ?";
        //String sql = "insert into livro {nome_livro, qnt_pag, sla} values {?,?,?}"; etc..
        con = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, objLivroDTO.getId_livro());
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            System.out.println("Erro no DAO");
        }
    }
    
    public void AlterarLivro(LivroDTO objLivroDTO) throws ClassNotFoundException, SQLException {
        String sql = "update livro set nome_livro = ? where id_livro = ?";
        //String sql = "insert into livro {nome_livro, qnt_pag, sla} values {?,?,?}"; etc..
        con = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getNome_livro());
            pstm.setInt(2, objLivroDTO.getId_livro());
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            System.out.println("Erro no DAO");
        }
    }
}
