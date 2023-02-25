package com.trybe.acc.java.caixaeletronico;

import java.util.ArrayList;

/**Classe Conta. */
public class Conta {
  protected String tipoConta;
  private String idConta;
  private PessoaCliente pessoaCliente;
  protected ArrayList<Transacao> transacoes = new ArrayList<Transacao>();
  
  /**Método construtor da classe Conta. */
  public Conta(String tipoConta, PessoaCliente pessoaCliente, Banco banco) {
    this.tipoConta = tipoConta;
    this.pessoaCliente = pessoaCliente;
    this.idConta = banco.gerarNumeroNovaConta();
  }

  public String getIdConta() {
    return idConta;
  }

  public PessoaCliente getPessoaCliente() {
    return pessoaCliente;
  }
}