/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model.dao;

import biblioteca.model.bean.Livros;
import conexaoDb.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author skynn
 */
public class LivrosDao {
    private ConexaoDb conexao;
    private Connection c;
    
    public LivrosDao(){
        this.conexao = new ConexaoDb();
        this.c = this.conexao.getConexao();
    }
    
    public void inserir(Livros livro){
        
        String sql = "INSERT INTO livros(ISBN, Titulo, Situacao) VALUES " 
                + "(?, ?, ?)";
        
        try {
            PreparedStatement stmt = this.c.prepareStatement(sql);
            stmt.setString(1, livro.getISBN());
            stmt.setString(2, livro.getTitulo());
            stmt.setString(3, livro.getSituacao());
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println("Erro ao inserir livro: " + e.getMessage()); 
        }
        
    }
}
