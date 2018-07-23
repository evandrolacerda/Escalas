/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escalas.entidades;


/**
 *
 * @author evandro.lacerda
 */
public class Pessoa implements Entidade{
    
    public static final boolean ATIVO_SIM = true;
    public static final boolean ATIVO_NAO = false;
    
    @Insertable
    private String nome;
    private Integer id;
    @Insertable
    private String email;
    @Insertable
    private Boolean ativo;
    @Insertable
    private String sexo;
    @Insertable
    private Integer id_turno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getId_turno() {
        return id_turno;
    }

    public void setId_turno(Integer id_turno) {
        this.id_turno = id_turno;
    }
    
    
}
