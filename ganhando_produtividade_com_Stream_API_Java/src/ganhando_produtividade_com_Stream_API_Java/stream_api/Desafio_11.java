package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_11 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Encontrando a soma dos quadrados de todos os números da lista
        int somaDosQuadrados = numeros.stream()
                                      .map(numero -> numero * numero) // Elevando ao quadrado
                                      .reduce(0, Integer::sum); // Somando
        
        // Exibindo o resultado
        System.out.println("A soma dos quadrados de todos os números da lista é: " + somaDosQuadrados);
    }
}
