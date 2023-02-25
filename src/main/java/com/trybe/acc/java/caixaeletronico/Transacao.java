package com.trybe.acc.java.caixaeletronico;

/**Classe Transacao. */
public class Transacao {
  private double quantia;
  private String instante;
  protected String descricao;
  private Conta conta;
  
  /**Método construtor da classe Transacao. */
  public Transacao(double quantia, String descricao) {
    this.quantia = quantia;
    this.descricao = descricao;
  }
}
