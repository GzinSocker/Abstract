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
public class Aluno extends Pessoa {
    Disciplina[] dis = new Disciplina[5];
    private int matricula, i=0;
    
    
    public Aluno(int num){
        setMatricula(num);
        setId();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void setDisciplina(Disciplina d){
        dis[i] = d;
        i++;
    }
    
    public Disciplina getDisciplina(){
        return dis[i-1];
    }
}
