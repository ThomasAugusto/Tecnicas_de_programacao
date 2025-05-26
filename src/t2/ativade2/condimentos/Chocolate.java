package t2.ativade2.condimentos;

import t2.ativade2.Bebida;
import t2.ativade2.CondimentoDecorator;

public class Chocolate extends CondimentoDecorator {

    public Chocolate(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Chocolate";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 2.50;
    }
}
