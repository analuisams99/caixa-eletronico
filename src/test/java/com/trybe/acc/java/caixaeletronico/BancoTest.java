package com.trybe.acc.java.caixaeletronico;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes para a classe Banco")
class BancoTest {

  @Test
  @DisplayName("1 - Testa o gerador de número único para nova conta.")
  void gerarNumeroNovaContaTest() {
    Banco banco = new Banco();
    assertTrue(banco.gerarNumeroNovaConta().length() == 10);
  }

  @Test
  @DisplayName("2 - Testa o método adicionar pessoa cliente retorna o objeto pessoa cliente.")
  void adicionarPessoaClienteTest() {
    Banco banco = new Banco();
    assertEquals(banco.adicionarPessoaCliente("Cliente Teste", "12345678901", "=senha1=").toString(), 
          "Nova pessoa cliente Cliente Teste com CPF: 12345678901 criada!");
    assertEquals(banco.pessoasClientes.size(), 1);
  }

  @Test
  @DisplayName("3 - Testa o método login da pessoa cliente retorna o objeto pessoa cliente corretamente.")
  void pessoaClienteLoginTest() {
    Banco banco = new Banco();
    banco.adicionarPessoaCliente("Cliente Teste", "12345678901", "=senha1=");
    assertEquals("Nova pessoa cliente Cliente Teste com CPF: 12345678901 criada!", 
          banco.pessoaClienteLogin("12345678901", "=senha1=").toString());
  }

  @Test
  @DisplayName("4 - Testa se o método transferir fundos está transferindo corretamente.")
  void depositarTestTransferirFundosTestmostrarExtratoTest() {
    fail("Não implementado");

  }

  @Test
  @DisplayName("5 - Testa se o método sacar está funcionando corretamente.")
  void depositarTestSacarTestMostrarExtratoTest() {
    fail("Não implementado");

  }

}
