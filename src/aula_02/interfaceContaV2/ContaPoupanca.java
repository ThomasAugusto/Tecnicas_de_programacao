package aula_02.interfaceContaV2;

public class ContaPoupanca extends ContaBancaria implements Conta{
	private float percentualDeRendimento;

	public ContaPoupanca(float saldo, String nome, float percentualDeRendimento) {
		super(saldo, nome);
		this.percentualDeRendimento = percentualDeRendimento;
	}

	@Override
	public void depositar(float valor) {
		if (valor > 0) {
			saldo = saldo + valor;
		}
		
	}

	@Override
	public boolean sacar(float valor) {
		if (valor <= saldo && valor >= 0) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	public float getPercentualDeRendimento() {
		return percentualDeRendimento;
	}

	public void setPercentualDeRendimento(float percentualDeRendimento) {
		this.percentualDeRendimento = percentualDeRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [percentualDeRendimento=" + percentualDeRendimento + ", saldo=" + saldo + ", nome=" + nome
				+ "]";
	}

}
