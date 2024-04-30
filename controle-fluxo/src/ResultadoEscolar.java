public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
       
        //#region "Condicional composta"
        // if(nota >= 7)
        //     System.out.println("Aprovado");
        // else if(nota >=5 && nota < 7)
        //     System.out.println("Recuperação");
        // else
        //     System.out.println("Reprovado");
        //#endregion

        //#region "Condição Ternário"
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
        //#endregion
    }
}
