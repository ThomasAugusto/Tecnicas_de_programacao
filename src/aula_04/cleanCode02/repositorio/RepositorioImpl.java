package aula_04.cleanCode02.repositorio;

import java.util.ArrayList;
import java.util.List;

import aula_04.cleanCode02.dominio.Televisao;

public class RepositorioImpl implements Repositorio {
	private final List<Televisao> televisoes = new ArrayList<Televisao>();

	@Override
	public void adicionarTelevisao(Televisao televisao) {
		televisoes.add(televisao);

	}

	@Override
	public List<Televisao> Listar() {
		return new ArrayList<>(televisoes);
	}

}
