package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_14 {
	
	// Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    	
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Encontrando o maior número primo da lista
        Integer maiorPrimo = numeros.stream()
                                    .filter(Desafio_14::ehPrimo)
                                    .max(Integer::compareTo)
                                    .orElse(null);
        
        // Exibindo o resultado
        if (maiorPrimo != null) {
            System.out.println("O maior número primo da lista é: " + maiorPrimo);
        } else {
            System.out.println("Não foi possível encontrar um número primo na lista.");
        }
    }
}
