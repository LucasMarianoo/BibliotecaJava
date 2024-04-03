/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoDb;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author skynn
 */
public class ConexaoDb {
    
    public Connection getConexao()
    {
        try {
            Connection c = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/biblioteca?serverTimezone=UTC",
            "root",
            ""
            );
            return c;
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco" + e.getMessage());
            return null;
        }
    }
}
