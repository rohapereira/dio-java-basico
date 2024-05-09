package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_18 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
                                    .distinct()
                                    .limit(2)  // Limitei a dois elementos, se houver mais que dois, saberemos que não são todos iguais
                                    .count() <= 1;

        System.out.println("Todos os números são iguais? " + todosIguais);
    }
}
