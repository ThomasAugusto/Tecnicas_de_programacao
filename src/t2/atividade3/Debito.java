package t2.atividade3;

public class Debito implements PagamentoStrategyInterface {
    @Override
    public float calcularPagamento(float valor) {
        float TAXA_ACRESCIMO_DEBITO = 0.02f; //2%
        return valor + (valor * TAXA_ACRESCIMO_DEBITO);
    }
}
