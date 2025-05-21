package aula_06.atividade03;

public class TesteUsuario {

	public static void main(String[] args) {
		UsuarioService servico = new UsuarioService();
		
		Professor professor = new Professor("José", "PROFESSOR", 120f);
		Diretor diretor = new Diretor("Henrique", "PROFESSOR", 227f);
		
		servico.salvarUsuario(professor);
		servico.salvarUsuario(diretor);
		
		System.out.println(professor);
		System.out.println(diretor);
	}

}
