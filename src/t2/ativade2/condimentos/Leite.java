package t2.ativade2.condimentos;

import t2.ativade2.Bebida;
import t2.ativade2.CondimentoDecorator;

public class Leite extends CondimentoDecorator {

    public Leite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Leite";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 2.00;
    }
}
