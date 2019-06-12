package barestoque.DAO;

import java.sql.Connection;
import java.sql.DriverManager;


public class FabricaConexao {
    String servidor = "jdbc:mysql://localhost:3306/barestoque?useTimezone=true&serverTimezone=UTC";
    String usuario = "root";
    String senha = "senhadobanco"/*coloquem a senha do banco de vocês aqui*/;
    String driver = "com.mysql.jdbc.Driver";
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            return (Connection)DriverManager.getConnection(servidor, usuario, senha);
        } catch (Exception e) {
            System.err.println("Erro: "+e.getMessage());
        }
        return null;
    }
}
