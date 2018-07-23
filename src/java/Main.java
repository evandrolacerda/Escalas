
import br.com.escalas.DAO.PessoaDAO;
import br.com.escalas.connection.PostgresConnection;
import br.com.escalas.entidades.Pessoa;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

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
        

        System.out.println(  );
        
        Pessoa evandro = new Pessoa();
        
        evandro.setAtivo( Pessoa.ATIVO_SIM );
        evandro.setEmail("evandro@teste.com");
        evandro.setSexo("M");
        evandro.setNome("Evandro Lacerda");
        evandro.setId_turno(1);
        
        
        PessoaDAO pessoaDao = new PessoaDAO(evandro);
        List<Object> values = new ArrayList();
        
        
        values.add( evandro.getNome() );
        values.add( evandro.getEmail() );
        values.add( evandro.getAtivo() );
        values.add( evandro.getSexo() );
        values.add( evandro.getId_turno() );
        
        
        pessoaDao.insere( values );
        
        
        
        
        

    }

}
