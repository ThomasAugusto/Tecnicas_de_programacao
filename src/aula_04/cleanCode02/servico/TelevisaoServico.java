package aula_04.cleanCode02.servico;

import java.util.List;

import aula_04.cleanCode02.dominio.Televisao;
import aula_04.cleanCode02.dominio.validacao.Validacao;
import aula_04.cleanCode02.repositorio.Repositorio;

public class TelevisaoServico {
	private final Repositorio repositorio;
	private final Validacao validacao;
	
	public TelevisaoServico(Repositorio repositorio, Validacao validacao) {
		this.repositorio = repositorio;
		this.validacao = validacao;
	}
	
	public void adicionarTelevisao(String modelo, int tamanho) {
		Televisao tv = new Televisao(modelo, tamanho);
		validacao.ValidarTelevisao(tv);
		repositorio.adicionarTelevisao(tv);
	}
	
	private List<Televisao> listarTelevisoes(){
		return repositorio.Listar();
	}
	
	public void imprimirTelevisoes() {
		List<Televisao> televisoes = listarTelevisoes();
		
		if (televisoes.isEmpty()) {
			System.out.println("Nenhuma Televisão cadastrada.");
		}else {
			for (Televisao tv : televisoes) {
				System.out.println(tv);
			}
		}
	}

}
