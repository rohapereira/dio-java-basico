package ganhando_produtividade_com_Stream_API_Java.stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio_8 {
	public static void main(String[] args) {
		
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        // Somando os dígitos de todos os números da lista
        int somaDosDigitos = numeros.stream()
                                    .map(numero -> Integer.toString(numero)) // Converte para String
                                    .flatMapToInt(s -> s.chars().map(Character::getNumericValue)) // Divide em caracteres e converte para números inteiros
                                    .sum(); // Soma os dígitos
        
        // Exibindo o resultado
        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDosDigitos);
    }
}
