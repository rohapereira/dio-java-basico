package pilaresPOO;

public abstract class Veiculo { //classe abstrata
	private String chassi;
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public abstract void ligar(); //metodo abstrato: o carro e a moto precisam ligar, mas cada um a sua maneira
}
