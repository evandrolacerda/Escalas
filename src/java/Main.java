
import br.com.escalas.connection.PostgresConnection;
import br.com.escalas.entidades.Entidade;
import br.com.escalas.entidades.Insertable;
import br.com.escalas.entidades.Pessoa;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author evandro.lacerda
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Testando Conexão com o DB");
        PostgresConnection pgconn = new PostgresConnection();

        Connection conn = pgconn.getConnection();
        Entidade entidade = new Pessoa();

        System.out.println(  );
        
        
        

        try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO turnos(turno, sigla) VALUES('MANHÃ', 'MA') ");
            pstm.execute();

            System.out.println("Inserido com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
