package com.example.exerciciofixacaoset;

import com.example.exerciciofixacaoset.entities.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/*Em um portal de cursos, online, cada usuario possui um código unico, representado por um numero inteiro.*
Cada instrutor no portal pode ter varios cursos, sendo que um mesmo aluno pode se matricular em quantos cursos
quiser. Assim, o numero total de alunos, de um instrutor não é simplesmente a soma dos alunos de todos os cursos que ele
possui, opis pode haver alunos repetidos em mais de um curso.

O instrutor Alex possui tres cursos A,B, C e deseja saber seu numero total de alunos.

Seu programa deve ler os alunos dos cursos A,B e C, do instrutor Alex, depois mostrar a quantidade total de alunos dele.
 */
@SpringBootApplication
public class ExercicioFixacaoSetApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //criando meu set, usando o HashSet, pois não precisa ordenar a lista, então usamos o mais rapido.
        Set<Aluno> aluno = new HashSet<>();

        //Incluindo alunos do Curso A
        System.out.print("Quantos alunos tem no curso A: ");
        int a = sc.nextInt();

        for(int i = 0; i<a; i++){
            System.out.print("Digite o ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            aluno.add(new Aluno("A", id, nome));
        }

        //Incluindo alunos do Curso B
        System.out.print("Quantos alunos tem no curso B: ");
        int b = sc.nextInt();

        for(int i = 0; i<b; i++){
            System.out.print("Digite o ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            aluno.add(new Aluno("B", id, nome));
        }

        //Incluindo alunos do curso C
        System.out.print("Quantos alunos tem no curso C: ");
        int c = sc.nextInt();

        for(int i = 0; i<c; i++){
            System.out.print("Digite o ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            aluno.add(new Aluno("C", id, nome));
        }

        //imprimindo tamanho do meu set.
        System.out.println("Total de aluno do curso: " + aluno.size());
        sc.close();
    }

}
