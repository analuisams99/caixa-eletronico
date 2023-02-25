package com.trybe.acc.java.caixaeletronico;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste dos métodos da classe PessoaCliente")
class PessoaClienteTest {

  @Test
  @DisplayName("12 - Testa o construtor da classe Pessoa Cliente.")
  void construtorTest() {
    PessoaCliente pessoaCliente = new PessoaCliente("Cliente Teste", "12345678901", "=senha1=");
    assertEquals(pessoaCliente.toString(), "Nova pessoa cliente Cliente Teste com CPF: 12345678901 criada!");
  }

  @Test
  @DisplayName("13 - Testa o método adicionar conta e o método retornar número de contas.")
  void adicionarContaTestRetornaNumeroDeContasTest() {
    PessoaCliente pessoaCliente = new PessoaCliente("Cliente Teste", "12345678901", "=senha1=");
    Conta conta = new Conta("Poupança", new PessoaCliente("Cliente Teste", "12345678901", "=senha1="), new Banco());
    pessoaCliente.adicionarConta(conta);
    pessoaCliente.adicionarConta(conta);
    assertEquals(2, pessoaCliente.retornaNumeroDeContas());
  }

  @Test
  @DisplayName("14 - Testa o método retornar saldo de uma conta específica da pessoa cliente.")
  void retornarSaldoContaEspecificaTest() {
    PessoaCliente pessoaCliente = new PessoaCliente("Cliente Teste", "12345678901", "=senha1=");
    Conta conta = new Conta("Cliente Teste", pessoaCliente, new Banco());
    pessoaCliente.adicionarConta(conta);
    assertEquals(0.0, pessoaCliente.retornarSaldoContaEspecifica(0));
  }


  @Test
  @DisplayName("15 - Testa o método retornar id de uma conta específica da pessoa cliente.")
  void retornarIdContaEspecificaTest() {
    PessoaCliente pessoaCliente = new PessoaCliente("Cliente Teste", "12345678901", "=senha1=");
    Conta conta = new Conta("Cliente Teste", pessoaCliente, new Banco());
    pessoaCliente.adicionarConta(conta);
    assertTrue(pessoaCliente.contas.get(0).getIdConta() == pessoaCliente.retornarIdContaEspecifica(0));
  }

  @Test
  @DisplayName("16 - Testa o método retornar o extrato de uma conta específica da pessoa cliente.")
  void retornarExtratoContaEspecificaTest() {
    fail("Não implementado");

  }

  @Test
  @DisplayName("17 - Testa o método adiciona transacao de uma conta específica da pessoa cliente.")
  void adicionarTransacaoContaEspecificaTest() {
    fail("Não implementado");

  }

  @Test
  @DisplayName("18 - Testa o método validar senha.")
  void validarSenhaTest() {
    PessoaCliente pessoaCliente = new PessoaCliente("Cliente Teste", "12345678901", "=senha1=");
    assertTrue(pessoaCliente.validarSenha("=senha1="));
    assertFalse(pessoaCliente.validarSenha("=senha2="));
  }

  @Test
  @DisplayName("19 - Testa o método retornar resumo contas.")
  void retornarResumoContasTest() {
    PessoaCliente pessoaCliente = new PessoaCliente("Cliente Teste", "12345678901", "=senha1=");
    assertTrue(pessoaCliente.validarSenha("=senha1="));
  }

  @Test
  @DisplayName("20 - Testa o método Getter do atributo cpf está retornando.")
  void getCpfTest() {
    PessoaCliente pessoaCliente = new PessoaCliente("Cliente Teste", "12345678901", "=senha1=");
    assertEquals("12345678901", pessoaCliente.getCpf());
  }

}
