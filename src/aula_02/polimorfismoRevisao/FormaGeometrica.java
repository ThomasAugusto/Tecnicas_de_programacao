package aula_02.polimorfismoRevisao;

public abstract class FormaGeometrica {

	public abstract float calcularArea();

	@Override
	public String toString() {
		return "FormaGeometrica [calcularArea()=" + calcularArea() + "]";
	}
	
}
