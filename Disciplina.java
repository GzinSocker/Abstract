/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Gabriel Mazzeu
 */
public class Disciplina {
    private int codigo;
    String nome;
    Professor prof;

    public Disciplina(){
        //Do nothing for while
    }
    
    public Disciplina(String n){
        nome = n;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
