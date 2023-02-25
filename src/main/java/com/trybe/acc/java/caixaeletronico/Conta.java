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
  
  public void adicionarTransacao(double quantia, String descricao) {
    Transacao novaTransacao = new Transacao(quantia, descricao);
    transacoes.add(novaTransacao);
  }
  
  /**Método que retorna o saldo da conta. */
  public double retornarSaldo() {
    double saldo = 0;
    for (Transacao transacao : transacoes) {
      saldo += transacao.getQuantia();
    }
    return saldo;
  }
}