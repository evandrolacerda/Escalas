/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escalas.DAO;

import br.com.escalas.entidades.Entidade;
import br.com.escalas.entidades.Insertable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author evandro.lacerda
 */
class BaseDAO {
    private Entidade entidade;
    
    
    public List getEntidadeAttributes()
    {
        List<Field> atributos = new ArrayList<>();
        
        Class<? extends Entidade>classe = entidade.getClass();
        
        for (Field atributo : classe.getDeclaredFields()) {
            
            if( atributo.isAnnotationPresent(Insertable.class))
            {
                atributos.add(atributo);
            }
        }
        
        return atributos;
    }
    
    public Boolean insere( List<>)
    {
        
        
        
        //String query = "INSERT INTO " + this.table +" (%s) VALUES(%s)";
        
        
        return true;
    }
}
