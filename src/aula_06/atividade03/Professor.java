package aula_06.atividade03;

public class Professor extends Usuario{
	
	public Professor(String nome, String cargo, float salario) {
		super(nome, cargo, salario);
	}
	@Override
	public float calcularSalario() {
		float MULTIPLICADOR_SALARIO_PROFESSOR = 5;
		return this.salario * MULTIPLICADOR_SALARIO_PROFESSOR;
	}

}
