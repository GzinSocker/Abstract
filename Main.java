/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriel Mazzeu
 */
public class Main {
    public static void main(String[] args){
        Aluno[] aluno = new Aluno[10];
        Scanner ent = new Scanner(System.in);
        Random rand = new Random();
        Disciplina lp2 = new Disciplina("LPII");
        
        for(int i=0;i<10;i++){
            aluno[i] = new Aluno(rand.nextInt(1999999)+1000001);
            System.out.print("Nome do aluno "+(i+1)+": ");
            aluno[i].setNome(ent.nextLine());
            aluno[i].setDisciplina(lp2);
        }
        
        Professor ze = new Professor("Ze Wilson");
        ze.setMatricula(rand.nextInt(1999999)+1000001);
        ze.setDis(lp2);
        
        for(int i=0;i<10;i++){
            System.out.println("Aluno "+(i+1)+": "+aluno[i].getNome()+"\tIdentidade: "+aluno[i].getId()+"\tMatricula: "+aluno[i].getMatricula()+"\tDisciplina: "+aluno[i].getDisciplina().getNome());
        }
        System.out.println("Professor: "+ze.getNome()+"\tIdentidade: "+ze.getId()+"\tMatricula: "+ze.getMatricula()+"\tDisciplina: "+ze.getDis().getNome());
    }
}
