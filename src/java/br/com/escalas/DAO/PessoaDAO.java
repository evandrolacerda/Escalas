/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escalas.DAO;
import br.com.escalas.connection.PostgresConnection;
import br.com.escalas.entidades.Entidade;
import br.com.escalas.entidades.Pessoa;
/**
 *
 * @author evandro.lacerda
 */
public class PessoaDAO extends BaseDAO {

    
    private final String table;
    private final Entidade entidade;
    
    
    
    public PessoaDAO( Pessoa pessoa ) {
              
        this.table = "pessoas";
        this.entidade = pessoa;
        
        
    }

    @Override
    public String getTable() {
        return this.table;
    }

    @Override
    public Entidade getEntidade() {
        return this.entidade;
    }
    
    
    
    
}
