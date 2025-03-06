package aula_02.polimorfismoRevisao;

public class TrianguloRetangulo extends FormaGeometrica {
	private float base;
	private float altura;
	
	public TrianguloRetangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public float calcularArea() {

		return (base*altura)/2f;
	}

	@Override
	public String toString() {
		return "TrianguloRetangulo [base=" + base + ", altura=" + altura + ", calcularArea()=" + calcularArea() + "]";
	}
	
	public void mostrar(FormaGeometrica forma) {
		float resultado = forma.calcularArea();
		System.out.println(resultado);
	}
	
}
