public class ExemploForArray {
    public static void main(String[] args) {
        //em arrays o índice começa com 0
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        
        //#region "Com for"
	    // for (int x=0; x<alunos.length; x++) {
		//     System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	    // }
        //#endregion

        //#region "Com for each"
        for(String aluno : alunos) { //para cada aluno do array alunos, imprima aluno
            System.out.println(aluno);
          }
        //#endregion
    }
}
