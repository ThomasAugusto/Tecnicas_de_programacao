package aula_04.cleanCode02;

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

	public void setModeloTelevisao(String modeloTelevisao) {
		this.modeloTelevisao = modeloTelevisao;
	}

	public int getTamanhoTelevisao() {
		return tamanhoTelevisao;
	}

	public void setTamanhoTelevisao(int tamanhoTelevisao) {
		this.tamanhoTelevisao = tamanhoTelevisao;
	}

	@Override
	public String toString() {
		return "Televisao [modeloTelevisao=" + modeloTelevisao + ", tamanhoTelevisao=" + tamanhoTelevisao + "]";
	}
	
}
