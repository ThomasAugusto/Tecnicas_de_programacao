package t2.atividade2;

public class cafeNormal implements Bebida{
    @Override
    public String getDescricao() {
        return "Café Normal";
    }

    @Override
    public double getCusto() {
        return 3.00;
    }
}
