/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprograma;

/**
 *
 * @author pedro
 */
public class PrimeiroPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int idadeAluno = 25, idadeProfessor = 46, idadeTotal = (idadeAluno + idadeProfessor);
       String nomeAluno = "Pedro", nomeProfessor = "Raimundo";
       
       System.out.println("Idade do aluno " + nomeAluno + "(" + idadeAluno + ") + a idade do professor " + nomeProfessor + 
                "(" + idadeProfessor + ") é igual a " + idadeTotal);
    }
    
}
