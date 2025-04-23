package aula_07.atividade04;

import aula_07.atividade04.repositorio.PersistirPassagem;
import aula_07.atividade04.repositorio.PersistirPassagemEmMemoria;
import aula_07.atividade04.servico.PassagemServico;

public class TestePassagem {

	public static void main(String[] args) {
		PersistirPassagem persistir = new PersistirPassagemEmMemoria();
		PassagemServico servico = new PassagemServico(persistir);
		
		servico.persistirPassagem(28484948);
	}

}
