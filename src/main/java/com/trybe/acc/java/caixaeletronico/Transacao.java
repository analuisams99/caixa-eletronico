package com.trybe.acc.java.caixaeletronico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    instante = retornarInstante();
  }

  public double getQuantia() {
    return quantia;
  }
  
  public String retornarInstante() {
    LocalDateTime dataHoraAgora = LocalDateTime.now();
    return dataHoraAgora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
  }
  
  /**Método que retorna o resumo da Transação. */
  public String retornarResumoTransacao() {
    return "Foi feita a transação na quantia de " + quantia + "\n" 
        + ". Com a descrição: " + descricao + ". \n" 
        + "Na data: " + instante;
  }
}
