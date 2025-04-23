package aula_06.atividade03;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

	List<Usuario> lista = new ArrayList<>();

	public void salvarUsuario(Usuario usuario) {
		validacaoUsuario(usuario);
		calculaSalario(usuario);
		lista.add(usuario);
	}

	private float calculaSalario(Usuario usuario) {
		return usuario.calcularSalario();
	}

	private void validacaoUsuario(Usuario usuario) {
		if (usuario == null) {
			throw new IllegalArgumentException("usuario esta null");
		}
		if (usuario.nome.equals("")) {
			throw new IllegalArgumentException("nome em branco");
		}
	}
}
