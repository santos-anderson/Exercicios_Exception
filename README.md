# Exercícios de Exceções em Java

Este projeto contém quatro exercícios práticos para fixação do conceito de exceções em Java, abrangendo desde exceções checadas e não-checadas até o uso de blocos try-catch-finally.

---

## Exercício 1 – Exceção Checada

1. Crie uma exceção personalizada que extenda a classe `Exception` (exceção checada).
2. Em um método X, lance essa exceção usando `throw new SuaException()`.
3. Veja que o compilador obriga você a tratar esta exceção com `try-catch` ou lançar na assinatura do método (`throws`).
4. Crie um método Y que chama o método X e também propague a exceção.
5. Verifique que o compilador exige o tratamento da exceção checada em todos os métodos até ela ser tratada com `try-catch`.

**Conceito fixado:** Exceções checadas precisam ser explicitamente tratadas ou declaradas no código.

---

## Exercício 2 – Exceção Não-Checada

1. Crie uma exceção personalizada que estenda `RuntimeException` (exceção não-checada).
2. Em um método X, lance essa exceção usando `throw new SuaException()`.
3. Veja que o compilador **NÃO obriga** você a tratar ou propagar essa exceção.
4. Crie um método Y que chama X: repare que a propagação não precisa ser declarada.

**Conceito fixado:** Exceções não-checadas (`RuntimeException`) não precisam ser tratadas ou declaradas.

---

## Exercício 3 – Try-Catch-Finally (Sem Exception)

1. Em um bloco `try`, escreva um `print`, faça uma operação que **não gera exceção**, e faça outro `print`.
2. No `catch` e no `finally`, também escreva prints.
3. Veja que os blocos `try` e `finally` são sempre executados, e o `catch` é ignorado.

**Conceito fixado:** O bloco `finally` é sempre executado, mesmo sem exceção.

---

## Exercício 4 – Try-Catch-Finally (Com Exception)

1. Em um bloco `try`, escreva um print, faça uma operação que **gera exceção** (por exemplo, dividir por zero), e insira outro print após isso.
2. No bloco `catch` e no `finally`, escreva prints.
3. Veja que o `try` só executa até a exceção, depois vai para o `catch` (que é executado), e após isso o `finally` também sempre é executado.

**Conceito fixado:** Quando uma exceção é lançada no `try`, apenas os comandos antes dela são executados; o `catch` trata a exceção lançada e o `finally` roda em todos os casos.

---

## Como executar

1. Copie o código do arquivo `Main.java` deste repositório.
