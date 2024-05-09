package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_1 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Ordenando e mostrando a lista na ordem numérica
        numeros.stream()
               .sorted()
               .forEach(System.out::println);
    }
}
