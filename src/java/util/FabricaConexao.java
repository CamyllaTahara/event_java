/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sergio
 */
public class FabricaConexao {
    private static Connection conexao;

    public static Connection getConexao() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/umc";
        String user = "root";
        String pass = "";
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, user, pass);
        return conexao;
    }
}
