package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio_10 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Agrupando os valores ímpares múltiplos de 3 ou de 5
        Map<Boolean, List<Integer>> grupos = numeros.stream()
                                                    .filter(numero -> numero % 2 != 0 && (numero % 3 == 0 || numero % 5 == 0))
                                                    .collect(Collectors.groupingBy(numero -> numero % 3 == 0));
        
        // Exibindo o resultado
        System.out.println("Valores ímpares múltiplos de 3 ou de 5 agrupados:");
        System.out.println("Múltiplos de 3: " + grupos.get(true));
        System.out.println("Múltiplos de 5: " + grupos.get(false));
    }
}
