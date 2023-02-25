package com.trybe.acc.java.caixaeletronico;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste da classe Conta")
class ContaTest {

  @Test
  @DisplayName("6 - Testa o construtor da classe conta.")
  void construtorTest() {
    Conta conta = new Conta("Poupança", new PessoaCliente("Cliente Teste", "12345678901", "=senha1="), new Banco());
    assertEquals("Poupança", conta.tipoConta);
    assertEquals("12345678901", conta.getPessoaCliente().getCpf());
  }

  @Test
  @DisplayName("7 - Testa o método adicionar transação e retornar saldo da conta.")
  void adicionarTransacaoTestRetornarSaldoTest() {
    Conta conta = new Conta("Poupança", new PessoaCliente("Cliente Teste", "12345678901", "=senha1="), new Banco());
    conta.adicionarTransacao(3000, "Transação recebida com sucesso!");
    conta.adicionarTransacao(-500, "Saque feito com sucesso!");
    assertEquals(2500, conta.retornarSaldo());
  }

  @Test
  @DisplayName("8 - Testa o método retornar resumo está retornando uma string com os valores corretamente.")
  void retornarResumoContaTest() {
    PessoaCliente pessoaCliente = new PessoaCliente("Cliente Teste", "12345678901", "=senha1=");
    Conta conta = new Conta("Poupança", pessoaCliente, new Banco());
    conta.adicionarTransacao(3000, "Transação recebida com sucesso!");
    pessoaCliente.adicionarConta(conta);
    assertTrue(conta.retornarResumoConta().contains("Resumo das Contas da pessoa "));
  }

  @Test
  @DisplayName("9 - Testa o método retornar extrato está imprimindo os valores corretamente.")
  void retornarExtratoTest() {
    fail("Não implementado");

  }

  @Test
  @DisplayName("10 - Testa o método Getter do atributo idConta está retornando.")
  void getIdContaTest() {
    PessoaCliente pessoaCliente = new PessoaCliente("Cliente Teste", "12345678901", "=senha1=");
    Banco banco = new Banco();
    Conta conta = new Conta("Poupança", pessoaCliente, banco);
    System.out.println(conta.getIdConta());
    assertEquals(10, conta.getIdConta().length());
  }

  @Test
  @DisplayName("11 - Testa o método método Getter do atributo pessoaCliente está retornando.")
  void getPessoaClienteTest() {
    Conta conta = new Conta("Poupança", new PessoaCliente("Cliente Teste", "12345678901", "=senha1="), new Banco());
    assertEquals("12345678901", conta.getPessoaCliente().getCpf());
  }

}
