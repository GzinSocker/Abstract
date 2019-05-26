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
public class Professor extends Pessoa {
    private int matricula;
    Disciplina dis ;
    
    public Professor(){
        //Do nothing for while
    }
    
    public Professor(String n){
        setNome(n);
        setId();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Disciplina getDis() {
        return dis;
    }

    public void setDis(Disciplina dis) {
        this.dis = dis;
        dis.prof=this;
    }
    
    
    
}
