package aula_03.cleanCode01;
// alterar pacote se necessario





public class funcionariosTeste {

	public static void main(String[] args) {
		
		//Array bidirecional que armazena dados dos funcionarios
		String[][] funcionariosData = {
			{" ", "30", "26/06/1990", "500f"},
            {"joao", "16", "15/04/1995", "1200f"},
            {"ana", "28", "1993/01/26", "1500f"},
            {"luiz", "35", "20/08/1985", "497f"},
            {"pedro", "24", "12/06/2001", "600f"},
            {"lucas", "29", "12/06/1996", "1600f"}
		};
		
		//iterando lista de dados para criar objetos
		for (String[] dados : funcionariosData) {
			String nome = dados[0];
            int idade = Integer.parseInt(dados[1]);
            String dataNascimento = dados[2];
            float salario = Float.parseFloat(dados[3].replace("f", "")); //replace >> se não tiver salario + f(float) junto com o valor do salario ele adiciona, se nao, não faz nada. 
		
		try {
			Funcionario funcionario = criarFuncionario(nome, idade, dataNascimento, salario);
			CalculaSalarioFuncionarios salarioComAcrescimo = new CalculaSalarioFuncionarios();
			Float salarioCalculado = salarioComAcrescimo.CalculaSalario(funcionario);
			System.out.println(funcionario + " [Salario com acréscimo: " + salarioCalculado + "]");
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			}
		}    
	}

	private static Funcionario criarFuncionario(String nome, int idade, String dataNascimento, float salario) {
		// TODO Auto-generated method stub
		return new Funcionario(nome, idade, dataNascimento, salario);
	}

}
