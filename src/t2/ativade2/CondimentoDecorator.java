package t2.ativade2;

public abstract class CondimentoDecorator implements Bebida{
    protected Bebida bebidaDecorada;

    public CondimentoDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao();
    }

    @Override
    public double getCusto() {
        return bebidaDecorada.getCusto();
    }
}
