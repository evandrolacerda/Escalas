/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escalas.DAO;

import br.com.escalas.connection.PostgresConnection;
import br.com.escalas.entidades.Entidade;
import br.com.escalas.entidades.Insertable;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author evandro.lacerda
 */
abstract class BaseDAO {

    private final Connection connection;

    public BaseDAO() {
        PostgresConnection pconn = new PostgresConnection();

        this.connection = pconn.getConnection();
    }

    public List getEntidadeAttributes() {
        List<Field> atributos = new ArrayList<>();

        Class<? extends Entidade> classe = this.getEntidade().getClass();

        for (Field atributo : classe.getDeclaredFields()) {

            if (atributo.isAnnotationPresent(Insertable.class)) {
                atributos.add(atributo);
            }
        }

        return atributos;
    }

    public abstract String getTable();

    public abstract Entidade getEntidade();

    public Boolean insere(List<Object> values) {

        boolean result = false;
        
        String query = "INSERT INTO " + this.getTable() + " (";

        List<Field> campos = this.getEntidadeAttributes();

        for (Field campo : campos) {
            query += " " + campo.getName() + ",";
        }

        query = query.substring(0, query.length() - 1);

        query += " ) VALUES ( ";

        for (Object value : values) {
            query += "?" + " ,";
        }

        query = query.substring(0, query.length() - 1) + ")";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(query);

            for ( int x = 0; x < values.size() ; x++ ) {
                stmt.setObject(x + 1, values.get(x));
            }
            
            //String exex = stmt.toString();
            
            result = stmt.execute();
            //System.out.println("Query = " + exex );

        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return result;
        
        
        
    }
}
