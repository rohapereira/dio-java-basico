package pilaresPOO;

public class Carro extends Veiculo { //herança: Carro herda caracteristicas de Veiculo
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}
	//encapsulando os métodos confereCombustivel e confereCambio
	private void confereCombustivel() {
		System.out.println("conferindo combustivel");
	}
	private void confereCambio() {
		System.out.println("conferindo cambio em P");
	}
}
