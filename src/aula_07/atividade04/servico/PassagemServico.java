package aula_07.atividade04.servico;

import aula_07.atividade04.dominio.Passagem;
import aula_07.atividade04.repositorio.PersistirPassagem;

public class PassagemServico {
	
	private final PersistirPassagem persistir;

	public PassagemServico(PersistirPassagem persistir) {
		this.persistir = persistir;
	}

	public void persistirPassagem(double codigo) {
		Passagem passagem = new Passagem(codigo);
		persistir.salvarPassagem(passagem);
	}

}
