package aula_04.cleanCode02.dominio.validacao;

import aula_04.cleanCode02.dominio.Televisao;

public class ValidacaoImpl implements Validacao {
	private static int TAMANHO_MINIMO_TELEVISAO = 32;

	@Override
	public void ValidarTelevisao(Televisao televisao) {
		validarModelo(televisao.getModeloTelevisao());
		validarTamanho(televisao.getTamanhoTelevisao());
	}

	private void validarModelo(String modeloTelevisao) {
		if (modeloEhInvalido(modeloTelevisao)){
			throw new IllegalArgumentException("Modelo inválido");
		}
		
	}

	private void validarTamanho(int tamanhoTelevisao) {
		//int TAMANHO_MINIMO_TELEVISAO = 32;
		
		if (tamanhoTelevisao < TAMANHO_MINIMO_TELEVISAO) {
			throw new IllegalArgumentException("Tamanho inválido");
		}
		
	}
	
	private boolean modeloEhInvalido(String modelo) {
		return stringVazia(modelo) || stringNula(modelo) || modeloEhPequeno(modelo);
	}
	
	private boolean stringVazia(String string) {
		return string.isBlank();
	}
	
	private boolean stringNula(String string) {
		return string == null;
	}
	
	private boolean modeloEhPequeno(String modelo) {
		return modelo.trim().length() < 3;
	}

}
