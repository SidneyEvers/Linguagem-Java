package Poo;

import java.util.Scanner;

public class ExercicioPoo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Crie um programa que receba nome e 3 notas de 3 alunos, então mostre na tela o nome do aluno com a maior média. 

        Aluno[] alunos = new Aluno[3];
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
        }

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Insira o nome e as notas do "+(i+1)+"º aluno");

            alunos[i].setNome(scan.nextLine());
            alunos[i].setNotas(new Double[3]);

            System.out.println("Insira as 3 notas");
            for (int j = 0; j < alunos[i].getNotas().length; j++) {
                alunos[i].SetNota(j,scan.nextDouble());
            }
            scan.nextLine();
        }

        for(Aluno aluno : alunos){
            System.out.println(aluno.getNome());
            System.out.println(aluno.GetMedia());
            System.out.println("------------");
        }
        scan.close();
    }
    
}
