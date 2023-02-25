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
  
  /**Método que retorna o resumo da Conta. */
  public String retornarResumoConta() {
    String mensagemResumo = "Pessoa não tem conta";
    String mensagemComplementar = "";
    int index = 0;
    if (pessoaCliente.contas.size() > 0) {
      mensagemResumo = "Resumo das Contas da pessoa " + pessoaCliente.nomeCompleto + ":\n";
      for (Conta conta : pessoaCliente.contas) {
        mensagemComplementar += "\n"
                + (index += 1) + ") " + conta.idConta + " : " + "R$" 
                + conta.retornarSaldo() + " : " + conta.tipoConta + "\n"
                + "\n";
      }
    }
    return mensagemResumo + mensagemComplementar;
  }
  
  /**Método que imprime no console o extrato. */
  public void retornarExtrato() {
    String mensagem = "Extrato da conta" + getIdConta() + "\n";
    String mensagemResumoTransacao = "";
    for (Transacao transacao : transacoes) {
      mensagemResumoTransacao = "\n" + transacao.retornarResumoTransacao() + "\n";
    }
    System.out.println(mensagem + mensagemResumoTransacao);
  }
}