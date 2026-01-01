/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
    private static Connection conn;
    public static Connection getConnection(){
        try{
            if (conn == null){
                String url = "jdbc:mysql://localhost:3306/rental_mobil?useSSL=false&serverTimezone=UTC";
                String user = "root";
                String pass = "";
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, pass);
            }
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
            conn = null;
        }
        return conn;
    }
    
}
