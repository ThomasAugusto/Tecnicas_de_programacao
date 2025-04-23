package aula_06.atividade03;

public abstract class Usuario {

	protected String nome;
    protected String cargo;
    protected float salario;
    
	public Usuario(String nome, String cargo, float salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	public abstract float calcularSalario();

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
	}
	    
}
