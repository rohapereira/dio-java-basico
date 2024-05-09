package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_6 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Verificando se a lista contém algum número maior que 10
        boolean contemMaiorQueDez = numeros.stream()
                                           .anyMatch(numero -> numero > 10);
        
        // Exibindo o resultado
        if (contemMaiorQueDez) {
            System.out.println("A lista contém pelo menos um número maior que 10.");
        } else {
            System.out.println("A lista não contém números maiores que 10.");
        }
    }
}
