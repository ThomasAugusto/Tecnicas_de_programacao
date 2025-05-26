package designPatters.structuralPatterns.composite;

import java.util.ArrayList;

public class NotaFiscal implements ComponenteNotaFiscal{
    private ArrayList<ComponenteNotaFiscal> linhas;

    public NotaFiscal() {
        this.linhas = new ArrayList<ComponenteNotaFiscal>();
    }

    public void AdicionarLinha(ComponenteNotaFiscal item) {
        this.linhas.add(item);
    }

    public void removerLinha(ComponenteNotaFiscal item) {
        this.linhas.remove(item);
    }

    @Override
    public void mostrar() {
        System.out.println("---------------");
        for (ComponenteNotaFiscal linha : linhas) {
            linha.mostrar();
        }
        System.out.println("---------------");

    }
}
