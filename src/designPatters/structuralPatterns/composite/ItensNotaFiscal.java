package designPatters.structuralPatterns.composite;

import java.util.ArrayList;

public class ItensNotaFiscal implements ComponenteNotaFiscal {
    private ArrayList<String> itens;
    private String descricao;

    public ItensNotaFiscal(ArrayList<String> itens, String descricao) {
        this.itens = itens;
        this.descricao = descricao;
    }

    @Override
    public void mostrar() {
        System.out.println("Descrição: " + descricao);

    }
}
