package aula_04.cleanCode02.dominio;

public class Televisao {
	private String modeloTelevisao;
	private int tamanhoTelevisao;
	
	public Televisao(String modeloTelevisao, int tamanhoTelevisao) {	
		this.modeloTelevisao = modeloTelevisao;
		this.tamanhoTelevisao = tamanhoTelevisao;
	}

	public String getModeloTelevisao() {
		return modeloTelevisao;
	}

	public int getTamanhoTelevisao() {
		return tamanhoTelevisao;
	}

	@Override
	public String toString() {
		return "Televisao [modeloTelevisao=" + modeloTelevisao + ", tamanhoTelevisao=" + tamanhoTelevisao + "]";
	}
	
}
