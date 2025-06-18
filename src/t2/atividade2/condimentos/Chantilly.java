package t2.atividade2.condimentos;

import t2.atividade2.Bebida;
import t2.atividade2.CondimentoDecorator;

public class Chantilly extends CondimentoDecorator {

    public Chantilly(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Chantilly";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 3.00;
    }
}
