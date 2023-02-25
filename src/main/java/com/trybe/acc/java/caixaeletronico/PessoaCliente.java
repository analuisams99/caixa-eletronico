package com.trybe.acc.java.caixaeletronico;

import java.util.ArrayList;

/**Classe PessoaCliente. */
public class PessoaCliente {
  private String nomeCompleto;
  private String cpf;
  private String senha;
  private ArrayList<Conta> contas = new ArrayList<Conta>();
  
  /**Método construtor que imprime no console que uma nova pessoa cliente foi criada. */
  public PessoaCliente(String nome, String cpf, String senha) {
    nomeCompleto = nome;
    this.cpf = cpf;
    this.senha = senha;
    
    System.out.println("Nova pessoa cliente " + nomeCompleto + " com CPF: " + cpf + " criada!");
  }
  
  @Override
  public String toString() {
    return "Nova pessoa cliente " + nomeCompleto + " com CPF: " + cpf + " criada!";
  }

  public String getCpf() {
    return cpf;
  }
  
}
