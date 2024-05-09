package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_9 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Verificando se todos os números da lista são distintos (não se repetem)
        boolean todosDistintos = numeros.stream()
                                       .distinct()
                                       .count() == numeros.size();
        
        // Exibindo o resultado
        if (todosDistintos) {
            System.out.println("Todos os números na lista são distintos.");
        } else {
            System.out.println("Alguns números na lista se repetem.");
        }
    }
}
