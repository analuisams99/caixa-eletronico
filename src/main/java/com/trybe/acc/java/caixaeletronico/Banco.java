package com.trybe.acc.java.caixaeletronico;

import java.util.ArrayList;
import java.util.Random;

/**Classe Banco. */
public class Banco {
  protected ArrayList<PessoaCliente> pessoasClientes = new ArrayList<PessoaCliente>();
  private ArrayList<Conta> contas = new ArrayList<Conta>();
  protected static String novoIdConta = "";
  
  /**Método que gera 10 números aleatórios e os concatena no atributo novaConta. */
  private static void gerarNumerosAleatorios() {
    novoIdConta = "";
    Random random = new Random();
    for (int i = 0; i < 10; i += 1) {
      int numeroAleatorio = random.nextInt(10);
      novoIdConta += Integer.toString(numeroAleatorio);
    }
  }

  /**
   *  Método que verifica se a conta existe no array de contas
   *  e, se não existir, gera uma nova conta de 10 digitos. 
  */
  public String gerarNumeroNovaConta() {
    gerarNumerosAleatorios();
    for (Conta conta : contas) {
      if (novoIdConta == conta.getIdConta()) {
        gerarNumerosAleatorios();
        break;
      } 
    }
    return novoIdConta;
  }
  
  /**Método que adiciona uma nova pessoa cliente no array do atributo pessoasClientes. */
  public PessoaCliente adicionarPessoaCliente(String nome, String cpf, String senha) {
    PessoaCliente cliente = new PessoaCliente(nome, cpf, senha);
    pessoasClientes.add(cliente);
    return cliente;
  }
  
  public void adicionarConta(Conta conta) {
    contas.add(conta);
  }
  
  /**Método que valida cpf e senha da pessoa cliente. */
  public PessoaCliente pessoaClienteLogin(String cpf, String senha) {
    PessoaCliente pessoaCliente = null;
    for (PessoaCliente pessoa : pessoasClientes) {
      if (pessoa.getCpf() == cpf && pessoa.validarSenha(senha)) {
        pessoaCliente = pessoa;
        break;
      }
    }
    return pessoaCliente;
  }
  
  public void depositar(PessoaCliente pessoaCliente, int paraConta, double quantia) {
    pessoaCliente.adicionarTransacaoContaEspecifica(
        paraConta, quantia, "Deposito realizado com sucesso!");
  }
  
  public void sacar(PessoaCliente pessoaCliente, int daConta, double quantia) {
    pessoaCliente.adicionarTransacaoContaEspecifica(
        daConta, -quantia, "Saque realizado com sucesso!");
  }
  
  /**Método de transferir fundos. */
  public void transferirFundos(
      PessoaCliente pessoaCliente, int daConta, int paraConta, double quantia) {

    pessoaCliente.adicionarTransacaoContaEspecifica(
        daConta, -quantia, "Transferencia realizado com sucesso!");
    pessoaCliente.adicionarTransacaoContaEspecifica(
        paraConta, quantia, "Transferencia recebida com sucesso!");
  }
  
  public void mostrarExtrato(PessoaCliente pessoaCliente, int conta) {
    pessoaCliente.retornarExtratoContaEspecifica(conta);
  }
}
