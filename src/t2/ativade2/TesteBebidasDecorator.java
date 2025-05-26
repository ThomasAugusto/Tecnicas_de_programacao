package t2.ativade2;

import t2.ativade2.condimentos.Chantilly;
import t2.ativade2.condimentos.Chocolate;
import t2.ativade2.condimentos.Leite;

public class TesteBebidasDecorator {
    public static void main(String[] args) {

        Bebida pingado = new cafeNormal();
        pingado = new Leite(pingado);

        Bebida cappuccinoComChantilly = new Cappuccino();
        cappuccinoComChantilly = new Chantilly(cappuccinoComChantilly);

        Bebida personalizada = new Expresso();
        personalizada = new Leite(personalizada);
        personalizada = new Chocolate(personalizada);

        System.out.println(pingado.getDescricao() + " - R$" + pingado.getCusto());
        System.out.println(cappuccinoComChantilly.getDescricao() + " - R$" + cappuccinoComChantilly.getCusto());
        System.out.println(personalizada.getDescricao() + " - R$" + personalizada.getCusto());
    }
}
