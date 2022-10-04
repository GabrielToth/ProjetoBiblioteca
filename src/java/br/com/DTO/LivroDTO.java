package br.com.DTO;

public class LivroDTO {
    private int id_livro;
    private String nome_livro;
    
    public void setId_livro (int id_livro) {
        this.id_livro = id_livro;
    }
    
    public int getId_livro() {
        return id_livro;
    }
    
    public void setNome_livro (String nome_livro) {
        this.nome_livro = nome_livro;
    }
    
    public String getNome_livro () {
        return nome_livro;
    }
}