package aula_04.cleanCode02;

import aula_04.cleanCode02.dominio.validacao.Validacao;
import aula_04.cleanCode02.dominio.validacao.ValidacaoImpl;
import aula_04.cleanCode02.repositorio.Repositorio;
import aula_04.cleanCode02.repositorio.RepositorioImpl;
import aula_04.cleanCode02.servico.TelevisaoServico;

public class Main2 {

	public static void main(String[] args) {
		Repositorio repositorio = new RepositorioImpl();
		Validacao validar = new ValidacaoImpl();
		TelevisaoServico servico = new TelevisaoServico(repositorio, validar);
		
		servico.adicionarTelevisao("LG TV", 42);
		servico.adicionarTelevisao("LG TV", 55);
		servico.adicionarTelevisao("TCL TV", 42);
		servico.adicionarTelevisao("SAMSUNG TV", 74);
		
		servico.imprimirTelevisoes();
	}

}
