package aula_06.atividade03;

public class Diretor extends Usuario {
	
	public Diretor(String nome, String cargo, float salario) {
		super(nome, cargo, salario);
	}
	@Override
	public float calcularSalario() {
		float MULTIPLICADOR_SALARIO_DIRETOR = 7;
		return this.salario * MULTIPLICADOR_SALARIO_DIRETOR;
	}

}
