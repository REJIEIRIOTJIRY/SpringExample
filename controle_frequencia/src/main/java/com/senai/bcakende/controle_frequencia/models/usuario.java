package com.senai.bcakende.controle_frequencia.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
   
   @Column(name = "data_nascimento ")
   private LocalDate datanascimento;

   public usuario(Integer id, String nome, LocalDate datanascimento) {
    this.id = id;
    this.nome = nome;
    this.datanascimento = datanascimento;
   }
  //construtor
   public usuario() {
   }
   public Integer getId() {
    return id;
   }
   public void setId(Integer id) {
    this.id = id;
   }
   public String getNome() {
    return nome;
   }
   public void setNome(String nome) {
    this.nome = nome;
   }
   public LocalDate getDatanascimento() {
    return datanascimento;
   }
   public void setDatanascimento(LocalDate datanascimento) {
    this.datanascimento = datanascimento;
   } 


   
     
   


}
