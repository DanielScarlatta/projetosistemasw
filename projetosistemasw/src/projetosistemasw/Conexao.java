
package projetosistemasw;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author danie
 */
//conecta-se ao banco de dados inserido
public class Conexao {
    public Connection getConnection(){
        System.out.println("Tentando conexão com BD");
        try {
            return
                DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_sw","daniel","admin123");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
 
        }    
    }
}
