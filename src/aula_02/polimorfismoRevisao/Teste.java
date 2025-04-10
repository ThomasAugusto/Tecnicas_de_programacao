package aula_02.polimorfismoRevisao;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrianguloRetangulo tr = new TrianguloRetangulo(40, 30);
		Quadrado qd = new Quadrado(25);
		
		tr.calcularArea();
		qd.calcularArea();
				
		tr.mostrar(tr);
		qd.mostrar(qd);
	}

}
