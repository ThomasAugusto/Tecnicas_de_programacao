package t2.atividade2;

public class Expresso implements Bebida{

    @Override
    public String getDescricao() {
        return "Café expresso";
    }

    @Override
    public double getCusto() {
        return 4.00;
    }
}
