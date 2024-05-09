package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_13 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Definindo o intervalo
        int limiteInferior = 5;
        int limiteSuperior = 10;
        
        // Filtrando os números dentro do intervalo
        List<Integer> numerosNoIntervalo = numeros.stream()
                                                  .filter(numero -> numero >= limiteInferior && numero <= limiteSuperior)
                                                  .collect(Collectors.toList());
        
        // Exibindo o resultado
        System.out.println("Números dentro do intervalo [" + limiteInferior + ", " + limiteSuperior + "]:");
        System.out.println(numerosNoIntervalo);
    }
}
