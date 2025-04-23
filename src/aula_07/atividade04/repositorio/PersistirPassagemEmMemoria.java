package aula_07.atividade04.repositorio;

import java.util.ArrayList;
import java.util.List;

import aula_07.atividade04.dominio.Passagem;

public class PersistirPassagemEmMemoria implements PersistirPassagem {
	private final List<Passagem> passagensPersistidas = new ArrayList<Passagem>();

	@Override
	public void salvarPassagem(Passagem passagem) {
		passagensPersistidas.add(passagem);

	}

}
