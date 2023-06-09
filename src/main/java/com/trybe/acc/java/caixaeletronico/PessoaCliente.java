package com.trybe.acc.java.caixaeletronico;

import java.util.ArrayList;

/**Classe PessoaCliente. */
public class PessoaCliente {
  protected String nomeCompleto;
  private String cpf;
  private String senha;
  protected ArrayList<Conta> contas = new ArrayList<Conta>();
  
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
  
  public void adicionarConta(Conta conta) {
    this.contas.add(conta);
  }
  
  public int retornaNumeroDeContas() {
    return contas.size();
  }
  
  public boolean validarSenha(String senha) {
    return senha == this.senha && true;
  }

  public String getCpf() {
    return cpf;
  }
  
  public double retornarSaldoContaEspecifica(int indice) {
    return contas.get(indice).retornarSaldo(); 
  }
  
  public String retornarIdContaEspecifica(int indice) {
    return contas.get(indice).getIdConta();
  }
  
  public void retornarExtratoContaEspecifica(int indice) {
    contas.get(indice).retornarExtrato();
  }
  
  public void adicionarTransacaoContaEspecifica(int indice, double quantia, String descricao) {
    contas.get(indice).adicionarTransacao(quantia, descricao);
  }
  
  /**Método que retorna o resumo de contas. */
  public void retornarResumoContas() {
    for (Conta conta : contas) {
      System.out.println(conta.retornarResumoConta());
    }
  }
}
