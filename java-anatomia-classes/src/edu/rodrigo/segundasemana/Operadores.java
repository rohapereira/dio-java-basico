package edu.rodrigo.segundasemana;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao ="?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        int outroNumero = 5;

        outroNumero++; //é a mesma coisa que -> outroNumero = numero + 1

        System.out.println(outroNumero);

        outroNumero--;

        System.out.println(outroNumero);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);
    }

}
