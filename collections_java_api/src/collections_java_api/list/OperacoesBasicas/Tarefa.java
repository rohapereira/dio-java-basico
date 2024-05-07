package collections_java_api.list.OperacoesBasicas;

public class Tarefa {
	//atributo
	private String descricao;

	public Tarefa(String descricao) {
	  this.descricao = descricao;
	}

	public String getDescricao() {
	  return descricao;
	}

	@Override
	public String toString() {
	  return  descricao;
	}
}
