package t2.ativade1;

import java.util.ArrayList;

public class Diretorio implements ComponenteSistemaArquivos{
    private String nomeDiretorio;
    private ArrayList<ComponenteSistemaArquivos> arquivos;

    public Diretorio(String nomeDiretorio) {
        this.nomeDiretorio = nomeDiretorio;
        this.arquivos = new ArrayList<ComponenteSistemaArquivos>();
    }

    public void adicionarArquivo(ComponenteSistemaArquivos arquivo) {
        arquivos.add(arquivo);
    }

    public void removerArquivo(ComponenteSistemaArquivos arquivo) {
        arquivos.remove(arquivo);
    }

    @Override
    public void listar(String indentacao) {
        System.out.printf("%s       - Diretorio: %s (%d bytes)\n"
                            , indentacao, nomeDiretorio, obterTamanhoBytes());
        for (ComponenteSistemaArquivos arquivo : arquivos) {
            arquivo.listar(indentacao + "   ");
        };
    }

    @Override
    public long obterTamanhoBytes() {
        long tamanhoDiretorio = 0;
        for (ComponenteSistemaArquivos arquivo : arquivos) {
            tamanhoDiretorio += arquivo.obterTamanhoBytes();
        }
        return tamanhoDiretorio;
    }
}
