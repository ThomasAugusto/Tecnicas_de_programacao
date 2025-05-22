package aula_07.atividade04.PassagemOnibus;

public class AWSPersistencia implements PersistaPassagem {

	@Override
	public void persistir(Passagem passagem) {
		System.out.println("Persistindo informação na nuvem...");
	}
}
