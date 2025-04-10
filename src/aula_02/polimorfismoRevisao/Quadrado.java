package aula_02.polimorfismoRevisao;

public class Quadrado extends FormaGeometrica {
	private float lado;

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	public Quadrado(float lado) {
		super();
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", calcularArea()=" + calcularArea() + "]";
	}
	
	public void mostrar(FormaGeometrica forma) {
		float resultado = forma.calcularArea();
		System.out.println(resultado);
	}

}
