package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_15 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Verificando se a lista contém pelo menos um número negativo
        boolean contemNegativo = numeros.stream()
                                        .anyMatch(numero -> numero < 0);
        
        // Exibindo o resultado
        if (contemNegativo) {
            System.out.println("A lista contém pelo menos um número negativo.");
        } else {
            System.out.println("A lista não contém números negativos.");
        }
    }
}
