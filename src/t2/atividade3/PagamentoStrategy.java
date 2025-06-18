package t2.atividade3;

public class PagamentoStrategy {

    private PagamentoStrategyInterface tipoPagamento;

    public float pagar(float valor) {
        return this.tipoPagamento.calcularPagamento(valor);
    }

    public PagamentoStrategy setTipoPagamento(PagamentoStrategyInterface tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
        return this;
    }
}
