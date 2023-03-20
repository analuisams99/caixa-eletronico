# Caixa Eletrônico (Testes Unitários - TDD)

    Este projeto foi realizado com o objetivo de aprimorar o conhecimento em 
    Test Driven Development (TDD) na linguagem Java.

## :zap: Descrição

**Sistema de caixa eletrônico, que seguiu a prática **Test Driven Development (TDD)** em sua criação, que permite que o usuário possa:**

  - Logar no sistema;
  - Visualizar e manipular as informações da sua conta bancária;
  - Ter acesso a todas as transações feitas.
  
## 🧪 Test Driven Development (TDD)
**Os testes criados em TDD estão descritos abaixo:**

### :pushpin: BancoTest 
Essa classe contém todos os testes relacionados aos métodos da classe **Banco** do sistema de caixa eletrônico.
   
   - `gerarNumeroNovaContaTest:` testa se o método **gerarNumeroNovaConta** está retornando uma String de 10 dígitos, que representam o número da nova conta aberta.
   
   - `adicionarPessoaClienteTest:` testa se o método **adicionarPessoaCliente** está adicionando objetos do tipo PessoaCliente ao array pessoasClientes dessa classe Banco. Representa a inserção de novas pessoas clientes ao banco, e retorna ao objeto da classe PessoaCliente.
   
   - `pessoaClienteLoginTest:` testa se o método **pessoaClienteLogin** libera o acesso de pessoas clientes e proíbe acessos com combinação de CPF e senha errados.
   
   - `depositarTestTransferirFundosTestMostrarExtratoTest:` testa se o método **depositar** está adicionando ao saldo da conta bancária o valor que é passado como argumento, e **transferirFundos** está transferindo quantias em dinheiro entre as contas da pessoa cliente. 
   
   - `depositarTestSacarTestMostrarExtratoTest:` testa se o método **depositar** está adicionando ao saldo da conta bancária o valor que é passado como argumento, e o método **sacar** está realizando a subtração correta do saldo em conta bancária da quantia que é passada como argumento.

   
### :pushpin: ContaTest
Essa classe contém os testes relacionados aos métodos da classe **Conta**.

   - `construtorTest:` testa se o construtor está inicializando os atributos da classe **Conta** corretamente.
   
   - `adicionarTransacaoTestRetornarSaldoTest:` testa se o método **adicionarTransacao** está adicionando ao histórico da conta uma transação realizada pelo método em questão, e analisa se o método **retornarSaldo** retorna o saldo da conta bancária corretamente. 
   
   - `retornarResumoContaTest:` testa se o método **retornarResumoConta** está apresentando o resumo da conta bancária.
   
   - `retornarExtratoTest:` testa se o método **retornarExtrato** está apresentando o extrato da conta bancária.
   
   - `getIdContaTest:` testa se o método **Getter** do atributo **idConta** está retornando o número identificador da conta.
   
   - `getPessoaClienteTest:` testa se o método **Getter** do atributo **pessoaCliente** está retornando a pessoa cliente da conta bancária.

### :pushpin: PessoaClienteTest
Essa classe possui os testes dos métodos da classe **PessoaCliente**.

   - `construtorTest:` testa se o construtor da classe está inicializando seus atributos corretamente e imprimindo no console uma mensagem indicando que um objeto da classe **PessoaCliente** foi instanciado com sucesso.
    
   - `adicionarContaTestRetornaNumeroDeContasTest:` testa se o método **adicionarConta** está adicionando nova conta para pessoa cliente e também analisa se o método **retornaNumeroDeContas** retorna o número que representa a quantidade de contas que uma pessoa cliente possui.
   
   - `retornarSaldoContaEspecificaTest:` testa se o método **retornarSaldoContaEspecifica** retorna o saldo de uma conta bancária específica corretamente.
   
   - `retornarIdContaEspecificaTest:` testa se o método **retornarIdContaEspecifica** está retornando o número identificador de uma conta bancária específica corretamente.
   
   - `retornarExtratoContaEspecificaTest:` testa se o método **retornarExtratoContaEspecifica** retorna o extrato bancário de uma conta específica da pessoa cliente.
   
   - `adicionarTransacaoContaEspecificaTest:` testa se o método **adicionarTransacaoContaEspecifica** está adicionando uma transação a uma conta específica da pessoa cliente.
   
   - `validarSenhaTest:` testa se o método **validarSenha** está verificando se a senha passada por parâmetro é a mesma que foi cadastrada ao criar a pessoa cliente.
   
   - `retornarResumoContasTest:` testa se o método **retornarResumoContas** retorna o resumo das contas da pessoa cliente.
   
   - `getCpfTest:` testa se o método **Getter** do atributo **cpf** da pessoa cliente está retornando o CPF cadastrado.


### :pushpin: TransacaoTest
Essa classe contém todos os testes relacionados aos métodos da classe **Transacao**.

   - `construtorTest:` testa se o método **construtor** está inicializando os atributos corretamente.
   
   - `getQuantiaTest:` testa se o método **Getter** do atributo **quantia** está retornando a quantia corretamente.
   
   - `retornarResumoTransacaoTest:` testa se o método **retornarResumoTransacao** apresenta o resumo da transação corretamente.
   
   - `retornarInstanteTest:` testa se o método **retornarInstante** retorna o momento correto em que a transação ocorreu, com data, hora, minuto e segundo.

## 🟡 Classes criadas em conjunto ao TDD
![Mapa-conceitual-geral](https://github.com/analuisams99/caixa-eletronico/blob/main/img/mapa_conceitual_geral.png)

### :pushpin: CaixaEletronico (Classe principal do sistema)
:warning: **Classe feita pela Trybe, que contém o método `main`**. Ele é o responsável por toda a interação com a pessoa cliente. Em outras palavras, essa classe é a interface entre a pessoa cliente e nosso sistema do banco.

### :pushpin: Banco
Representa a entidade banco do caixa eletrônico. Essa classe é a responsável por criar novas pessoas clientes no banco e também verificar e validar o login da pessoa cliente no caixa eletrônico.

### :pushpin: Conta
Representa as contas do banco, onde temos os métodos relacionados às transações, e mostra as informações de saldo.

### :pushpin: PessoaCliente
Representa as pessoas clientes do banco.

### :pushpin: Transacao
Representa a transação nas contas do banco.


## 🔸 Exemplos de entradas e saídas

:warning: Após a criação das pessoas clientes e suas respectivas contas bancárias, você vai entrar em um laço infinito que é o sistema do caixa eletrônico em si. A princípio ele mostra uma mensagem de boas-vindas e permite que a pessoa cliente possa entrar com seus dados para poder acessar sua conta.

Se a pessoa cliente entrar com os dados incorretos, o fluxo do programa vai entrar na primeira condição (if) e reapresentará a mensagem de boas-vindas e os campos para que a pessoa cliente possa tentar novamente. Quando a pessoa cliente entra com os dados corretos, o fluxo do sistema entra na segunda condição (else) e é apresentado um menu para manipulação das suas contas bancárias.

```
Nova pessoa cliente Alexiania Pereira com CPF: 842.074.410-77 criada!

Nova pessoa cliente Abadiania Silva com CPF: 848.725.510-87 criada!

Nova pessoa cliente Camaragibe Oliveira com CPF: 433.892.200-11 criada!



Bem-vindo ao Banco da Trybe


Entre com seu CPF: 433.892.200-11
Entre com sua senha: 1234


Resumo das Contas da pessoa Camaragibe Oliveira:

1) 1376245820 : R$0.00 : Poupança

2) 1400842111 : R$0.00 : Corrente
```

Na segunda etapa você verá um resumo das contas bancárias da pessoa usuária e também um menu com cinco opções (quatro delas para manipular a sua conta bancária e a quinta para fazer o logout do sistema e voltar para a tela de boas-vindas com os campos para fazer o login).

```

O que você gostaria de fazer?
  1) Mostrar Extrato
  2) Sacar
  3) Depositar
  4) Transferir
  5) Sair

Entre com sua opção: 3
Entre com o número (1-2) para selecionar a conta para depósito: 1
Entre com a quantia de depósito: R$ 2000


Resumo das Contas da pessoa Camaragibe Oliveira:

1) 1376245820 : R$2000.00 : Poupança

2) 1400842111 : R$0.00 : Corrente


O que você gostaria de fazer?
  1) Mostrar Extrato
  2) Sacar
  3) Depositar
  4) Transferir
  5) Sair

Entre com sua opção: 3
Entre com o número (1-2) para selecionar a conta para depósito: 2
Entre com a quantia de depósito: R$ 4000


Resumo das Contas da pessoa Camaragibe Oliveira:

1) 1376245820 : R$2000.00 : Poupança

2) 1400842111 : R$4000.00 : Corrente


O que você gostaria de fazer?
  1) Mostrar Extrato
  2) Sacar
  3) Depositar
  4) Transferir
  5) Sair

Entre com sua opção: 4
Entre o número (1-2) para retirar o valor para transferência: 2
Entre o número (1-2) para selecionar a conta que receberá a transferência: 1
Entre com a quantia para ser transferida (máximo R$4000.00): R$ 2000


Resumo das Contas da pessoa Camaragibe Oliveira:

1) 1376245820 : R$4000.00 : Poupança

2) 1400842111 : R$2000.00 : Corrente


O que você gostaria de fazer?
  1) Mostrar Extrato
  2) Sacar
  3) Depositar
  4) Transferir
  5) Sair

Entre com sua opção: 1
Entre com o número (1-2) para a conta
que o extrato será impresso: 1

Extrato da conta 1376245820

21/01/2022 14:21:52 -------- Transferência recebida: R$ 2000.00 +
21/01/2022 14:21:32 -------- Depósito recebido: R$ 2000.00 +



Resumo das Contas da pessoa Camaragibe Oliveira:

1) 1376245820 : R$4000.00 : Poupança

2) 1400842111 : R$2000.00 : Corrente


O que você gostaria de fazer?
  1) Mostrar Extrato
  2) Sacar
  3) Depositar
  4) Transferir
  5) Sair

Entre com sua opção: 
```


## Instalação do projeto em sua máquina
  1. Clone o repositório
   
     `git@github.com:analuisams99/caixa-eletronico.git`
    
  2. Entre no diretório do repositório que você acabou de clonar:
  
     `cd caixa-eletronico`
     
  

## Para testar o projeto
  1. digite o comando no seu terminal
      
      `mvn test`
      
    Os códigos de cobertura de testes, do arquivo src/test/java/com/trybe/acc/java/caixaeletronico/CoverageValidationTest.java,
    foram desenvolvidos pela Trybe.
    
---

-- Projeto desenvolvido por Ana Luisa Marques Simões, para fins didáticos. 2023
