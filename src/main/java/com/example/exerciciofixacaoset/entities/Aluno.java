package com.example.exerciciofixacaoset.entities;

import java.util.Objects;

public class Aluno extends Curso{
    private Integer id;
    private String nome;

    public Aluno(String curso, Integer id, String nome) {
        super(curso);
        this.id = id;
        this.nome = nome;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getId(), aluno.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    @Override
    public String toString(){
        return "Curso: " + getCurso() + ", id: " + id + ", nome: " + nome;
    }
}
