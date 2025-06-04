package t2.ativade3;

public class BoletoBancario implements PagamentoStrategyInterface {
    @Override
    public float calcularPagamento(float valor) {
        return valor; //sem acrescimos
    }
}
