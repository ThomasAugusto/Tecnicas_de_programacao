package t2.ativade3;

public class Credito implements PagamentoStrategyInterface {
    @Override
    public float calcularPagamento(float valor) {
        float TAXA_ACRESCIMO_CREDIDO = 0.05f; //5%
        return valor + (valor * TAXA_ACRESCIMO_CREDIDO);
    }
}
