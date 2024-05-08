package collections_java_api.set.Pesquisa;

public class Tarefa {
	//atributos
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String descricao, boolean concluida) {
		this.descricao = descricao;
		this.concluida = false;
	}
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String toString() {
		return "Tarefa{" +
		    "descricao='" + descricao + '\'' +
		    ", concluida=" + concluida +
		    '}';
	}	
}
