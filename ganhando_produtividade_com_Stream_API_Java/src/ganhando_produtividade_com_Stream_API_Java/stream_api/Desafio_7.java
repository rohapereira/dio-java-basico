package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_7 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Encontrando o segundo número maior da lista
        Integer segundoMaior = numeros.stream()
                                      .distinct() // Remove os números duplicados
                                      .sorted((a, b) -> b.compareTo(a)) // Ordenar em ordem decrescente
                                      .skip(1) // Pular o maior número
                                      .findFirst() // Pegar o primeiro elemento restante
                                      .orElse(null); // Lidar com o caso de lista vazia
        
        // Exibindo o resultado
        if (segundoMaior != null) {
            System.out.println("O segundo número maior da lista é: " + segundoMaior);
        } else {
            System.out.println("Lista vazia.");
        }
    }
}
