package aula_03.cleanCode01;
// alterar pacote se necessario




public class Funcionario {
	
    private static int contatorDeIDs; //contador do auto incremento idFuncionario.
	
	int idFuncionario;
	String nomeFuncionario;
    int idadeFuncionario; 
    String dataNascimentoFuncionario;
    float salarioFuncionario;
	
    public Funcionario(String nomeFuncionario, int idadeFuncionario,
			String dataNascimentoFuncionario, float salarioFuncionario) {
		this.idFuncionario = contatorDeIDs++; //auto incrementa o valor de idFuncionario a cada objeto criado.
		this.nomeFuncionario = nomeFuncionario;
		this.idadeFuncionario = idadeFuncionario;
		this.dataNascimentoFuncionario = dataNascimentoFuncionario;
		this.salarioFuncionario = salarioFuncionario;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public int getIdadeFuncionario() {
		return idadeFuncionario;
	}
	public void setIdadeFuncionario(int idadeFuncionario) {
		this.idadeFuncionario = idadeFuncionario;
	}
	public String getDataNascimentoFuncionario() {
		return dataNascimentoFuncionario;
	}
	public void setDataNascimentoFuncionario(String dataNascimentoFuncionario) {
		this.dataNascimentoFuncionario = dataNascimentoFuncionario;
	}
	public float getSalarioFuncionario() {
		return salarioFuncionario;
	}
	public void setSalarioFuncionario(float salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nomeFuncionario=" + nomeFuncionario
				+ ", idadeFuncionario=" + idadeFuncionario + ", dataNascimentoFuncionario=" + dataNascimentoFuncionario
				+ ", salarioFuncionario=" + salarioFuncionario + "]";
	}    

}
