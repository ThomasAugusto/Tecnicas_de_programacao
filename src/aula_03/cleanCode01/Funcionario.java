package aula_03.cleanCode01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Funcionario {
	
    private static int contatorDeIDs = 1; //contador do auto incremento idFuncionario.
	
	private int idFuncionario;
	private String nomeFuncionario;
    private int idadeFuncionario; 
    private String dataNascimentoFuncionario;
    private float salarioFuncionario;
    private static int MAIOR_IDADE = 18;
    private static float SALARIO_MINIMO = 500f;
	
    public Funcionario(String nomeFuncionario, int idadeFuncionario,
			String dataNascimentoFuncionario, float salarioFuncionario) throws IllegalArgumentException {
		this.idFuncionario = contatorDeIDs++; //auto incrementa o valor de idFuncionario a cada objeto criado.
		
		//validação dos atributos diretamente no contrutor para evitar criar objetos com erros
		if (ValidaNome(nomeFuncionario)) {
			throw new IllegalArgumentException("Nome inválido");
		}
		if (ValidadeIdade(idadeFuncionario)) {
			throw new IllegalArgumentException("Idade inválida");
		}
		if (ValidaDataNascimento(dataNascimentoFuncionario)) {
			throw new IllegalArgumentException("Data de nascimento inválida");
		}
		if (ValidaSalario(salarioFuncionario)) {
			throw new IllegalArgumentException("Salário inválido");
		}
		
		this.nomeFuncionario = nomeFuncionario;
		this.idadeFuncionario = idadeFuncionario;
		this.dataNascimentoFuncionario = dataNascimentoFuncionario;
		this.salarioFuncionario = salarioFuncionario;
		
	}
    
    private boolean ValidaNome(String nome){
    	if (nome.trim().isEmpty()) {
    		return true;
    	}
    	return false;
    }
    
    private boolean ValidadeIdade(int idade) {
    	if (idade < MAIOR_IDADE) {
    		return true;
    	}
    	return false;
    }
    private boolean ValidaDataNascimento(String data) {
    	String regex = "^\\d{2}/\\d{2}/\\d{4}$";
    	
    	Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        
        if (matcher.matches()) {
        	return false;
        }
    	return true;
    }
    
    private boolean ValidaSalario(float salario) {
    	if (salario < SALARIO_MINIMO) {
    		return true;
    	}
    	return false;
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
