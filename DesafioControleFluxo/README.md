## Controle de Fluxo - Desafio

Exercitei o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema recebe dois parâmetros via terminal que representa dois números inteiros, com estes dois números obtive a quantidade de interações (for) e realizei a impressão no console (System.out.print) dos números incrementados, exemplo:

- Se você passei os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
- Se o primeiro parâmetro for MAIOR que o segundo parâmetro, o sistema deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"

1. Criei o projeto DesafioControleFluxo
2. Dentro do projeto, criei a classe Contador.java para realizar toda a codificação do nosso programa.
3. Dentro do projeto, criei a classe ParametrosInvalidosException que representará a exceção de negócio no sistema.

## Abaixo tem um trecho de código no qual eu segui alterando as partes que continham ??

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
