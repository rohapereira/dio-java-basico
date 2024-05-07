package poo_desafio.smartphone;

import poo_desafio.navegadores.NavegadorInternet;
import poo_desafio.reprodutor_musical.ReprodutorMusical;
import poo_desafio.telefones.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
	public void escolherMusica() {
    	System.out.println("Selecionando música");
    }
	public void tocarMusica() {
        System.out.println("Tocando música");
    }
    public void pausarMusica() {
    	System.out.println("Pausando música");
    }
    public void ligar() {
    	System.out.println("Efetuando uma ligação telefônica");
    }
    public void atender() {
    	System.out.println("Atendendo uma ligação telefônica");
    }
    public void ouvirCorreioVoz() {
    	System.out.println("Escutamdo um correio de voz");
    }
    public void acessarPagina() {
    	System.out.println("Acessando uma página da web");
    }
    public void abrirNovaAba() {
    	System.out.println("Abrindo nova aba do navegador");
    }
    public void fecharAba() {
    	System.out.println("Fechando uma aba do navegador");
    }
}