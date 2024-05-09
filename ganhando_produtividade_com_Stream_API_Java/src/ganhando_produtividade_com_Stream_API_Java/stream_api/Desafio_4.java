package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_4 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Removendo os valores ímpares da lista
        List<Integer> numerosSemImpares = numeros.stream()
                                                 .filter(numero -> numero % 2 == 0)
                                                 .toList();
        
        // Exibindo a lista resultante
        System.out.println("Lista resultante após remover os valores ímpares:");
        System.out.println(numerosSemImpares);
    }
}
