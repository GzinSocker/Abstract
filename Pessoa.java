/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

/**
 *
 * @author Gabriel Mazzeu
 */
public abstract class Pessoa {
    protected int id;
    protected String nome;
    Random rand = new Random();

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = rand.nextInt(1999999)+1000001;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void setMatricula(int matricula);
    public abstract int getMatricula();
    
    
}
