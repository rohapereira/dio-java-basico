package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_2 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Calculando a soma dos números pares
        int somaDosPares = numeros.stream()
                                 .filter(numero -> numero % 2 == 0)
                                 .reduce(0, Integer::sum);
        
        // Exibindo o resultado
        System.out.println("A soma dos números pares da lista é: " + somaDosPares);
    }
}
