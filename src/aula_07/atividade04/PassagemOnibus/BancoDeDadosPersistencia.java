package aula_07.atividade04.PassagemOnibus;

public class BancoDeDadosPersistencia implements PersistaPassagem {

	@Override
	public void persistir(Passagem passagem) {
		System.out.println("Persistindo informação no Banco de dados...");
	}

}
