/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escalas.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author evandro.lacerda
 */
public class PostgresConnection {

    private final String user;
    private final String host;
    private final String password;
    private final Integer port;
    private Connection conn = null;

    public PostgresConnection() {
        this.user = "sa_escalas";
        this.host = "127.0.0.1";
        this.password = "escalas2018";
        this.port = 5432;
    }

    public Connection getConnection() {
        try {

            if (null == this.conn) {
                conn = DriverManager.getConnection("jdbc:postgresql://localhost/escalas", this.user, this.password);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PostgresConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;

    }

}
