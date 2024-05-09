package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_5 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Calculando a média dos números maiores que 5
        double media = numeros.stream()
                             .filter(numero -> numero > 5)
                             .mapToDouble(Integer::doubleValue)
                             .average()
                             .orElse(0.0);
        
        // Exibindo o resultado
        System.out.println("A média dos números maiores que 5 é: " + media);
    }
}
