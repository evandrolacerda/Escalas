/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escalas.DAO;
import br.com.escalas.connection.PostgresConnection;
import br.com.escalas.entidades.Pessoa;
/**
 *
 * @author evandro.lacerda
 */
public class PessoaDAO extends BaseDAO {

    private final PostgresConnection psConn;
    
    
    public PessoaDAO( Pessoa pessoa ) {
        this.psConn = new PostgresConnection();        
        //this.pessoa = pessoa;
        
        
    }
    
    
    
    
    
    
    
    
}
