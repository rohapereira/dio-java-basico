package console;

import poo_desafio.reprodutor_musical.*;
import poo_desafio.telefones.*;
import poo_desafio.navegadores.*;
import poo_desafio.smartphone.*;

public class Start {
	public static void main(String[] args) {
		IPhone iPhone = new IPhone();
		
		ReprodutorMusical reprodutorMusical = iPhone;
		AparelhoTelefonico aparelhoTelefonico = iPhone;
		NavegadorInternet nevegadorInternet = iPhone;
		
		reprodutorMusical.escolherMusica();
		reprodutorMusical.tocarMusica();
		reprodutorMusical.pausarMusica();
		
		aparelhoTelefonico.ligar();
		aparelhoTelefonico.atender();
		aparelhoTelefonico.ouvirCorreioVoz();
		
		nevegadorInternet.acessarPagina();
		nevegadorInternet.abrirNovaAba();
		nevegadorInternet.fecharAba();
	}
}
