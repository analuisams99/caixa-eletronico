package com.trybe.acc.java.caixaeletronico;

import java.util.ArrayList;
import java.util.Random;

/**Classe Banco. */
public class Banco {
  private ArrayList<PessoaCliente> pessoasClientes = new ArrayList<PessoaCliente>();
  private ArrayList<Conta> contas = new ArrayList<Conta>();
  public static String novaConta = "";
  
  /**Método de gerar numero, de uma nova conta, de 10 digitos. */
  public String gerarNumeroNovaConta() {
    gerarNumerosAleatorios();
    for (Conta conta : contas) {
      if (novaConta == "  ") {
        gerarNumerosAleatorios();
        break;
      } 
    }
    return novaConta;
  }
  
  private static void gerarNumerosAleatorios() {
    Random random = new Random();
    for (int i = 0; i < 10; i += 1) {
      int numeroAleatorio = random.nextInt(10);
      novaConta += Integer.toString(numeroAleatorio);
    }
  }
}
