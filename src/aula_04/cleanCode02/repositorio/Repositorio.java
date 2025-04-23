package aula_04.cleanCode02.repositorio;

import java.util.List;

import aula_04.cleanCode02.dominio.Televisao;

public interface Repositorio {
	void adicionarTelevisao(Televisao televisao);
	List<Televisao> Listar();

}
