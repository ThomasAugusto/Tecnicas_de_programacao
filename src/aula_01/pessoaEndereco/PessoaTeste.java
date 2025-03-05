package aula_01.pessoaEndereco;

public class PessoaTeste {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua ABC", 100);
		Pessoa Joao = new Pessoa("João da Silva", endereco);
		
		System.out.println(Joao);
		System.out.println(Joao.getEnd().getRua());

	}

}
